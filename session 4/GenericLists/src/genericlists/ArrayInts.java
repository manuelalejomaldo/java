package genericlists;

import java.util.ArrayList;

public class ArrayInts {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    
    list.add(33);
    list.add(55);
    list.add(77);
    list.add(88);
    list.add(22);
    list.add(55);

    System.out.println("list = " + list);
    System.out.println("list.size() = " + list.size());
    System.out.println("");
    
    System.out.println("list.get(2) = " + list.get(2));
    
    int previous = list.set(2,99);
    System.out.println("previous value in position 2 = " + previous);
    System.out.println("after list.set(2,99), list = " + list);
    System.out.println("");
    
    System.out.println("list.indexOf(55)     = " + list.indexOf(55));
    System.out.println("list.lastIndexOf(55) = " + list.lastIndexOf(55));
    System.out.println("list.contains(55)    = " + list.contains(55));
    
    System.out.println("list.indexOf(11)     = " + list.indexOf(11));
    System.out.println("list.lastIndexOf(11) = " + list.lastIndexOf(11));
    System.out.println("list.contains(11)    = " + list.contains(11));
    System.out.println("");

    list.add(0, 22);
    System.out.println("after list.add(0,22), list = " + list);

    Integer removed = list.remove(4);
    System.out.println("list.remove(4) = " + removed);
    System.out.println("after remove(pos), list = " + list);
    System.out.println("");
    
    boolean wasIn;
    
    wasIn = list.remove((Integer) 55);
    System.out.println("55 was in the list = " + wasIn);
    System.out.println("after remove(55), list = " + list);
    
    wasIn = list.remove((Integer) 66);
    System.out.println("66 was in the list = " + wasIn);
    System.out.println("after remove(66), list = " + list);
    System.out.println("");
 
    // mistakes:
    // wasIn = list.remove(55);  // wrong return type
    // list.remove(55);          // wrong idea
    
    int sum;
    sum = 0;
    for(int n: list) {  // or, for(Integer n: list)
      sum += n;
    }
    System.out.println("sum(list) forward = " + sum);
    System.out.print("priting backward:");
    for(int i = list.size()-1; i >= 0; --i) {
      System.out.print(" " + list.get(i));
    }
    System.out.println("");
    System.out.println("");
    
    System.out.println("list is empty = " + list.isEmpty());
    list.clear();
    System.out.println("after list.clear(), list = " + list);
    System.out.println("list is empty = " + list.isEmpty());
  }
}
