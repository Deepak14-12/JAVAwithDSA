
package concollection;
import java.util.concurrent.*;
import java.util.*;

class MyThreadConcurrent extends Thread
{
 static ConcurrentHashMap m = new ConcurrentHashMap();
 public void run()
 {
  try{Thread.sleep(2000);}
  catch (InterruptedException e){}
  System.out.println("child thread updating list.");
  m.put(104,"D");
 }
 
 public static void main(String []args) throws InterruptedException
 {
  m.put(101,"A");
  m.put(102,"B");
  m.put(103,"C");
  MyThreadConcurrent c = new MyThreadConcurrent();
  c.start();
  Set s1 = m.keySet();
  Iterator itr = s1.iterator();
  while(itr.hasNext())
  {
   Integer I = (Integer) itr.next();
   System.out.println("Main thread iterating map and current entry is: "
+I+"---"+m.get(I));
  Thread.sleep(2500);   
  }
  System.out.println(m); 
 }
}
