package Assignment18_LibaryManagement;
public class BookAlreadyExistsException extends Exception {
    public BookAlreadyExistsException(String message) {
        super(message);
    }
}