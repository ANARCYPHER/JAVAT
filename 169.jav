import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Kotlin");
    System.out.println("LinkedList: " + languages);

    // remove elements from index 1
    String str = languages.remove(3);
    System.out.println("Removed Element: " + str);

    System.out.println("Updated LinkedList: " + languages);
  }
}
////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        ArrayList<String> animals= new ArrayList<>();

        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        // creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.next();

        // चemove element returned by next()
        listIterate.remove();
        System.out.println("New LinkedList: " + animals);
    }
}
///////////////////////////////////////////////////////////
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("LinkedList: " + languages);

    // remove all the elements
    languages.clear();
    System.out.println("LinkedList after clear(): " + languages);
  }
}
//////////////////////////////////////////////////////////
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<Integer> numbers = new LinkedList<>();

    // add elements in LinkedList
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    System.out.println("LinkedList: " + numbers);

    // remove all elements less than 4
    numbers.removeIf((Integer i) -> i < 4);
    System.out.println("Updated LinkedList: " + numbers);

  }
}