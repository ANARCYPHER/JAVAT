import java.util.HashMap;
import java.util.Map.Entry;

class Main {
  public static void main(String[] args) {

    // Creating a HashMap
    HashMap<String, String> languages = new HashMap<>();
    languages.put("Java", "Enterprise");
    languages.put("Python", "ML/AI");
    languages.put("JavaScript", "Frontend");
    System.out.println("HashMap: " + languages);

    // iterating through key/value mappings
    System.out.print("Entries: ");
    for(Entry<String, String> entry: languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }

    // iterating through keys
    System.out.print("\nKeys: ");
    for(String key: languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }

    // iterating through values
    System.out.print("\nValues: ");
    for(String value: languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }
  }
}
///////////////////////////////

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Main {
  public static void main(String[] args) {
    // create a HashMap
    HashMap<String, String> languages = new HashMap<>();
    languages.put("Java", "Enterprise");
    languages.put("Python", "ML/AI");
    languages.put("JavaScript", "Frontend");
    System.out.println("HashMap: " + languages);

    // create an object of Iterator
    Iterator<Entry<String, String>> iterate1 = languages.entrySet().iterator();

    // iterate through key/value mappings
    System.out.print("Entries: ");
    while(iterate1.hasNext()) {
      System.out.print(iterate1.next());
      System.out.print(", ");
    }

    // iterate through keys
    Iterator<String> iterate2 = languages.keySet().iterator();
    System.out.print("\nKeys: ");
    while(iterate2.hasNext()) {
      System.out.print(iterate2.next());
      System.out.print(", ");
    }

    // iterate through values
    Iterator<String> iterate3 = languages.values().iterator();
    System.out.print("\nValues: ");
    while(iterate3.hasNext()) {
      System.out.print(iterate3.next());
      System.out.print(", ");
    }
  }
}