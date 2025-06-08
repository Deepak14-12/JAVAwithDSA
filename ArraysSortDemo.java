package collectionf;
import java.util.*;

/**sorting array using Arrays.sort() methods.
  *Arrays.Sort(Primitive []p);
  *Arrays.Sort(Object []o);
  *Arrays.Sort(Object []o, Comparator c);
  */

class ArraysSortDemo
{
 public static void main(String[] args)
 {
  //primitive Array
  int[] a = {10,8,33,0, 11,6};
  System.out.println("Primitive array before sorting: ");
  for(int a1 : a)
    System.out.println(a1);
   
  Arrays.sort(a);
  
  System.out.println("Primitive array after sorting: ");
  for(int a1 : a)
    System.out.println(a1);
  
 //Object array
  String[] s  = {"A","Z","B"};
  System.out.println("Object array before sorting: ");
  for(String s1 : s)
    System.out.println(s1);
   
  Arrays.sort(s);

  System.out.println("Object array after sorting: ");
  for(String s1 : s)
    System.out.println(s1);

 //object array sorting by comparator
  Arrays.sort(s,new MyComparator());
  System.out.println("Object array after sorting  by comparator: ");
  for(String s1 : s)
    System.out.println(s1);

 }
}
 
class MyComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
 {
  String s1 = obj1.toString();
  String s2 = obj2.toString();
  return s2.compareTo(s1);
 }
}
