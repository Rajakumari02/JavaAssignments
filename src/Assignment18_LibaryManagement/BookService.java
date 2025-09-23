package Assignment18_LibaryManagement;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepo bookRepo;
    private MemberRepo memberRepo;

    @Autowired
    public BookService(BookRepo bookRepo, MemberRepo memberRepo) {
        this.bookRepo = bookRepo;
        this.memberRepo = memberRepo;
    }

    public void borrowBook(Integer memberId, Integer bookId) throws BookNotFoundException , ExpiredMembershipException,BorrowingLimitExceededException,DuplicateBorrowException{
        Member member = memberRepo.findById(memberId)
                .orElseThrow(() -> new RuntimeException("Member is not found"));

        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book is not found"));

        if (member.getMembershipCard().getExpiryDate().isBefore(LocalDate.now())) {
            throw new ExpiredMembershipException("Membership card is expired");
        }

        if (book.getBorrowed().size() >= 5) {
            throw new BorrowingLimitExceededException("Book was already borrowed by 5 members");
        }

        if (member.getBorrowedBooks().contains(book)) {
            throw new DuplicateBorrowException("Member already borrowed this book");
        }

        member.getBorrowedBooks().add(book);
        book.getBorrowed().add(member);

        memberRepo.save(member);
        bookRepo.save(book);
    }


    public void returnBook(Integer memberId, Integer bookId) throws BookNotFoundException {
        Member member = memberRepo.findById(memberId).orElseThrow(() -> new RuntimeException("Member not found"));
        Book book = bookRepo.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book not found"));
        member.getBorrowedBooks().remove(book);
        book.getBorrowed().remove(member);
        memberRepo.save(member);
        bookRepo.save(book);
    }
}
