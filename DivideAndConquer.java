public class DivideAndConquer {

	public void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void mergeSort(int arr[], int startIndex, int endIndex) {
		// base case
		if (startIndex >= endIndex)
			return;

		// recursive case
		int mid = startIndex + (endIndex - startIndex) / 2;
//		left part
		mergeSort(arr, startIndex, mid);
//		right part
		mergeSort(arr, mid + 1, endIndex);

		merge(arr, startIndex, mid, endIndex);
	}

	public void merge(int arr[], int startIndex, int mid, int endIndex) {
		int temp[] = new int[endIndex - startIndex + 1];
		int i = startIndex; // iterator for left part
		int j = mid + 1; // iterator for right part
		int k = 0; // iterator for temporary array

		while (i <= mid && j <= endIndex) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

//		left part
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
//		right part
		while (j <= endIndex) {
			temp[k++] = arr[j++];
		}
		// copy temp to orignal array
		for (k = 0, i = startIndex; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 1, 4, 2, 9, 8 };
    
		DivideAndConquer ms = new DivideAndConquer();
		
    System.out.println("\nbefore merge sort: ");
		ms.printArray(arr);
		ms.mergeSort(arr, 0, 5); //merge sort
		System.out.println("\nafter merge sort: ");
		ms.printArray(arr);
	}

}
