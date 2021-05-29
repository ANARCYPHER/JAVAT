import java.util.Set;
import java.util.HashSet;


class Main {
  public static void main(String[] args) {
    // Creating an set
    Set<String> languages = new HashSet<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("Set: " + languages);

    // Using forEach loop
    System.out.println("Iterating over Set using for-each loop:");
    for(String language : languages) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}
///////////////////////////////////
import java.util.Set;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    // create an Set
    Set<Integer> numbers = new HashSet<>();

    // add elements to the HashSet
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Set: " + numbers);

    // iterate each element of the set
    System.out.print("Element of Set: ");

    // access each element using forEach() method
    // pass lambda expression to forEach()
    numbers.forEach((e) -> {
      System.out.print(e + " ");
    });
  }
}