package Assignment18_LibaryManagement;
public class ExpiredMembershipException extends Exception {
    public ExpiredMembershipException(String message) {
        super(message);
    }
}