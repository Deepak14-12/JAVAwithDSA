package langpack;
class StringClassMethods
{
  public static void main(String[] args)
  {
    String s1 = new String("deepak");
    String s2 = s1.toUppercase();
    String s3 = s1.toLowercase();
    String s4 = s2.toLowercase();
    String s5 = s4.toUppercase(); /*
//------------------------------------------
String s =  "deepak";
System.out.print(s.charAt(3)); //p
System.out.print(s.charAt(30)); //re: AIOOBE
//-------------------------------------------
String s1 = new String("durga");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
//-------------------------------------------
public String substring(int begin); 
returns substring from begin index to end of the String 
public String substring(int begin,int end); returns substring from begin index to end-1 index 
String s = "abcdefg"; 
System.out.println(s.substring(3));//defg System.out.println(s.substring(2,5));//cde
//-------------------------------------------
public int length() 
String s = "durga"; 
System.out.println(s.length); 
CE: cannot find symbol 
symbol: variable length 
location:java.lang.String 1 
System.out.println(s.length());5
//----------------------------------------------
public String replace(char oldch, char newCh) 
String s = "ababa"; 
System.out.println(s.replace('a','b'));
//----------------------------------------------
public int indexOf(char ch); 
returns index of first occurrence of specified character 
public int lastIndexOf(char ch); 
String s="ababa"; 
System.out.println(s.indexOf('a'));//0 
System.out.println(s.lastIndexOf('a'));//4 
//----------------------------------------------
String s = "java"; 
- System.out.println(s.equals("JAVA"));//false 
System.out.println(s.equalsIgnoreCase("JAVA"));//true 
//----------------------------------------------
public boolean equals(Object o)  
To perform content comparison where case is important. 
This is overriding version of Object class equals() method 
 public boolean equalsIgnoreCase(String s)
To perform content comparison where case is not important. 
//-------------------------------------------------------  
public String concat(String s) 
The overloaded + and += operators also meant for concatenation purpose only. 

String s = "durga"; 

 s = s.concat("software"); 
// s = s+"software"; 
//s += "software"; 
System.out.println(s);//durgasoftware 

*/
}
}
