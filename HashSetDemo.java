package collectionf;
import java.util.*;
class HashSetDemo
{
 public static void main(String[] args)
 {
  HashSet s = new HashSet();
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
