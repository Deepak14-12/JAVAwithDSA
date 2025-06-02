package collectionf;
import java.util.*;

class TreeSetSBDemo
{
 public static void main(String [] args)
 {
  TreeSet t = new TreeSet();
  t.add(new StringBuffer("A"));
  t.add(new StringBuffer("a"));
  t.add(new StringBuffer("B"));
  t.add(new StringBuffer("Z"));
  t.add("L");
  System.out.println(t); //[A, B, L, Z, a, z]
  /*
    RE: ClassCastException
  */
 }
}