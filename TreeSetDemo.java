package collectionf;
import java.util.*;

class TreeSetDemo
{
 public static void main(String [] args)
 {
  TreeSet t = new TreeSet();
 //t.add(null);
  t.add("A");
  t.add("a");
  t.add("B");
  t.add("Z");
  t.add("L");
  t.add("z");
  System.out.println(t); //[A, B, L, Z, a, z]
  /*
  t.add(10); //RE : ClassCastException
  t.add(null); //NullPointerException
  */
 }
}
