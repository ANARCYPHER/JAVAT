import java.util.ArrayList;
import java.util.ListIterator;

class Main {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // Creating an object of ListIterator
    ListIterator<String> listIterate = languages.listIterator();
    listIterate.add("Java");
    listIterate.add("Python");

    System.out.println("LinkedList: " + languages);
  }
}