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
		
               /*or other way

		n = clearIthBit(n, i);
		int bitMask = newBit << i;
		return n | bitMask;
		*/
	}

	// clear last i bit
	public static int clearLastIBit(int n, int i) {
		int bitMask = (~0) << i;
		return n & bitMask;
	}

//	clear bit in the given range from i to j 
	public static int clearBitInRange(int n, int i, int j) {
		int a = (~0) << (j + 1);
		int b = (1 << i) - 1;
		int bitMask = a | b;
		return n & bitMask;
	}

	// check if a number is a power of 2 or not
	public static void powerOf2_OrNotCheck(int n) {
		if ((n & n - 1) == 0)
			System.out.println("The number has power of 2");
		else
			System.out.println("The number has not power of 2");
	}

	// count how many 1's are there in bits of a number
	public static int countSetBits1(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) // check LSB
				count++;

			n = n >> 1;
		}
		return count;
	}

	// count how many 1's are there in bits of a number
	public static int fastEponentiation(int a, int power) {
		int ans = 1;
		while (power > 0) {
			if ((power & 1) != 0) // check LSB
				ans = ans * a;

			a = a * a;
			power = power >> 1;
		}
		return ans;
	}

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 //Odd or Even number
		System.out.print("Enter a number to find Odd or Even: ");
		oddOrEven(sc.nextInt());
//SetBIt
		System.out.print("Enter a number and position to Set bit: ");
		System.out.println(setIthBit(sc.nextInt(), sc.nextInt()));

//getBIt
		/System.out.print("Enter a number and position to find bit: ");
		System.out.println(getIthBit(sc.nextInt(), sc.nextInt()));
//clearbit
		System.out.print("Enter a number and position to clear bit: ");
		System.out.println(clearIthBit(sc.nextInt(), sc.nextInt()));
//updatebit
		System.out.println(updateIthBit(10, 2, (byte) 1));

		System.out.println(clearLastIBit(5, 2));

		System.out.println(clearBitInRange(10, 2, 7));

		powerOf2_OrNotCheck(4); 

		System.out.println(countSetBits1(11));
		
		System.out.println(fastEponentiation(3, 5));	

		sc.close();
	}

}
