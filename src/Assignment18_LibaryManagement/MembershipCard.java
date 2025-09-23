package Assignment18_LibaryManagement;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class MembershipCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cardNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    @OneToOne(mappedBy = "membershipCard", fetch = FetchType.LAZY)
    private Member member;

    public MembershipCard() {
    }

    public MembershipCard(Integer cardNumber, LocalDate issueDate, LocalDate expiryDate, Member member) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}