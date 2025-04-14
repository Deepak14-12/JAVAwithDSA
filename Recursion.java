package alpha;

public class Recursion {
	public static void printFromNto1Dsc(int n) {
		if (n == 1) {
			System.out.print(1);
			return;
		}

		System.out.print(n + " ");
		printFromNto1Dsc(n - 1); // calling itself
	}

	public static void printFrom1toN_ASC(int n) {
		if (n == 1) {
			System.out.print(1);
			return;
		}

		printFrom1toN_ASC(n - 1); // calling itself
		System.out.print(" " + n);
	}

	public static int facatorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * facatorial(n - 1); // calling itself

//		int fnm1 = facatorial(n - 1);
//		int fn = n * fnm1;
//		return fn;
	}

	public static int printSumOf_N_NaturalNumbers(int n) {
		if (n == 0) {
			return 0;
		}

		return n + printSumOf_N_NaturalNumbers(n - 1); // calling itself
	}

	public static int printNthFibbonacciNumber(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fibn_1 = printNthFibbonacciNumber(n - 1); // calling itself
		int fibn_2 = printNthFibbonacciNumber(n - 2); // calling itself
		int fibN = fibn_1 + fibn_2;
		return fibN ; 
	}

	public static void main(String[] args) {
//		printFromNto1Dsc(5);
//		printFrom1toN_ASC(5);
//		System.out.println(facatorial(5));
//		System.out.println(printSumOf_N_NaturalNumbers(5));
		System.out.println(printNthFibbonacciNumber(5));
	}
}
