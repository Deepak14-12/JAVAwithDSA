package enumm;

enum FishEnum{
 GOLD,APOLO,STAR,SANRANGI,CHACHDI,BAAM,BOTRYA; 
//HERE SEMICOLON IS mandatory bcz of taking extra members in addtion to Constants

public static void main(String[] args){

System.out.println("enum main() method called");

Fish []f = Fish.values();
for(Fish f1: f )
  System.out.println(f1+"............"+f1.ordinal());
//ordinal() method provides index of enum constants.
}
}
