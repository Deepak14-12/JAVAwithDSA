package collectionf;
import java.util.*;

class PriorityQueueDemo
{
 public static void main(String [] args)
 {
  PriorityQueue q = new PriorityQueue();
 // System.out.println(q.peek()); //null (empty Q) (Show elements in queue)
 // System.out.println(q.element()); //RE: NoSuchElementException (seiq)
 // System.out.println(q.poll()); //null  (remove elements from queue)
//  System.out.println(q.remove()); //RE: NoSuchElementException (refq)
   
    for(int i = 0; i<=10; i++)
       q.offer(i);  //add elements(objects) in queue

    System.out.println(q); //[0,1,2,.....,10] (dnso)
    System.out.println(q.peek());  //return head element if queue in not empty 
    System.out.println(q.poll());  //0 (removes head element and return)
    System.out.println(q.remove()); //1 (removes head element and return)
    
 }
}
