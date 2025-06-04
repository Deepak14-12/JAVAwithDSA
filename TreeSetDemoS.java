//write a program to insert String object onto the TreeSet where the sorting order is reverse of alphabetical order.
package collectionf;
import java.util.*;
class TreeSetDemoS
{
 public static void main(String[] args)
 {
   TreeSet t = new TreeSet(new MyComparatorS());
   t.add("kartikey");
   t.add("vinesh");
   t.add("vikesh");
   t.add("divya");
   t.add("deepak");
System.out.println(t);
 }
}

class MyComparatorS implements Comparator
{
 public int compare(Object obj1 , Object obj2)
 {
  String s1 = (String) obj1; //typecasting applicable only for internal strings 
  String s2 = obj2.toString(); //applicable for all SBr,SBf, and Strings 
  //returning descending order
    return -s1.compareTo(s2);
 // return s2.compareTo(s1); both statements returns same order
 }
}
