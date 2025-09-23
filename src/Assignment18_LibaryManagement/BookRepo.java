package Assignment18_LibaryManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    boolean existsByIsbnAndAuthorId(String isbn, Integer authorId);

}