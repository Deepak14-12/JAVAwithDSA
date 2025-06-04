package collectionf;
import java.util.*;
class WeakHashMapdemo
{
 public static void main(String[] args) throws Exception
 {
  WeakHashMap m = new WeakHashMap();
  Temp t = new Temp();
  m.put(t,"khairi");
  System.out.println(m); //{temp = khairi}
  t = null;
  System.gc();
  Thread.sleep(3000);
  System.out.println(m);
 }
}

class Temp 
{
 public String toString()
 {
  return "Temp";
 }
 public void finalize()
 {
  System.out.println("finalize() method called.");
 }
}
