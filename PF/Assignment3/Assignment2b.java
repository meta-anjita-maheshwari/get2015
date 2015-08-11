package Assignment3;

import java.util.Scanner;

//Searching of element through binary search and using the concept of recursion
public class Assignment2b {

	public static void main(String[] args) {
		Assignment2b bsearch = new Assignment2b();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("enter array element in ascending order");
		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter searching element");
		int no = sc.nextInt();
		int loca = bsearch.binarySearch(arr, no, 0, len - 1) + 1;
		if (loca == 0)
			System.out.println("searching element not found");
		else
			System.out.println("searching elementn is at position" + loca);

	}

	int binarySearch(int a[], int b, int i, int j) // Function for searching
													// element, a is array, b is
													// searching element, i is
													// index of first element
	{ // j is index of last element
		if (i <= j) // Searches till index of last element is greater than first
					// element
		{
			int temp = (i + j) / 2;
			if (a[temp] == b)
				return temp;
			else if (a[temp] > b)
				return binarySearch(a, b, i, temp - 1);
			else
				return binarySearch(a, b, temp + 1, j);
		} else
			return -1; // Returns -1 if number is not found
	}
}
