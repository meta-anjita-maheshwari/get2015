package Assignment3;

import java.util.Scanner;

//Class for calculating largest digit using the concept of recursion.
public class Assignment1c {

	public static void main(String[] args) {
		Assignment1c largest = new Assignment1c();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		int large = largest.largestDigit(no);
		System.out.println("Largest digit is" + large);
	}

	int largestDigit(int x) // function finds largest digit by setting the value
							// of variable ld, if it finds any other digit
							// larger than its previous value.
	{
		int ld = 0;
		if (x > 0) // This is the terminating condition. When the number has no
					// more digits.
		{
			ld = x % 10;
			x = x / 10;
			int temp = largestDigit(x);
			if (ld < temp) {
				ld = temp;
			}
		}
		return ld;
	}
}
