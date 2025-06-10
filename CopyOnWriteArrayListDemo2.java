package concollection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

class CopyOnWriteArrayListDemo2
{ 
  public static void main(String[] args) throws InterruptedException
  {
   CopyOnWriteArrayList l = new CopyOnWriteArrayList();
  
   l.add("A");
   l.add("B");
   l.add("C");
   l.add("D");
   System.out.println(l) ; //[A,B,C,D]   
  
   Iterator itr = l.iterator();
   while(itr.hasNext())
   {
    String s = (String)itr.next();
    if(s.equals("D"))
       itr.remove();  //line1: remove operation not allowed in COWAL
   }

   System.out.println(l) ;  //RE:UnsupportedoperationException bcz of line1
 }
}
