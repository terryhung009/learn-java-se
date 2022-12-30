import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


//        String friend1 = "Mike";
//        String friend2 = "Grace";
//        String[] friends = {"Mike", "Grace" ,"Spencer" ,"Naleo", "Abigail"};
//        System.out.println(friends[friends.length-1]);

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Mike");
        friends.add("Grace");
        friends.add("Wilson");
        friends.add("Abigail");
        Collections.sort(friends);
        System.out.println(friends);
        friends.clear();
        System.out.println(friends.size());
//        System.out.println(friends.get(2));

    }
}
