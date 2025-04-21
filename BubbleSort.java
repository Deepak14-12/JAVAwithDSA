class BubbleSort
{

 public static void main(String[] args)
 {
  int a[]= {10,2,300,4,85,6};

//array before sorting  
  System.out.print("before sorting: ");
   for(int i : a)
    System.out.print(i+" ");

//sorting
  for(int i = 0; i < a.length-1; i++)
  { for(int j = 0; j < a.length-1-i; j++)
     {
      if(a[j] > a[j+1])
      { 
         int temp  = a[j];
         a[j] = a[j+1];
         a[j+1] = temp;
      }
     }
   }
//array after sorting
   System.out.print("\nafter sorting: ");
   for(int i : a)
    System.out.print(i+" ");
  }
}
