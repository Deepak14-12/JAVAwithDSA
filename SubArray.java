public class SubArray {
	public static void subArray(int[] array) {
		int ts = 0;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			int start = i; // 2,4,6,8,10

			for (int j = i; j < array.length; j++) {
				int end = j;

				for (int k = start; k <= end; k++) {// print
					System.out.print(array[k] + " "); // sub array
					currSum += array[k];
				}
				ts++;
				System.out.print("Sum of subArray" + currSum);
				if(maxSum < currSum)
					maxSum = currSum;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total number of subArrays" + ts);
		System.out.print("Maximum Sum of subArray" + maxSum);
	}

	public static void main(String[] args) {
		System.out.println();
		int[] numbers = { 2, 4, 6, 8, 10 };
		subArray(numbers);
	}
}
