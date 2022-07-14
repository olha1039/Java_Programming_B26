package day58_exceptions.bank;

public class InvalidCredentialException extends Exception {
    // this is a checked exception because the parent is the Exception class

    public InvalidCredentialException(String msg){
        super(msg);
    }
}
