package alpha;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int numbers[], int key) {
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == key)
				return i+1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.print("Enter a number to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		sc.close();
		
		int index = linearSearch(numbers, key);

		if(index == -1)
			System.out.println("element not found");
		else
		System.out.println("element found at index "+index);
	}
}
