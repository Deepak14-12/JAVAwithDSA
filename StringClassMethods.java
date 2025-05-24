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
}
}
