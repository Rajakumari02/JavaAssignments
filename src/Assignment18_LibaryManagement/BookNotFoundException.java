package Assignment18_LibaryManagement;
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}