package concollection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

class CopyOnWriteArrayListDemo
{
 public static void main(String[] args)
 {
   ArrayList l1 =  new ArrayList();
   l1.add("D");
   l1.add("A"); 
   
   CopyOnWriteArrayList l = new CopyOnWriteArrayList();
   l.addIfAbsent("A");
   l.addIfAbsent("C");
   l.addAll(l1);

   ArrayList l2 =  new ArrayList();
   l2.add("A"); 
   l2.add("E");
   l.addAllAbsent(l2);

   System.out.println(l); //[A,C,D,A,E]
   
 }
}
