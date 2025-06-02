package collectionf;
import java.util.*;
/**
  LinkedHashSet is child class of HashSet
*/

class LinkedHashSetDemo
{
 public static void main(String[] args)
 {
  LinkedHashSet s = new LinkedHashSet();
  s.add("deepak");
  s.add("tushar");
  s.add("trisha");
  s.add("10");
  s.add("null");
  s.add("20.5");
  System.out.println(s.add("deepak")); //false
  System.out.println(s);
 }
}
