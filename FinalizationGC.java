class FinalizationGC
{/*
 public static void main(String[] args)
 {
  String s = new String("deepak");
  FinalizationGC f = new FinalizationGC();
  s = null;
  f = null;
  System.gc();
 System.out.println("End of main");
 }
 
 public void finalize()
 {
  System.out.println("finalize method is executed");

 }
*/
/*
public static void main(String[] args)
 {
  FinalizationGC f = new FinalizationGC();
  f.finalize();
  f.finalize();
  f = null;
  System.gc();
 System.out.println("End of main");
 }
 
 public void finalize()
 {
  System.out.println("finalize method is executed");

 }
*/
/*
  static FinalizationGC s; 
public static void main(String[] args) throws Exception
 {
  FinalizationGC f = new FinalizationGC();
  System.out.println(f.hashCode());
  f = null;
  System.gc();
  Thread.sleep(5000);
  System.out.println(s.hashCode());
  s = null;
  System.gc();  
  Thread.sleep(10000);
 System.out.println("End of main");
 }
 
 public void finalize()
 {
  System.out.println("finalize method is executed");
  s = this;
 }
*/

static long count = 0;
public static void main(String[] args) throws Exception
 {
  for(long i = 0; i <= 1000; i++)
  {
   FinalizationGC f = new FinalizationGC();
   f = null;
  }
 }
 public void finalize()
 {
  System.out.println("finalize method is executed"+count++);
 }

}
