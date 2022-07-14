package day00_Interview_practice.random.social_media;

import java.util.ArrayList;
import java.util.List;

public class Facebook extends SocialMedia{

   private int age;
   private int numberOfFriends;
   private List<Post> allPosts;
   private int numberOfGroups;

   static {
        platform = "Facebook";
   }

    public Facebook(String username, String password) {
       this.username = username;
       this.password = password;

       if(password.contains(username)){
           System.out.println("Password contained username. Default password created");
           password = "password";
       }
       personalURL = "facebook.com/" + username;

    }

    public Facebook(String username, String password, String fullName){
       this(username, password);
       this.fullName = fullName;
       if(!fullName.matches("[a-zA-Z]+")){
           System.out.println("invalid name");
           fullName = "no name";
        }
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }

        if (numberOfFriends > 0 && numberOfFriends <= 5000) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }
    }

    // stopped here. middle of page 3

    @Override
    public void directMessaging(String username, String message) {

    }

    @Override
    public void post(Object media) {

    }

    @Override
    public void notifications() {

    }
}
