import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create first set
    Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

    // create second set
    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Even Numbers: " + evenNumbers);

    // Intersection of two sets
    evenNumbers.retainAll(primeNumbers);
    System.out.println("Intersection: " + evenNumbers);
  }
}
////////////////////////////////
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<String> backend = new HashSet<>();
    backend.add("Java");
    backend.add("JavaScript");
    System.out.println("Backend Languages: " + backend);

    // create second set
    Set<String> frontend = new HashSet<>();
    frontend.add("JavaScript");
    frontend.add("CSS");
    System.out.println("Frontend Languages: " + frontend);

    Set<String> intersect = Sets.intersection(backend, frontend);
    System.out.println("Common Languages: " + intersect);
  }
}