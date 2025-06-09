
class MyThreadCon extends Thread
{
 static ArrayList l = new ArrayList();
 public void run()
 {
  try{Thread.sleep(2000);}
  catch (InterruptedException e){}
  System.out.println("child thread updating list.");
  l.add("D"); //line 1
 }
 
 public static void main(String []args) throws InterruptedException
 {
  l.add("A");
  l.add("B");
  l.add("C");
  MyThreadCon t = new MyThreadCon();
  t.start();
  Iterator itr = l.iterator();
  while(itr.hasNext())
  {
   String s1 = (String) itr.next();
   System.out.println("Main thread iterating list and current object is: "
+s1);
  Thread.sleep(2500);   
  }
  System.out.println(l); // ConcurrentModificationException bcz of line 1
 }
}
