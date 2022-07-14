package day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);

       // accountOne.withdraw(2000); uncomment this to see an exception
        try{
            accountOne.login("jamesbond", "007");
            } catch (InvalidCredentialException e){
            System.out.println(e.getMessage());
        }
        try{
            accountOne.login("jamesbd", "007");
        } catch (InvalidCredentialException e){
            System.out.println(e.getMessage());
        }
        try{
            accountOne.login("jamesbond", "08854");
        } catch (InvalidCredentialException e){
            System.out.println(e.getMessage());
        }
    }
}
