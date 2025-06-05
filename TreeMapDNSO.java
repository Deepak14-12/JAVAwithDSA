package collectionf;
import java.util.*;
class TreeMapDNSO
{
 public static void main(String[] args)
 {
  TreeMap  t = new TreeMap();
  t.put(100,"AAA");
  t.put(103,"YYY");
  t.put(101,"ZZZ");
  t.put(104,"AAA");
  t.put(107,106);
  t.put(107,null);  //null replaced previous value
  //t.put("www","ooo");
  //t.put(null,"uuu");
  System.out.println(t);
 }
}
