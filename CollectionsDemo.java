package collectionf;
import java.util.*;
//sorting the elements of list using Colections.sort(List l)
class CollectionsDemo
{   
 public static void main(String[] args)
 {
  ArrayList l = new ArrayList();
  l.add("Z");
  l.add("A");
  l.add("K");
  l.add("N");
  //l.add(new Integer(10)); //ClassCastException while sort method will be called
  //l.add(null); //NullPointerexception at RE while sort method will be called
  System.out.println("Before Sorting: "+l);

 // to sort elements of list According to natural sorting order. 
  Collections.sort(l);
  System.out.println("After Natural Sorting: "+l);
  
// to sort elements of list According to customized sorting order.
   Collections.sort(l,new MyComparator());
   System.out.println("After Customized Sorting: "+l);
   
 } 
   
}

class MyComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
 { 
  String s1 = (String) obj1;
  String s2 = obj2.toString();
  return s2.compareTo(s1);
 }
}
