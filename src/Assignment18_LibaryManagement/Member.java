package Assignment18_LibaryManagement;
import java.util.Set;
import java.util.HashSet;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="membership_id",referencedColumnName = "id")
    @JsonManagedReference
    private MembershipCard membershipCard;

    @ManyToMany
    @JoinTable(
            name = "member_book",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    @JsonManagedReference
    private Set<Book> borrowedBooks;

    public Member() {
    }

    public Member(String name, String email, MembershipCard membershipCard, Set<Book> borrowedBooks) {
        this.name = name;
        this.email = email;
        this.membershipCard = membershipCard;
        this.borrowedBooks = borrowedBooks;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MembershipCard getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(MembershipCard membershipCard) {
        this.membershipCard = membershipCard;
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

}