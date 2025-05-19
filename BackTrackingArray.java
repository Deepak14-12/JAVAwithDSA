
public class BackTrackingArray {
	static public void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}System.out.println();
	}

	public static void backTrack(int arr[], int i, int value) {
		// base case
		if (i == arr.length) {
			System.out.println("original array: ");
			printArray(arr);
			return;
		}

		arr[i] = value;  //setting values of elements
		// recursion & backtracking
		backTrack(arr, i + 1, value + 1); // recursive call
		arr[i] = arr[i] - 2; // backtracking step for changing values of elements
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		backTrack(arr, 0, 1);
		System.out.println("After backtracking: ");
		printArray(arr);
	}

}
