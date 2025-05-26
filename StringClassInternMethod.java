package langpack;
class StringClassInternMethod
{
 public static void main(String[] args)
 { 
String s1 = new String("bhaskar"); 
String s2 = s1.intern();
System.out.println(s1==s2);//false 
String s3 = "bhaskar"; 
System.out.println(s2 == s3);//true
  
String s4 = new String("Durga"); 
String s5 = s4.concat("Software");
String s6 = s5.intern();
System.out.println(s5==s6);//false 
String s7 = "DurgaSoftware"; 
System.out.println(s6 == s7);//true

  }
}
