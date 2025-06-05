package collectionf;
import java.util.*;
class TreeMapCSO
{
 public static void main(String[] args)
 {
  TreeMap  t = new TreeMap(new MycomparatorCSO());
  t.put(100,"AAA");
  t.put(103,"YYY");
  t.put(101,"ZZZ");
  t.put(104,"AAA");
  t.put(107,106);
  t.put(107,null);  //null replaced previous value
  t.put("www","ooo"); //heterogeneous allowed in custom sorting order
  t.put(null,"uuu");   //RE: NPE cants invoke Object.toString()
  System.out.println(t);
 }
}

class MycomparatorCSO implements Comparator
{
 public int compare(Object obj1,Object obj2)
 {
  String s1 = obj1.toString();
  String s2 = obj2.toString();
  return s2.compareTo(s1);
 }
}
