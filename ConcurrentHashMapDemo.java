package concollection;
import java.util.concurrent.*;

/** ConcurrentMap Methods
  *Object putIfAbsent(Object key, Object value)
  *boolean remove(Object key, Object value)
  *boolean replace(Object key, Object oldValue, Object newValue) 
  */

public class ConcurrentHashMapDemo
{
 public static void main(String[] args)
 {
  ConcurrentHashMap m = new ConcurrentHashMap();
  m.put(101,"A");  
  m.put(102,"B");
  m.putIfAbsent(103,"C");
  m.putIfAbsent(101,"D");
  m.remove(101,"D");
  m.replace(102,"B","E");
  System.out.println(m); //{101=A,102=E,103=C}
 }
}
