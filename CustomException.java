package mypack; 
//how to create custom exception
class TooYoungException extends RuntimeException
{
  TooYoungException(String s)
  {
    super(s); //to make description available to default ecxeption handler   
  }
}

class TooOldException extends RuntimeException
{
  TooOldException(String s)
  {
    super(s); //same as above  TooOldExceptio-->RTE-->Exxception-->Throwable
  }
}

public class CustomException{
public static void main(String[] args)
{
  int age = Integer.parseInt(args[0]);
   
if(age > 60)
 throw new TooYoungException("Plz wait some more time.. you will get best match soon...");
else if(age < 60)
 throw new TooOldException("Your age is already crossed marriage age .. No chance of getting married...");
else
  System.out.println("You will get match details soon....");

} 
}