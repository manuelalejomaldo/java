package genericlists;

public class User {
  private final String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("(%s,%s)", name, age);
  }

  // user equality is based on name alone
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof User)) {
      return false;
    }
    User user = (User) obj;
    return name.equals( user.name );
  }
  
  // the overloaded version doesn't work!!
//  public boolean equals(User user) {
//    if (user == null) {
//      return false;
//    }
//    return name.equals( user.name );
//  }

}
