package collectionf;
import java.util.*;
class ListIteratorDemo
{
 public static void main(String[] args)
 {
  LinkedList<String> ll = new LinkedList<>();
  ll.add("deepak");
  ll.add("tushar");
  ll.add("trisha");
  ll.add("harshu");
  ll.add("yaadu");
  ll.add("maanu");
  System.out.println(ll);
  
  ListIterator itr = ll.listIterator();
  while(itr.hasNext())
  {
    String s = (String) itr.next();

    if(s.equals("trisha"))
      itr.remove();
    else if(s.equals("deepak"))
      itr.add("manish");
    else if(s.equals("yaadu"))
      itr.set("yaadvi"); 
  }
  System.out.println(ll);
    System.out.println(itr.getClass().getName()); //get class name of itr object
 }
}
