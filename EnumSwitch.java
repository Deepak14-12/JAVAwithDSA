package enumm;

enum Beer{
 KF,KO,RC,FO; //HERE SEMICOLON IS OPTIONAL
}

class EnumSwitch{

public static void main(String[] args){

Beer b = Beer.RC;
switch(b){
case KF:
       System.out.println("it is childrens brand");  
       break; 
case KO:
       System.out.println("it is too high");  
       break; 
case RC:
       System.out.println("it is not much kick");  
       break; 
case FO:
       System.out.println("buy one get one free");  
       break; 
}
}
}
