package collectionf;
import java.util.*;
//Array as list
class ArrayAsListDemo
{
 public static void main(String[] args)
 {
  String[] s= {"A","Z","B"};
  List l = Arrays.asList(s);
  System.out.println(l); //[A,Z,B]
  s[0] = "K";
  System.out.println(l); //[K,Z,B]
  l.set(1,"D");
  for(String s1 : s)
     System.out.println(s1); //K,D,B
  //l.add("deepak"); //UnsupportedOperrationException
  //l.remove(2); //UsOE/
  //l.set(3,new Integer(10)); //ArrayStoreException
 }
} 
