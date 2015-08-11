package Assignment3;

import java.util.Scanner;

//this class calculates greatest common divisor of two numbers
public class Assignment1b {

	public static void main(String[] args) {
		Assignment1b gcdAns = new Assignment1b();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers whose GCD is to find");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		if (no1 > 0 && no2 > 0) // If two numbers are zero or negative, GCD can
								// not be calculated
		{
			if (no1 > no2) // If first element is greater, swap both values.
			{
				int a = no1;
				no1 = no2;
				no2 = a;
			}
			int gcdv = gcdAns.gcd(no1, no2);
			System.out.println("GCD of numbers is" + gcdv);
		} else
			System.out.println("Enter both numbers positive");
	}

	int gcd(int x, int y) // Function for calculating GCD
	{
		int gcdv;
		if (y % x != 0) {
			int temp = x;
			x = y % x;
			y = temp;
			gcdv = gcd(x, y);
		} else
			gcdv = x;
		return gcdv;
	}
}
