package alpha;

public class QuickSort {
	public static void quickSort(int arr[], int si, int ei) {
		// base case
		if (si >= ei)
			return;

		// last element
		int pivotIndex = partition(arr, si, ei);
		// recursive calls
		quickSort(arr, si, pivotIndex - 1);// left of pivot
		quickSort(arr, pivotIndex + 1, ei);// right of pivot
	}

	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[ei];// pivot == last element
		int i = si - 1;

		for (int j = si; j < ei; j++) {
			if (arr[j] <= pivot) {
				i++;
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;

		return i;
	}

	static public void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 6, 5, 9, 4, 3 };
		System.out.println("before sorting: ");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("\nafter sorting: ");
		printArray(arr);
	}
}
