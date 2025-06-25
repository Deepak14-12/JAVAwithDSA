//multiple catch blocks concept of Exception handling
package mypack;

class MultiCatch
{ 
  public static void main(String[] args)
  {
    // m1();
    try
    {
     System.out.println(10/0);
     String s =null;
     System.out.println(s.length());   
     }
    catch(ArithmeticException | NullPointerException e)  //here should be no relation b/t parent & child 
    {                                                     //e.g. (arithmeticException | Exception) like
     System.out.println(e);
     }


     //Re-throwing Exception 
     try
     {
      System.out.println(10/0);
      }
     catch(ArithmeticException e)  //convert one exception type to another
     {                                                     
      throw new NullPointerException();
      }

 } //end main

 //propagation
      public static void m1()
      { 
        m2();  
       }

      public static void m2()
      { 
        System.out.println(20/0); //caller method is responsible to handle exception
      }

}  //end class
