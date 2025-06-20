package enumm;

enum Beer1{
 KF,KO,RC,FO;
Beer1(){
System.out.println("Costructor called.");
}
}

enum BeerB{
 KF(70),KO(100),RC(90),FO;
int price;

BeerB(){
this.price = 65;
}

BeerB(int price){
this.price = price;
}

public int getPrice()
{
 return price;
}
}

class EnumConstructor{

public static void main(String[] args){

Beer1 b = Beer1.RC;
  System.out.println("hello...");


BeerB[] b1 = BeerB.values();
for(BeerB bb: b1)
  System.out.println(bb+"..."+bb.getPrice());
}
}
