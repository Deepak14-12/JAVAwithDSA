package collectionf;
import java.util.*;

class HashMapDemo
{
 public static void main(String[] args)
 {
  HashMap m = new HashMap();
  m.put("deepak",50);
  m.put("vinesh",100);
  m.put("tushar",23);
  m.put("kartik",55);

  System.out.println(m); //{key = value, key = value,....}
  System.out.println(m.put("deepak",500000));  //50

  Set s = m.keySet();
  System.out.println(s); //[key, key,....]

  Collection c = m.values();
  System.out.println(c); //[value,value,...]

  Set s1 = m.entrySet();
  System.out.println(s1); //[key = value, key = value,....] 

  Iterator itr = s1.iterator();
  while(itr.hasNext())
  {
    Map.Entry m1 = (Map.Entry)itr.next();
    System.out.println(m1.getKey()+"----"+m1.getValue());
    if(m1.getKey().equals("vinesh"))
    {
     m1.setValue(2000);
    }
  } 
  System.out.println(m);
 }
}
