package concollection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

class COWALThread extends Thread
{
  static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
  public void run()
  {
   try{Thread.sleep(2000); }
   catch(InterruptedException e){}
   System.out.println("child thread updating list.");
   l.add("C"); 
  } 
  public static void main(String[] args) throws InterruptedException
  {
   l.add("A");
   l.add("E");
 
   COWALThread t =  new COWALThread();
   t.start();
   
   Iterator itr = l.iterator();
   while(itr.hasNext())
   {
    String s1 = (String)itr.next();
    System.out.println("Main Thread iterating list and current object is: "+s1);
    Thread.sleep(2500); 
   }

   System.out.println(l) ;  
 }
}
