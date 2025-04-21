import java.util.Scanner;
//Constructor,Constructor overloading,Copy Constructor, method overloading 
//Manual programming

class Number {
	int x;
	float f;

	Number() { // default constructor
		x = 1;
	}

//constructor overloading
	Number(int a) { // parameterized constructor
		x = a;
		f = 1.1f;

	}

	Number(float ft) {

		f = ft;
	}

	Number(int a, float ft) {
		x = a;
		f = ft;
	}

	Number(float ft, int a) {
		x = a;
		f = ft;
	}

//Copy Constructor
	Number(Number c) {
		x = c.x;
		f = c.f;
	}

//setter methods overloading
	void set(int a) {
		x = a;
	}

	void set(float ft) {
		f = ft;
	}

	void set(int a, float ft) {
		x = a;
		f = ft;
	}

	void set(float ft, int a) {
		x = a;
		f = ft;
	}
	
//getter method for both values of x and y
	void get() {
		System.out.println("int value x = "+x);
		System.out.println("float value f = "+f);
	}
}

class ManualProgramming{
	public static void main(String[] args) {
		
           /*1.creating  object
               1. set integer
               2. set float             
               3. set both   1.int 2. float
             2.change the value of object
             3.show the value of one oject
             4.exit
           */
 
           Scanner sc = new Scanner(System.in);
           System.out.println("how many reference/object you want: ");
           Number n[] = new Number[sc.nextInt()];
           int i= 0;
           
           while(true) 
           {
             System.out.println("1.creating object\n2.change the value of object\n3.show the value of one object\n4.exit");
 System.out.println("Enter your choice: ");
              switch(sc.nextInt())
              {
                case 1:{ System.out.println("1.set integer\n2.set float\n3.set both");
                        System.out.println("Enter your choice: ");
                        switch(sc.nextInt())
                        { 
                          case 1:  System.out.println("Enter integer: ");
                                   n[i] = new Number(sc.nextInt());
                                   i++;
                                   break;
                          case 2:  System.out.println("Enter float: ");
                                   n[i] = new Number(sc.nextFloat());
                                   i++;
                                   break;     
                          case 3:   while(true){
                                    System.out.println("1.set integer and float: ");
                                    System.out.println("2.set float and integer: ");
                                    int subChoice = sc.nextInt();
                                    if (subChoice == 1) {
                                        System.out.println("Enter int and float: ");
                                        n[i] = new Number(sc.nextInt(), sc.nextFloat());
                                    } else if (subChoice == 2) {
                                        System.out.println("Enter float and int: ");
                                        n[i] = new Number(sc.nextFloat(), sc.nextInt());
                                    } else {
                                        System.out.println("Invalid option!");
                                        break;
                                    }
                                     i++;
                                     break;
                          } 
                         break;
                        }
                        break;
                       }
                    
                 case 2: {
                        System.out.println("enter object index to change:  ");
                        int index = sc.nextInt();
                        System.out.println("1. Set integer");
                        System.out.println("2. Set float");
                        System.out.println("3. Set both (int, float)");
                        System.out.println("4. Set both (float, int)");
                        System.out.print("Enter your choice: ");           
                         
                        switch(sc.nextInt())
                        {
                           case 1:
                                 System.out.print("Enter integer: ");
                                 n[index].set(sc.nextInt());
                                 break;
                           case 2:
                                 System.out.print("Enter float: ");
                                 n[index].set(sc.nextFloat());
                                 break;
                           case 3:
                                 System.out.print("Enter int and float: ");
                                 n[index].set(sc.nextInt(), sc.nextFloat());
                                 break;
                           case 4:
                                 System.out.print("Enter float and int: ");
                                 n[index].set(sc.nextFloat(), sc.nextInt());
                                 break;
                           default:
                            System.out.println("Invalid choice!");

                        }
                        break;
                       }

                 case 3:{
                        System.out.print("Enter object index to view: ");
                        n[sc.nextInt()].get();
                        break;
                        }

                 case 4:{
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                        }

                 default:
                        System.out.println("Invalid choice.");
               }
            }    
	}
    }
