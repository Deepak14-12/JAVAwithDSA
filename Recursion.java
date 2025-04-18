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

	// check if the array is sorted 0r not
	public static boolean isSorted(int[] arr, int i) {

		// base case
		if (i == arr.length - 1) {
			return true;
		}

		if (arr[i] > arr[i + 1]) {
			return false;
		}

		return isSorted(arr, i + 1);
	}

        //  find the first occurrance of a mnumber in an array
	public static int firstOccurrence(int[] arr, int key, int i) {

		// base case
		if (i == arr.length - 1) {
			return -1;
		}

		if (arr[i] == key) {
			return i;
		}

		return firstOccurrence(arr, key, i + 1);
	}
	
        //  find the last occurrence of a mnumber in an array
	public static int lastOccurrence(int[] arr, int key, int i) {
		// base case
		if (i == arr.length) {
			return -1;
		}

		int isFound = lastOccurrence(arr, key, i + 1);

		if (isFound == -1 && arr[i] == key)
			return i;

		return isFound;
	}

	
	//calculate power of x (eg. x^n)
	public static int powerX( int x, int n) {
		// base case
		if (n == 0) {
			return 1;
		}
		
		return x * powerX( x, n-1);
	}

	// tilling problem
	public static int tillingProblem(int n) {  //2 x n (floor size)
		if(n == 0 || n == 1)                   //2 x 1 (tile size)
		return 1;
		
		//vertical choice
		int verticalChoice = tillingProblem(n-1);
		//horizontal choice
		int horizontal =  tillingProblem(n-2);
		
		int totalWays  = verticalChoice + horizontal;
		return totalWays; 
	}

		// Removed duplicate in a string
	public static void removeDuplicateInString(String str, int index, StringBuilder newStr, boolean map[]) {
		if (index == str.length()) {
			System.out.println(newStr);
			return;
		}
		// work
		char currentChar = str.charAt(index);
		if (map[currentChar - 'a'] == true) {
			// duplicate
			removeDuplicateInString(str, index + 1, newStr, map);
		} else {
			map[currentChar - 'a'] = true;
			removeDuplicateInString(str, index + 1, newStr.append(currentChar), map);
		}
		
	}

	//frieds pairing problem
	public static int friendsPairing(int n){
		if(n == 1|| n==2) {
			return n;
		}
		//in single return statement
		return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
		
		/*
		//single
		int fnm1 = friendsPairing(n-1);
		//paired
		int fnm2 = friendsPairing(n-2);
		int pairWays = (n-1) * fnm2;
		
		//totalWAys
		int totalWays = fnm1 + pairWays;
		return totalWays;
		*/	
	}

		// print all binary strings of size N without consecutive ones.
	  public static void printBinaryStringWC(int n, int lastPlace, String string) 
	  {
                 if(n == 0) {
          	  System.out.println(string);
        	  return;
                  }
		
		printBinaryStringWC(n - 1, 0, string+"0");
		if (lastPlace == 0)
		printBinaryStringWC(n - 1, 1, string+"1");

	}

	
	public static void main(String[] args) {
//		printFromNto1Dsc(5);
//		printFrom1toN_ASC(5);
//		System.out.println(facatorial(5));
//		System.out.println(printSumOf_N_NaturalNumbers(5));
		// System.out.println(printNthFibbonacciNumber(5));

		int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
		// System.out.println(isSorted(arr, 0));

		// System.out.println(firstOccurrence(arr,4,0));
  //               System.out.println(lastOccurrence(arr, 5, 0));

		// System.out.println(powerX(2,5));

		// System.out.println(tillingProblem(4)); // value of n (in floor size 2 x n)
		// removeDuplicateInString("deepppaaaaaaaaaaaak", 0,new StringBuilder(""), new boolean[26]);

		// System.out.println(friendsPairing(3));

		printBinaryStringWC(3, 0,"");
	}
}
