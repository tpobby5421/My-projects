import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // creating array list of strings
    ArrayList<String> Stringlist = new ArrayList<String>();
    // adding elements to array list
    Stringlist.add("Fries");
    Stringlist.add("Burger");
    Stringlist.add("Pizza");
    Stringlist.add("Sandwich");
    // creating array list of integers
    ArrayList<Integer> Integerlist = new ArrayList<Integer>();
    // adding elements to array list
    Integerlist.add(1);
    Integerlist.add(2);
    Integerlist.add(3);
    Integerlist.add(4);
    // printing array list
    Collections.sort(Stringlist);
    Stringlist.contains("Pizza");
    System.out.println(Stringlist);
    System.out.println(Integerlist.contains(2));
    Integerlist.forEach(System.out::println);
  }
}