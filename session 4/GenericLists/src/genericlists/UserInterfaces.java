package genericlists;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public class UserInterfaces {
  public static void main(String[] args) {

    // test users
    User jill = new User("Jill", 39);
    User john = new User("John", 39);

    // first test simple equality
    System.out.println("both tests must say true for Users to work in lists");
    
    System.out.printf("=> (Jill,10).equals( %s )\n", jill);
    System.out.println( new User("Jill",10).equals(jill) );
    System.out.printf("=> (Jill,10).equals( (Object) %s )\n", jill);
    System.out.println( new User("Jill",10).equals((Object) jill) );
    System.out.println();

    // a collection of Users: cannot use positional operations
    Collection<User> users1 = new ArrayList<>();
    users1.add(new User("Jules", 20));
    users1.add(new User("Rose", 22));
    users1.add(new User("Jill", 30));
    users1.add(new User("Bradley", 51));
    users1.add(new User("Robert", 44));

    System.out.println("-------------------------------");
    System.out.println("Collection: users1 = " + users1);
    System.out.println("-------------------------------");

    User[] testUsers = { john, jill };
    
    for (User user : testUsers) {
      System.out.printf("users1.contains(%s)=%s\n", user, users1.contains(user));
      System.out.printf("users1.remove(%s)=%s\n", user, users1.remove(user));
      System.out.println("afterwards: " + users1);
      System.out.println();
    }

    // a List of Users: collection and positional ops both apply
    List<User> users2 = new ArrayList<>();

    users2.add(new User("Jim", 20));
    users2.add(new User("John", 23));
    users2.add(new User("Linda", 33));
    users2.add(new User("Bill", 34));
    users2.add(new User("Rose", 15));

    System.out.println("-------------------------------");
    System.out.println("List: users2 = " + users2);
    System.out.println("-------------------------------");
    
    for (User user : testUsers) {
      System.out.printf("users2.contains(%s)=%s\n", user, users2.contains(user));
      int pos = users2.indexOf(user);
      System.out.printf("users2.indexOf(%s)=%s\n", user, pos);
      
      if (pos >= 0) {
        users2.remove(pos);
        System.out.printf("after remove(%s): %s\n", pos, users2);
        System.out.println();
      }
    }
    System.out.println("-------------------------------");
  }
}
