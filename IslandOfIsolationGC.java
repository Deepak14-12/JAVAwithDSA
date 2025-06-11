class IslandOfIsolationGC
{

 IslandOfIsolationGC i;
 public static void main(String[] args)
 {
  IslandOfIsolationGC i1  = new IslandOfIsolationGC();
  IslandOfIsolationGC i2  = new IslandOfIsolationGC();
  IslandOfIsolationGC i3  = new IslandOfIsolationGC();
 //no object eligible for Garbage Collection --^ 

  i1.i = i2;
  i2.i = i3;
  i3.i = i1;
 //no object eligible for Garbage Collection  --^

 i1 = null;
 //no object eligible for Garbage Collection  --^
 i2 = null;
 //no object eligible for Garbage Collection  --^
 i3 = null;
 //three objects are eligible for Garbage Collection  --^
 System.out.println("3 objercts are available for garbage collection");
 }
}
