import java.util.Scanner;

public class BitManipulation {
	public static void oddOrEven(int n) {
		int bitmask = 1;
		if ((n & bitmask) == 0)
			System.out.println("Even Number ");
		else
			System.out.println("Odd number");
	}

	public static byte getIthBit(int n, int i) { // i = position of bit
		int bitmask = 1 << i;
		if ((n & bitmask) == 0)
			return 0;
		else
			return 1;

	}

	public static int setIthBit(int n, int i) {
		int bitmask = 1 << i;
		return n | bitmask;
	}

	public static int clearIthBit(int n, int i) {
		int bitmask = ~(1 << i);
		return n & bitmask;
	}

	public static int updateIthBit(int n, int i, byte newBit) {
		if(newBit == 0)
			return clearIthBit(n,i);
		else 
			return setIthBit(n,i);
		
or other way

		n = clearIthBit(n, i);
		int bitMask = newBit << i;
		return n | bitMask;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //Odd or Even number
		System.out.print("Enter a number to find Odd or Even: ");
		oddOrEven(sc.nextInt());
//Set BIt
		System.out.print("Enter a number and position to Set bit: ");
		System.out.println(setIthBit(sc.nextInt(), sc.nextInt()));

//get BIt
		/System.out.print("Enter a number and position to find bit: ");
		System.out.println(getIthBit(sc.nextInt(), sc.nextInt()));
//clear bit
		System.out.print("Enter a number and position to clear bit: ");
		System.out.println(clearIthBit(sc.nextInt(), sc.nextInt()));
//updatebit
		System.out.println(updateIthBit(10, 2, (byte) 1));
		
		sc.close();
	}

}
