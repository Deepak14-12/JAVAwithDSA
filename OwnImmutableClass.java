package langpack;
final public OwnImmutableClass
{
 private int i;
 OwnImmutableClass(int i)
 { 
   this.i = i;
 }
 
 public OwnImmutableClass modify(int i)
   {
    if(this.i == i)
      return this;
    else
      return (new OwnImmutableClass(i));
   }
 public static void main(String[] args)
 {
   OwnImmutableClass ic1 = new OwnImmutableClass(10);
   OwnImmutableClass ic2 = ic1.modify(100);
   OwnImmutableClass ic3 = ic1.modify(10);
   System.out.println(ic1 = ic2);
   System.out.println(ic1 = ic3);  

 }
 

