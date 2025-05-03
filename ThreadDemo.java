class MyThread1 extends Thread
{
  public void run()
 {
  for(int i= 0; i < 10;i++)  //----->
  {                           //job of thread
   System.out.println("child thread");  //executed by child thread
  }                         //------->
 }   

}

class ThreadDemo
{
  public static void main(String []args)
  { MyThread1 t = new MyThread1();   //thread instantiation
    t.start();        //starting of a thread
   
    for(int i = 1; i <=10; i++)
     {                               //executed by main thread
      System.out.println("main thread");
     }
  }
}
