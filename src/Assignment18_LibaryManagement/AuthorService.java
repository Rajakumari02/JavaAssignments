package Assignment18_LibaryManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public AuthorService(AuthorRepo authorRepo, BookRepo bookRepository) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepository;
    }

    public Author registerNewAuthor (Author newauthor){
        return authorRepo.save(newauthor);
    }

    public Book addBooksToAuthor(Integer authorId, Book book) throws AuthorNotFoundException , BookAlreadyExistsException {
        Author author = authorRepo.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found"));
        if (bookRepo.existsByIsbnAndAuthorId(book.getIsbn(), authorId)) {
            throw new BookAlreadyExistsException("Book with ISBN " + book.getIsbn() + " already exists for author");
        }
        book.setAuthor(author);
        bookRepo.save(book);
        return book;
    }

    public List<Book> findAllBooksByAuthor(Integer authorId) throws AuthorNotFoundException{
        Author author = authorRepo.findById(authorId).orElseThrow(() -> new AuthorNotFoundException("Author Not found"));
        return author.getBooks();
    }
}