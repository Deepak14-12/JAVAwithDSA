import java.util.Scanner;
class TowerOfHanoi{
	//Tower of Hanoi Problem
	public static void towerOfHanoi(int n, String src, String helper, String destination) {
		if (n == 1) {
			System.out.println("transfer disk " + n + " from " + src + " to " + destination);
			return;
		}
		// transfer top n-1 from src to helper using destination as 'helper'
		towerOfHanoi(n - 1, src, destination, helper);
		//transfer nth disk from src to destination
		System.out.println("transfer disk " + n + " from " + src + " to " + destination);
		// transfer top n-1 from destination to helper using src as 'helper'
		towerOfHanoi(n - 1, helper, src, destination);
	}

  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter number of disk for solving tower of hanoi: ");
  towerOfHanoi(sc.nextInt(), "s", "h", "d");
}
}


/**
### Description of the Code: `TowerOfHanoi.java`

This Java program solves the Tower of Hanoi problem, a classic algorithmic puzzle that involves moving a set of disks from one rod to another, following specific rules.

#### Key Features:
1. **Recursive Algorithm for Tower of Hanoi:**
   - The `towerOfHanoi` method is a recursive function that solves the problem.
   - It takes four parameters:
     - `n`: Number of disks to be moved.
     - `src`: The source rod.
     - `helper`: The helper rod.
     - `destination`: The destination rod.
   - The method recursively:
     - Transfers the top `n-1` disks from the source rod to the helper rod.
     - Moves the `n-th` disk directly to the destination rod.
     - Finally, transfers the `n-1` disks from the helper rod to the destination rod.

2. **Main Method:**
   - The `main` method prompts the user to input the number of disks for the Tower of Hanoi problem.
   - It uses the `Scanner` class to read user input.
   - Calls the `towerOfHanoi` method with the user input and default rod names: `"s"` (source), `"h"` (helper), and `"d"` (destination).

#### Example Output:
If the user enters `3` disks, the program generates the following steps:
```
enter number of disk for solving tower of hanoi: 3
transfer disk 1 from s to d
transfer disk 2 from s to h
transfer disk 1 from d to h
transfer disk 3 from s to d
transfer disk 1 from h to s
transfer disk 2 from h to d
transfer disk 1 from s to d
```

#### How It Works:
- The problem is solved by breaking it into smaller sub-problems using recursion.
- Base Case: If there is only one disk (`n == 1`), it is moved directly from the source to the destination.
- Recursive Case: The method performs the following steps:
  1. Moves `n-1` disks from the source to the helper rod using the destination as a temporary rod.
  2. Moves the largest disk (`n-th`) directly to the destination.
  3. Moves the `n-1` disks from the helper to the destination using the source as a temporary rod.

#### Usage:
This program is useful for understanding recursion and solving the Tower of Hanoi problem programmatically. It provides a step-by-step solution to transfer the disks while adhering to the rules:
1. Only one disk can be moved at a time.
2. No disk can be placed on top of a smaller disk.

This concise implementation demonstrates the power of recursion in solving complex problems with simple logic.
*/
