package thread;
class MyRunnable implements Runnable{
 public void run()
  {
     for(int i = 0; i < 10; i++)           //--  | job of
      System.out.println("child thread");//--  | a thraed
   }
}

class RunnableDemo
{
  public static void main(String []args){
  MyRunnable r = new MyRunnable();
  Thread t =  new Thread(r); //hare r is target Runnable 
   t.start(); //calling run of MyRunnable
   
  //executed by main thread
   for (int i= 0; i < 10; i++)
     System.out.println("main thread");
 }
}
