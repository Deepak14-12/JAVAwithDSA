package collectionf;
import java.util.*;

class NavigableMapDemo
{
  public static void main(String[] ags){
  TreeMap<String,String> t = new TreeMap<>();
  t.put("b","banana");
  t.put("c","cat");
  t.put("a","apple");
  t.put("d","dog");
  t.put("g","gun");
  System.out.println(t); 
  System.out.println(t.ceilingKey("c")); //c //>= e (lowest)
  System.out.println(t.higherKey("e"));  //g  //> e (lowest)
  System.out.println(t.floorKey("e"));  // d  //<= e (highest)
  System.out.println(t.lowerKey("e"));  //d  //< e (highest)
  System.out.println(t.pollFirstEntry()); //a=apple //removed & returned
  System.out.println(t.pollLastEntry());  //g=gun  //removed & returned
  System.out.println(t.descendingMap());  //[d=dog,c=cat,b=banana] desc
 }
}
