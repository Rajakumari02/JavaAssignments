package Assignment18_LibaryManagement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")
    @JsonBackReference
    private Author author;

    @ManyToMany(mappedBy = "borrowedBooks")
    @JsonBackReference
    private Set<Member> borrowed;

    public Book() {
    }

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Member> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Set<Member> borrowed) {
        this.borrowed = borrowed;
    }
}
