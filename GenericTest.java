package generic;
import java.util.*;

public class GenericTest
{
 public static void main(String[] args)
 {
  ArrayList<String> list1 = new  ArrayList<String>();
  list1.add("deepak");
  list1.add("tushar");
  System.out.println(list1);

  ArrayList<Integer> list2 = new  ArrayList<Integer>();
  list2.add(10);
  list2.add(20);
  System.out.println(list2);

  ArrayList<Double> list3 = new  ArrayList<>();
  list3.add(12.25);
  list3.add(566.23);
  System.out.println(list3);

 }
}
