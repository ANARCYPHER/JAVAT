import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Set1: " + evenNumbers);

    // create second set
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(3);
    System.out.println("Set2: " + numbers);

    // Union of two sets
    numbers.addAll(evenNumbers);
    System.out.println("Union is: " + numbers);
  }
}
////////////////////////////////
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<String> languages1 = new HashSet<>();
    languages1.add("Java");
    languages1.add("Python");
    System.out.println("Programming Languages: " + languages1);

    // create second set
    Set<String> languages2 = new HashSet<>();
    languages2.add("English");
    languages2.add("Spanish");
    System.out.println("Human Language: " + languages2);

    Set<String> unionSet = Sets.union(languages1, languages2);
    System.out.println("Union is: " + unionSet);
  }
}