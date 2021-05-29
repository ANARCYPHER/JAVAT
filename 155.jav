import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create first set
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Numbers: " + numbers);

    // create second set
    Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

    // Difference between HashSet1 and HashSet2
    numbers.removeAll(primeNumbers);
    System.out.println("Numbers without prime numbers: " + numbers);
    }
}
////////////////////
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<String> languages1 = new HashSet<>();
    languages1.add("Java");
    languages1.add("JavaScript");
    languages1.add("English");
    languages1.add("Spanish");
    System.out.println("Languages: " + languages1);

    // create second set
    Set<String> languages2 = new HashSet<>();
    languages2.add("English");
    languages2.add("Spanish");
    System.out.println("Human Languages: " + languages2);

    Set<String> intersect = Sets.difference(languages1, languages2);
    System.out.println("Programming Languages: " + intersect);
  }
}