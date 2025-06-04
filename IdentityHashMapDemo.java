package collectionf;
import java.util.*;

class IdentityHashMapDemo
{
 public static void main(String[] args)
 {
  /*
   HashMap m = new HashMap();
   Integer I1 = new Integer(10);
   Integer I2 = new Integer(10);

   m.put(I1,"hero");
   m.put(I2,"heroine"); //only one entry will be added to m beacuase of equals() method used in hashmap which meant for content comparision
   System.out.println(m); 
  */

  IdentityHashMap m = new IdentityHashMap();
  Integer I1 = new Integer(10);
  Integer I2 = new Integer(10);

  m.put(I1,"hero");
  m.put(I2,"heroine"); //two entries will be added to m beacuase of (==) is used in IdentityHashMap which meant for reference comparision
  System.out.println(m); 
 } 
}
