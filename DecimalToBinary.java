public class DecimalToBinary {

	public static void decToBin(int decimal) {
		int myNum = decimal;
		int pow = 0;
		int binNum = 0;
		
		while(decimal > 0) {
			int r = decimal% 2;
			
			binNum = binNum+(r * (int)(Math.pow(10, pow)));
			pow++;
			decimal /= 2;
		}
		System.out.println("Binary of "+myNum+" is "+binNum);
	}
	
	
	public static void main(String[] args) {
		decToBin(5);
	
}
}
