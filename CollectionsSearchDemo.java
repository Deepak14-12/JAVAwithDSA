package collectionf;
import java.util.*;

/**Searching the element of list using 
  *Colections.binarySearch(List l, Object target); 
  *Colections.binarySearch(List l, Object target, Comparator c);
  */

class CollectionsSearchDemo
{   
 public static void main(String[] args)
 {
  ArrayList l = new ArrayList();
  l.add("Z");
  l.add("A");
  l.add("K");
  l.add("N");
  System.out.println("before sorting: "+l); //[Z,A,M,K,a]
 //list should be sorted before searching OtherWise will get unpreditable o/p
  Collections.sort(l); 
  System.out.println("after sorting: "+l); //[A,K,M,Z,a]

 //searching element without comparator 
  System.out.println("searching without comparator: ");
  System.out.println(Collections.binarySearch(l,"Z")); //3 index
  System.out.println(Collections.binarySearch(l,"J")); //-2 insertion point


 //searching element with comparator
  ArrayList<Integer> al= new ArrayList<>();
  al.add(15);
  al.add(0);
  al.add(20);
  al.add(10);
  al.add(5);
  
  System.out.println("searching with comparator: ");
  System.out.println("before sorting: "+al); //[15,0,20,10,5]
 
 //list should be sorted before searching OtherWise will get unpreditable o/p
 //for searching elements with comparator we have to -->
 //sort list using comparator before searching
  Collections.sort(al,new MyComparator());
  System.out.println("after sorting: "+al); //[20,15,10,5,0]
 
 //searching
  System.out.println(Collections.binarySearch(al,10,new MyComparator())); //2 index 
 System.out.println(Collections.binarySearch(al,13,new MyComparator())); //-3 insertion point
  System.out.println(Collections.binarySearch(al,17)); //-6 insertion point

 } 
   
}

class MyComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
 { 
  Integer i1 = (Integer) obj1;
  Integer i2 = (Integer) obj2;
  return i2.compareTo(i1);
 }
}
