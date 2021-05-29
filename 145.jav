import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    // Using for loop
    System.out.println("Iterating over ArrayList using for loop: ");

    for(int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i));
      System.out.print(", ");
    }
  }
}

/////////////////////

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

        // Using forEach loop
    System.out.println("Iterating over ArrayList using for-each loop:");
    for(String language : languages) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}


/////////////////////////////////

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
  public static void main(String[] args) {
    // Creating an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(2);
    System.out.println("ArrayList: " + numbers);

    // Creating an instance of ListIterator
    ListIterator<Integer> iterate = numbers.listIterator();
    System.out.println("Iterating over ArrayList:");
    while(iterate.hasNext()) {
      System.out.print(iterate.next() + ", ");
    }
  }
}