import java.util.Scanner;
class Account{
int accNo;
double balance;
String accHolderName;
long mobileNo;
long aadharCard;
String address;

static int nextAccNo = 1001;

static Scanner s = new Scanner(System.in);
    Account()
   {
        accNo = nextAccNo++;
        balance = 0.0f;
        System.out.println("Enter Account Holder Name: ");
        accHolderName = s.nextLine(); 
        System.out.println("Enter Mobile Number: ");
        mobileNo = sc.nextLong();    
        System.out.println("Enter Aadhar Number: ");
        aadharCard = sc.nextLong();    
        System.out.println("Enter Address: ");
        aadharCard = sc.nextLine(); 
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

void showStatus()
{
 System.out.println("Account Number: "+accNo);
 System.out.println("Available Balance: "+balance);
}

void getAccountHolderDetails()
{ 
  System.out.println("Account Number: "+accNo);
  System.out.println("Available Balance: "+balance);
  System.out.println("Account Holder Name: "+accHolderName);
  System.out.println("Aadhar Number: "+aadharCard);
  System.out.println("Mobile Number: "+mobileNo); 
  System.out.println("Address: "+address);
  
}

 void setMobile()
 {
    System.out.println("Enter Mobile Number: ");
        mobileNo = sc.nextLong();  
  }

 void setAddress()
 {
   System.out.println("Enter Address: ");
   aadharCard = sc.nextLine(); 
  }

 void updateDetails()
 { 
  boolean b = true;
  while(b)
  {
   System.out.println("1. Update Mobile Number\n2. Update Address\n3.Previous Menu");
   System.out.println("Enter Your Choice: ");
   switch(s.nextInt())
    {
       case 1: setMobile();
               break;

       case 2: setAddress();
               break;
       
       case 3: System.out.println("going to previous menu...");
               b = false;
                break;
       
       default:
                System.out.println("Invalid choice.");

     }   
   }
  }


//manual programing---

public static void main(String []args)
{
 boolean b = true;
 System.out.println("how many account you want to create: ");
 Account a[] = new Account[s.nextInt()];
 int i= 0;
 while(b){
          System.out.println("1.Ceate Account\n2.Deposit\n3.Withdrawl\n4.Show Account Status\n5.Get Your Account Details\n6.Update Details\n7.Exit");
          System.out.println("Enter Choice: ");
          switch(s.nextInt()){
                    case 1: a[i] = new Account();
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
                    case 5: System.out.println("Enter Account Number OR Mobile Number : ");
                            accNo = s.nextInt();
                            long mNo = s.nextLong();
                           for(int j = 0; j < i; j++ )
                           {
                            if(accNo == a[j].accNo || mNo ==a[j].mNo)
                              a[j].getAccountHolderDetails();
                            }
                            break;

                    case 6: System.out.println("Enter Account Number OR Mobile Number : ");
                            accNo = s.nextInt();
                            mNo = s.nextLong();
                           for(int j = 0; j < i; j++ )
                           {
                            if(accNo == a[j].accNo || mNo ==a[j].mNo)
                              a[j].updateDetails();
                            }
                            break;
                    case 7: System.out.println("Exiting...");
                            b = false;
                            s.close();
                            break;
                    default:
                            System.out.println("Invalid choice.");
                    }

             }
 } 
}
