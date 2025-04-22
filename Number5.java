//private constructor

import java.util.Scanner;
class Number5
{
  Scanner sc = new Scanner(System.in);
  int x;
  static int count;

  private Number5()
  {
    x = sc.nextInt();
   }

 static Number create(){
  if(count == 0){
   new Number5();
   count++;
  }
  return null;
}


  /*public static void main(String[] args)  
  {
   Number5 n  = new Number5(); //inside same class
    }*/
}
