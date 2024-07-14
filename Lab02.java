/*
*Ethan Chang
*echang28@u.rochester.edu
*
*Partner: Darron King
*
*07/14/2024: Creating Linked List and Functions
*/

/*testing*/
public class Lab02 
{
  public static void main(String[] args) 
  {
    LinkedListImp testlist = new LinkedListImp(); //create linked list
    //Insert values into the linked list then print
    myList.insert("First");
    myList.insert("Second");
    myList.insert("Third");
    myList.printList();
  }
}

/*Node MyNode definition*/
public class MyNode 
{
  public Object data ;
  public MyNode next;
}

public interface MyLinkedList 
{
  public void insert(Object x);
  public void insertFirst(Object x);
  public void insertLast(Object x);
  public void delete(Object x);
  public boolean lookup(Object x);
  public void printList();
} 

/*Implementation of methods in interface MyLinkedLIst*/
public class LinkedListImp implements MyLinkedList 
{
  private MyNode head = null; //creates and sets head node to null

  /*Creates a new node with x as data and adds it to the front of the linked list: Runtime O(1) since operation # stays the same no matter size n*/
  public static void insert(Object x)
  {
    MyNode newNode = new MyNode(); //makes new node
    NewNode.data = x; //set that data in new node to x
    NewNode.next = head; //have next in new node point to next element in linked list (null if end)
    head = newNode //set head to first element in the linked list
  }

  /*Iterates through linked list and prints each element: Runtime O(n) since it has to go through list of n elements*/
  public static void printList(Object x)
  {
    MyNode printNode = head; //temporary holder for current node to be printed
    while (head != null) //iterates through linked list until end
    {
      System.out.println(printNode.data); //print the data of current node
      printNode = printNode.next; //have the current node be the next node in linked list
    }
  }

  /*Implements a lookup function to find if a value is in the linked list*/
  public static boolean lookup(Object x)
  {
    MyNode lookNode = head; //temporary holder for current node to be looked at
    while (current != null) //iterates through linked list
    {
      if (lookNode.data.equals(x)) //if current node equal x, return true
      {
        return true;
      }
      lookNode = lookNode.next; //move to next node in list
    }
    return false; //return false if item was not found in array
  }
}
