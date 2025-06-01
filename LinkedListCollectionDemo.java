package collectionf;
import java.util.*;
class LinkedListCollectionDemo
{
 public static void main(String[] args)
 {
  //LinkedList<String> ll = new LinkedList<String>();
    LinkedList ll = new LinkedList();
    ll.add(12);
    ll.add("Ashok");
    ll.addFirst("deep");
    ll.addLast(56);
    ll.add(null);
    System.out.println(ll);
    ll.set(0,"software"); //replace with "deep"
    System.out.println(ll);
    ll.set(0,"Venkey");   //replace with "software"
    System.out.println(ll);
    ll.removeLast();   
    System.out.println(ll);
    ll.addFirst("tushar");
    System.out.println(ll);
 }
}
