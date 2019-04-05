package genericlists;

import java.util.ArrayList;

public class ShallowClone {

  public static void main(String[] args) {
    // make cloning easier by typing the variables by the class
    // instead of the interface
    
    ArrayList<User> users1 = new ArrayList<>();
    
    users1.add(new User("John", 23));
    users1.add(new User("Mary", 24));
    users1.add(new User("Dave", 25));
    
    ArrayList<User> users2;

    // shallow copy vs. clone
    //users2 = users1;
    users2 = (ArrayList<User>) users1.clone();
    
    System.out.println("=> users2 is a clone of users1");
    System.out.println("users1 = " + users1);
    System.out.println("users2 = " + users2);
    System.out.println("");
    
    users2.set(0, new User("Alice",44));
    System.out.println("=> replace users2, element 0: users1 unaffected");
    
    System.out.println("users1 = " + users1);
    System.out.println("users2 = " + users2);
    System.out.println("");
    
    System.out.println("=> change age of users2, element 2: users1 affected");
    users2.get(2).setAge(77);
    
    System.out.println("users1 = " + users1);
    System.out.println("users2 = " + users2);
  }
  
}
