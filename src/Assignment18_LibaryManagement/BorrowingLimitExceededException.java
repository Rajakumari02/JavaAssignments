package Assignment18_LibaryManagement;

public class BorrowingLimitExceededException extends Exception {
    public BorrowingLimitExceededException(String message) {
        super(message);
    }
}