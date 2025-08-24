package Assignment7_1_CustomException;

class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}
class ATM {
     private static final String validPin="1234";
     public void validatePin(String enteredPin) throws InvalidPINException{
         if(enteredPin.length()!=4){
             throw new InvalidPINException("PIN must be exactly 4 digits");
         }
         if(!enteredPin.equals(validPin)){
             throw new InvalidPINException("Incorrect PIN");
         }
         if(enteredPin.equals(validPin)){
             System.out.println("Access Granted.Welcome!");
         }
         }
     }

