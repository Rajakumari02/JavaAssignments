package Assignment18_LibaryManagement;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}