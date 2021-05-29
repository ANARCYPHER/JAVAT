import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Numbers: " + numbers);

    // create the second set
    Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

    // check if primeNumbers is a subset of numbers
    boolean result = numbers.containsAll(primeNumbers);
    System.out.println("Is Prime Numbers is subset of Numbers? " + result);
  }
}
///////////////////////////////////////////
import java.util.TreeSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create the first set
    Set<String> languages = new TreeSet<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    languages.add("CSS");
    System.out.println("Programming Languages: " + languages);

    // create the second set
    Set<String> frontend = new TreeSet<>();
    frontend.add("CSS");
    frontend.add("JavaScript");
    System.out.println("Frontend Languages: " + frontend);

    // check if frontend is a subset of languages
    boolean result = languages.containsAll(frontend);
    System.out.println("Is frontend is subset of languages? " + result);
  }
}