package Assignment3;

import java.util.Scanner;

//Searching of element through linear search and using the concept of recursion
public class Assignment2a {

	public static void main(String[] args) {
		Assignment2a linear = new Assignment2a();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter elements of array");
		for (int i = 0; i < length; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter searching number");
		int no = sc.nextInt();
		int pos = linear.linearSearch(arr, no, length - 1) + 1;
		if (pos == 0)
			System.out.println("Number is not present in the array");
		else
			System.out.println("Number is at position" + pos);
	}

	int linearSearch(int a[], int b, int i) // Function for searching element, a
											// is array, b is searching element,
											// i is index of last element
	{
		if (i >= 0) // Starts searching from last index till the first one
		{
			if (a[i] == b)
				return i;
			else
				return linearSearch(a, b, i - 1);
		}
		return i;
	}
}
