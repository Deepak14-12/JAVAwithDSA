package collectionf;
import java.util.*;

class NavigableSetDemo
{
  public static void main(String[] ags){
  TreeSet<Integer> t = new TreeSet<Integer>();
  t.add(1000);
  t.add(2000);
  t.add(3000);
  t.add(4000);
  t.add(5000);
  System.out.println(t);
  System.out.println(t.ceiling(2000)); //2000  //>= e
  System.out.println(t.higher(2000));  //3000  //> e
  System.out.println(t.floor(3000));  // 3000  //<= e
  System.out.println(t.lower(3000));  //2000  //< e
  System.out.println(t.pollFirst()); //1000 //removed & returned
  System.out.println(t.pollLast());  //5000  //removed & returned
  System.out.println(t.descendingSet());  //[4000,3000,2000] desc
   
 }
}
