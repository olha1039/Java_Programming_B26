package day58_exceptions.bank;

public class Bank {

    double balance;

    public void withdraw(double amountToTakeOut) {

        if (amountToTakeOut > balance) {
//                NotEnoughMoneyException e = new NotEnoughMoneyException(); possible to do this, but the way below used more often
//                throw e;
            throw new NotEnoughMoneyException("Balance only has " + balance);
        }
        balance -= amountToTakeOut;
    }

    // in this method we throw checked exceptions, so they must be handled, but we created the clsss, so we don't want to handle it. We use throws to allow the program to compile so the user of the class handles the exceptions

    public void login(String username, String password) throws InvalidCredentialException{
        if(!username.equals("jamesbond")){
            throw new InvalidCredentialException("Invalid username");
        }

        if(!password.equals("007")){
            throw new InvalidCredentialException(("Invalid password"));
        }

        System.out.println("LOGIN");
    }
}
