/**write a program to insert String and StringBuffer objects onto the TreeSet     *where the sorting order is increasing length order. 
*if 2 objects having same length then consider their alphabetical order.
*/
package collectionf;
import java.util.*;
class TreeSetDemoSSB
{
 public static void main(String[] args)
 {
   TreeSet t = new TreeSet(new MyComparatorSSB());
   t.add(new StringBuffer("kartikey"));
   t.add(new StringBuffer("vinesh"));
   t.add("AA");
   t.add("BB");
   t.add("ABC");
  System.out.println(t);
 }
}

class MyComparatorSSB implements Comparator
{
 public int compare(Object obj1 , Object obj2)
 {
  String s1 = obj1.toString();
  String s2 = obj2.toString();  
  int l1 = s1.length();
  int l2 = s2.length();
 
  if(l1<l2) 
    return -1;
  else if(l1>l2)
    return 1;
  else 
    return s1.compareTo(s2);
 //return 0; //considers same length string duplicates
 }
}
