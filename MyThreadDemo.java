package thread;
class MyThread2 extends Thread
{
}

class MyThreadDemo
{
 public static void main(String []args)
 {
  MyThread2 m = new MyThread2();
  m.start(); //it will call the run method of Thread class
 }
}
