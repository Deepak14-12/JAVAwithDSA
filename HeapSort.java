package alpha;

import java.util.Scanner;

public class HeapSort {

	void heapSort(int arr[], int n) {

		// build heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// deletion one by one
		for (int i = n - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest])
			largest = left;

		if (right < n && arr[right] > arr[largest])
			largest = right;

		if (largest != i) {
			swap(arr, i, largest);
			heapify(arr, n, largest);

		}
	}

	void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static public void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static public void getElementsInArray(int arr[]) {
		System.out.println("Enter element in array to sort them: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element you want to insert: ");
		int arr[] = new int[sc.nextInt()];

		HeapSort hs = new HeapSort();
		// sort using heap sort
		hs.heapSort(arr, arr.length);

		System.out.println("sorted array : ");
		printArray(arr);

		sc.close();
	}

}
