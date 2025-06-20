package enumm;

enum Beer1{
 KF,KO,RC,FO; //HERE SEMICOLON IS OPTIONAL
Beer1(){
System.out.println("Costructor called.");
}
}

class EnumConstructor{

public static void main(String[] args){

Beer1 b = Beer1.RC;
  System.out.println("hello...");

}
}
