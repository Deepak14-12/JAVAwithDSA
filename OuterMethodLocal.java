package inner;
class OuterMethodLocal
{   //method local inner class
   public void m1()
   {   
       class InnerMethodLocal
       {
         public void sum(int x, int y)
         {
           System.out.println("sum: "+(x+y));
         }
       }
       InnerMethodLocal i = new InnerMethodLocal();
       i.sum(10,20);
        ;;;;;;;;;;;;;;
       i.sum(100,200);
        ;;;;;;;;;;;;;;
       i.sum(1000,2000);
  }
  
  public static void main(String[] args)
  { OuterMethodLocal a = new OuterMethodLocal();
    a.m1();
  }
}
