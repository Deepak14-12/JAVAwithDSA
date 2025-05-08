package thread;
class TH extends Thread{
 public void run()
  {
           System.out.println("child thread"); 
  }
}

class ThreadDemo1
{
  public static void main(String []args){
  TH t = new TH();
  Thread t1 =  new Thread(t); //valid  TH--->Thread--(internally implements)-->Runnable 
                                //here t is also Runnable type(Thread implements Runnable)
   t1.start(); //calling run() of TH
   
  //executed by main thread
   System.out.println("main thread");
 }
}
