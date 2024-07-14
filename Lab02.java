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
    testList.insert("First");
    testList.insert("Second");
    testList.insert("Third");
    testList.insert("Second"); //check to see insert ignores if x is already in list
    testList.delete("Four"); //check to see delete ignores if x is not in list
    testList.delete("Second");
    testList.printList();
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
  MyNode head = null; //creates and sets head node to null

  /*Creates a new node with x as data and adds it to the front of the linked list: Runtime O(1) since operation # stays the same no matter size n*/
  public static void insert(Object x)
  {
    if (lookup(x) == True) //checks to see if value already exists inside the linked list
    {
      return; //if value is in list, do not insert the value into the list
    }
    MyNode newNode = new MyNode(); //makes new node
    NewNode.data = x; //set that data in new node to x
    NewNode.next = head; //have next in new node point to next element in linked list (null if end)
    head = newNode; //set head to first element in the linked list
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

  /*Implements a delete function that deletes the value if it is in the linked list*/
  public static void delete(Object x)
  {
    if (lookup(x) == False) //checks to see if value is inside the linked list
    {
      return; //if value is not in list, returns (does nothing) 
    }
    MyNode delNode = head; //temporary holder for current node
    MyNode prevNode = null; // To keep track of the previous node

    // Iterate through the linked list
    while (delNode != null) 
    {
      // If the current node equals x, remove this node
      if (delNode.data.equals(x)) 
      {
        // First node case
        if (prevNode == null) 
        {
          head = delNode.next; //Move the head to the next node
        } 
        else 
        {
          prevNode.next = delNode.next; //Link previous node with next node
        }
        return; // Node deleted, exit the method
      }
    // Move to the next node
    prevNode = delNode;
    delNode = delNode.next;
    }
  }
}
