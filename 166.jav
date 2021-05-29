class Test {

  // private variables
  private int age;
  private String name;

  // initialize age
  public void setAge(int age) {
    this.age = age;
  }

  // initialize name
  public void setName(String name) {
    this.name = name;
  }

  // access age
  public int getAge() {
    return this.age;
  }

  // access name
  public String getName() {
    return this.name;
  }

}

class Main {
  public static void main(String[] args) {
    // create an object of Test
    Test test = new Test();

    // set value of private variables
    test.setAge(24);
    test.setName("Programiz");

    // get value of private variables
    System.out.println("Age: " + test.getAge());
    System.out.println("Name: " + test.getName());
  }
}
/////////////////////////////////////
import java.lang.reflect.*;

class Test {

  // private variables
  private String name;

  // private method
  private void display() {
    System.out.println("The name is " + name);
  }

}

class Main {
  public static void main(String[] args) {
    try {
      // create an object of Test
      Test test = new Test();

      // create an object of the class named Class
      Class obj = test.getClass();

      // access the private variable
      Field field = obj.getDeclaredField("name");
      // make private field accessible
      field.setAccessible(true);

      // set value of field
      field.set(test, "Programiz");

      // get value of field
      // and convert it in string
      String value = (String)field.get(test);
      System.out.println("Name: " + value);

      // access the private method
      Method[] methods = obj.getDeclaredMethods();
      System.out.println("Method Name: " + methods[0].getName());
      int modifier = methods[0].getModifiers();
      System.out.println("Access Modifier: " + Modifier.toString(modifier));

    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}