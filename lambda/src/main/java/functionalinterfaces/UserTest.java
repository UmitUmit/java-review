package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("John","Emryasone", 29));
        users.add(User.builder().firstName("Tylor").lastName("Swift").age(40).build());
        users.add(User.builder().firstName("Shan").lastName("Eathee").age(50).build());
        users.add(User.builder().firstName("Halnur").lastName("Halmurat").age(3).build());
        users.add(User.builder().firstName("Zilnaz").lastName("Mijit").age(2).build());

        //Print all the elements in the list
        printName(users, p -> true);

        System.out.println("******************************");
        //Print all users that last name starts with E
       printName(users, user -> user.getLastName().startsWith("E"));//2nd param is the implementation of the method that belongs to the Predicate interface
    }


    private static void printName(List<User> users, Predicate<User> p){//right side param, we put interface
        for (User user : users){
           if (p.test(user)){
               System.out.println(user.toString());
            }
        }

    }

}
