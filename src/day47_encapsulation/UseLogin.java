package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234"; // can't access private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

//        System.out.println(obj.username); can't access, because they are private

        System.out.println(obj.getPassword());
        System.out.println(obj.getUsername());

        obj.setPassword("james0007bond");
        System.out.println(obj.getPassword());
    }
}
