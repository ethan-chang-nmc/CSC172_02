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

public class MyLinkedListImpl implements MyLinkedList 
{
  private MyNode head = null;
  public void insert(Object x)
  {
  }
}
