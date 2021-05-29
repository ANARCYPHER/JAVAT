import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages= new LinkedList<>();

    // Add elements in the linked list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // Create a new array of String type
    String[] arr = new String[languages.size()];

    // Convert LinkedList into the string array
    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
  }
}

///////////////////////////

import java.util.Arrays;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {

    // create an array
    String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

    // convert array to a linked list
    LinkedList<String> languages= new LinkedList<>(Arrays.asList(array));

    System.out.println("LinkedList: " + languages);

  }
}