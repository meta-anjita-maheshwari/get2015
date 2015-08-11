package Assignment3;

import java.util.Scanner;

//this is the class for finding the remainder. Here remainder is calculated using recursion
public class Assignment1a {

	public static void main(String[] args) {
		Assignment1a remain = new Assignment1a();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Dividend");
		int dividend = sc.nextInt(); // variable for dividend value
		System.out.println("enter Divisor");
		int divisor = sc.nextInt(); // variable for divisor value
		int remainder = remain.rem(dividend, divisor);
		if (remainder == -1)
			System.out.println("Remainder is not possible");
		else
			System.out.println("Remainder is" + remainder);
	}

	int rem(int x, int y) // function for finding remainder. The function is
							// using recursion.
	{
		int remainder;
		if (y > 0) {
			if ((x - y) < 0) // this condition shows that we have calculated the
								// remainder. Value of x at this time will be
								// the remainder.
				remainder = x;
			else // at this point we will call the rem() function again.
			{
				remainder = rem(x - y, y);
			}
		} else
			// This condition returns -1 shows that the negative or zero is
			// entered as divisor.
			remainder = -1;
		return remainder;
	}
}
