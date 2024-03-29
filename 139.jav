class LinkedList {

  // create an object of Node class
  // represent the head of the linked list
  Node head;

  // static inner class
  static class Node {
    int value;

    // connect each node to next node
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {

    // create an object of LinkedList
    LinkedList linkedList = new LinkedList();

    // assign values to each linked list node
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    // connect each node of linked list to next node
    linkedList.head.next = second;
    second.next = third;

    // printing node-value
    System.out.print("LinkedList: ");
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}


/////////////////
import java.util.LinkedList;

class Main {
  public static void main(String[] args){

    // create a linked list using the LinkedList class
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");

    // add element at the beginning of linked list
    animals.addFirst("Cat");

    // add element at the end of linked list
    animals.addLast("Horse");
    System.out.println("LinkedList: " + animals);

    // access first element
    System.out.println("First Element: " + animals.getFirst());

    // access last element
    System.out.println("Last Element: " + animals.getLast());
    }
}