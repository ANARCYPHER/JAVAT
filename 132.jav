// Java Program to implement String on switch statements in Java

class Main {
  public static void main(String[] args) {

    // create a string
    String language = "Java";

    switch(language) {

      case "Java":
        System.out.println(language + " is famous for enterprise applications.");
        break;

      case "JavaScript":
        System.out.println(language + " is famous for frontend and backend.");
        break;

      case "Python":
        System.out.println(language + " is famous for ML and AI.");
        break;

      default:
        System.out.println(language + " not found on record.");
        break;
    }
  }
}