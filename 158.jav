import java.util.ArrayList;

class Main {

  public static void display(ArrayList<String> languages) {

    System.out.print("ArrayList: ");
    for(String language : languages) {
      System.out.print(language + ", ");
    }
  }
  public static void main(String[] args) {

    // create an arraylist
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    // passing arraylist as function parameter
    display(languages);
  }
}
//////////////////

import java.util.ArrayList;

class Main {

  public static void percentage(Integer[] marks) {
    int totalMarks = 300;
    int obtainedMarks = 0;
    for(int mark : marks) {
      obtainedMarks += mark;
    }

    // compute average
    double percent = (obtainedMarks * 100) / totalMarks;
    System.out.println("Percentage: " + percent);
  }
  public static void main(String[] args) {

    // create an arraylist
    ArrayList<Integer> marks = new ArrayList<>();
    marks.add(67);
    marks.add(87);
    marks.add(56);
    System.out.println("Marks: " + marks);

    // passing arraylist as function parameter
    percentage(marks.toArray(new Integer[marks.size()]));
  }
}