package alpha;

import java.util.Scanner;

public class BinarySearch {

	public static int[] sortArray(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	public static int binarySearch(int array[], int key) {
		int first = 0;   //first index
		int last = array.length ;  //last index

		while (first <= last) {
			int mid = (first + last) / 2; //middle index

			// comparison
			if (key == array[mid])
				return mid+1; //+1 for print correct position of element  

			if (key > array[mid])
				first =  mid + 1; // right part
			else
				last =  mid - 1; // left part

		}
		return -1;
	}

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 2, 5, 1, 3, 7, 4 };
		
		int[] sortedArray = sortArray(array);
		printArray(sortedArray);
		
		System.out.print("Enter an Element to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		System.out.println("element found at: " + binarySearch(array, key));

		sc.close();
//		printArray(array);
//		int[] sorted = sortArray(array);
//
//		printArray(sorted);

	}

}
