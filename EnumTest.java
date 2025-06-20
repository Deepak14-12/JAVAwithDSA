package enumm;

enum Beer{
 KF,KO,RC,FO; //HERE SEMICOLON IS OPTIONAL
}

class EnumTest{

public static void main(String[] args){

Beer b = Beer.RC;
Beer b1 = Beer.KO;
System.out.println(b);  //prints enumrated datatype RC
System.out.println(b1);  //prints enumrated datatype KO

}
}
