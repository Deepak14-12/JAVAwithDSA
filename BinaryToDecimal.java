public class BinaryToDecimal {

public static void binaryToDecimal(int binNum) {
	int pow = 0 , decimal = 0;
	
	while(binNum > 0) {
		int lastDigit = binNum % 10;
		//formula decimal = decimal *(lastdigit+pow(2,powerNumber))
		decimal = decimal+(lastDigit * (int)Math.pow(2, pow) );
		pow++;
		
		binNum /= 10; 
	}
	System.out.println(decimal);
	
}
	
	
	public static void main(String[] args) {
	binaryToDecimal(1011);
}
}
