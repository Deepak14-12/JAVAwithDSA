//write a program to insert StringBuffer object onto the TreeSet where the sorting order is reverse of alphabetical order.

package collectionf;
import java.util.*;
class TreeSetDemoSB
{
 public static void main(String[] args)
 {
   TreeSet t = new TreeSet(new MyComparatorS());
   t.add(new StringBuffer("kartikey"));
   t.add(new StringBuffer("vinesh"));
   t.add(new StringBuffer("deepak"));
   t.add(new StringBuffer("vikesh"));
   t.add(new StringBuffer("divya3"));
  System.out.println(t);
 }
}

class MyComparatorSB implements Comparator
{
 public int compare(Object obj1 , Object obj2)
 {
  String s1 = obj1.toString();
  String s2 = obj2.toString(); //applicable for all SBr,SBf, and Strings 
 
 //returning descending order
    return -s1.compareTo(s2);
 // return s2.compareTo(s1); both statements returns same order
 }
}
