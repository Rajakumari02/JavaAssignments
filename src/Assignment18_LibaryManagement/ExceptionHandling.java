package Assignment18_LibaryManagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.AccountNotFoundException;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<String> handleMemberNotFoundException(MemberNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidCardException.class)
    public ResponseEntity<String> handleInvalidCardException(InvalidCardException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<String> handleAuthorNotFoundException(AuthorNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<String> handleAccountNotFoundException(AccountNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleBookNotFoundException(BookNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BorrowingLimitExceededException.class)
    public ResponseEntity<String> handleBorrowingLimitExceededException(BorrowingLimitExceededException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DuplicateBorrowException.class)
    public ResponseEntity<String> handleDuplicateBorrowException(DuplicateBorrowException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ExpiredMembershipException.class)
    public ResponseEntity<String> handleExpiredMembershipException(ExpiredMembershipException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}