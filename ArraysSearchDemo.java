package collectionf;
import static java.util.Arrays.*;
import java.util.*;
/**sorting array using Arrays.binarySearch() methods.
  *Arrays.binarySearch(Primitive []p, primitive target);
  *Arrays.binarySearch(Object []o, Object target);
  *Arrays.binarySearch(Object []o, Object target, Comparator c);
  */

class ArraysSearchDemo
{
 public static void main(String[] args)
 {
  //primitive Array
  int[] a = {10,8,33,0, 11,6};
  Arrays.sort(a); //sort by natural order
  System.out.println(Arrays.binarySearch(a,0)); //0
  System.out.println(Arrays.binarySearch(a,35)); //-7
  
 //Object array
  String[] s  = {"A","Z","B"};
  Arrays.sort(s);
  System.out.println(binarySearch(s,"Z")); //2
  System.out.println(binarySearch(s,"a")); //-4
  

 //object array searching by comparator
  Arrays.sort(s,new MyComparator());
  System.out.println(binarySearch(s,"A",new MyComparator())); //2
  System.out.println(binarySearch(s,"K",new MyComparator())); //-2  System.out.println(binarySearch(s,"A")); //unpredictable o/p
  
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
