import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    numbers.put("Third", 3);
    System.out.println("HashMap: " + numbers);

    // return the value of key Second
    int value = numbers.get("Second");

    // update the value
    value = value * value;

    // insert the updated value to the HashMap
    numbers.put("Second", value);
    System.out.println("HashMap with updated value: " + numbers);
  }
}
///////////////////////////////////////

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    System.out.println("HashMap: " + numbers);

    // update the value of Second
    // Using computeIfPresent()
    numbers.computeIfPresent("Second", (key, oldValue) -> oldValue * 2);
    System.out.println("HashMap with updated value: " + numbers);

  }
}
/////////////////////////////////
import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    System.out.println("HashMap: " + numbers);

    // update the value of First
    // Using the merge() method
    numbers.merge("First", 4, (oldValue, newValue) -> oldValue + newValue);
    System.out.println("HashMap with updated value: " + numbers);
  }
}