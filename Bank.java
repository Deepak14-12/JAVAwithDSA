//basic bank operations and implementation of array of abject
import java.util.Scanner;
class Bank{
int accNo;
double balance;

static int nextAccNo = 1001;

    Bank() {
        accNo = nextAccNo++;
        balance = 0.0;
    }

void deposite(double amt)
{ System.out.println("Amount Deposited In Account..");
  balance = balance + amt;
}

void withdraw(double amt)
{
  if (amt <= balance) {
            balance -= amt;
            System.out.println("Amount withdrawn Successfully... ");
        } else {
            System.out.println("Insufficient balance!");
        } 
}

void showStatus(){
System.out.println("Account Number: "+accNo);
System.out.println("Available Balance: "+balance);
}


//manual programing---

public static void main(String []args)
{Scanner s = new Scanner(System.in);
 boolean b = true;
 System.out.println("how many account you want to create: ");
 Bank a[] = new Bank[s.nextInt()];
 int i= 0;
 while(b){
          System.out.println("1.Ceate Account\n2.Deposit\n3.Withdrawl\n4.Show Account Status\n5.Exit");
          System.out.println("Enter Choice: ");
          switch(s.nextInt()){
                    case 1: a[i] = new Bank();
                            System.out.println("Account Created....");
                            System.out.println("Account Number: "+a[i].accNo);
                            i++;
                            break;
                    case 2: 
                           System.out.println("Enter Account Number: ");
                           int accNo = s.nextInt();
                           for(int j = 0; j < i; j++ )
                           {
                            if(accNo == a[j].accNo){
                               System.out.println("Enter amount:");  
                               a[j].deposite(s.nextDouble());}
                            }
                            break;
                    case 3: System.out.println("Enter Account Number: ");
                            accNo = s.nextInt();
                           for(int j = 0; j < i; j++ )
                           {
                            if(accNo == a[j].accNo){        
                               System.out.println("Enter Amount:");  
                               a[j].withdraw(s.nextDouble());}
                            }
                            break;
                    case 4: System.out.println("Enter Account Number: ");
                            accNo = s.nextInt();
                           for(int j = 0; j < i; j++ )
                           {
                            if(accNo == a[j].accNo)
                              a[j].showStatus();
                            }
                            break;
                    case 5: System.out.println("Exiting...");
                            b = false;
                            s.close();
                            break;
                    default:
                            System.out.println("Invalid choice.");
                    }

             }
 } 
}
