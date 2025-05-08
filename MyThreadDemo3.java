package thread;
class MyThread3 extends Thread
{
  public void start()
  { 
  super.start();  //calls the start() of Thread class
   System.out.println("start method"); 
  }  
  public void run()
  {
   System.out.println("run method"); 
  }  
}

class MyThreadDemo3 extends MyThread3
{
 public static void main(String []args)
 {
  MyThread3 m = new MyThread3();
  m.start();//it will call the start method of Mythread3 class as a normal method
  System.out.println("main method"); 
  //m.start(); re: illegalThreadStateException
  System.out.println(Thread.currentThread().getName()); //main
 }
}
