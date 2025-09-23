package Assignment18_LibaryManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorRepo authorRepo;
    private BookRepo bookRepo;
    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorRepo authorRepo, BookRepo bookRepo, AuthorService authorService) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.authorService = authorService;
    }

    @PostMapping
    public Author addNewAuthor(@RequestBody Author author) {
        return authorService.registerNewAuthor(author);
    }

    @PostMapping("/{id}/books")
    public Book addBookToAuthor(@RequestBody Book book, @PathVariable Integer id) throws AuthorNotFoundException, BookAlreadyExistsException {
        return authorService.addBooksToAuthor(id,book);

    }

    @GetMapping("/{id}/books")
    public List<Book> getBooksFromAuthor(@PathVariable Integer id) throws AuthorNotFoundException {
        return authorService.findAllBooksByAuthor(id);
    }


}