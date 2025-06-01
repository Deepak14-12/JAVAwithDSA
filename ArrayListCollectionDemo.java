package collectionf;
import java.util.*;
import java.io.*;
class ArrayListCollectionDemo
{
  public static void main(String[] args)
  {
    ArrayList l = new ArrayList();
//ArrayList<Integer> l = new ArrayList<>();  //new Arraylist<Integer>(); 
    l.add("A");
    l.add(10);
    l.add("A");
    l.add(null);
    System.out.println(l); //[A,10,A,null]
    l.remove(2);
    System.out.println(l); //[A,10,null]
    l.add(2,"M");
    l.add("N");
    System.out.println(l); //[A,10,M,null,N] 

   LinkedList ll = new LinkedList();   
    System.out.println(l instanceof Serializable ); //true
    System.out.println(ll instanceof Cloneable );  //true
    System.out.println(l instanceof RandomAccess);  //true
    System.out.println(ll instanceof RandomAccess);  //false    
  }
}
