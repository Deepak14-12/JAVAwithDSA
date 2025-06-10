package generic;
import java.util.*;
 
class TestGen
{
 public static void main(String[] args)
 { 
  //generic area
  ArrayList<String> l = new ArrayList<String>();
  l.add("deepak");
  l.add("Tushar");
  //l.add(10); //CE
  m1(l);
  System.out.println(l);
  l.add(20);
 }

//non-generic area
 public static void m1(ArrayList l)
 {
  l.add(10);
  l.add(10.5);
  l.add(true); 
 }
}
