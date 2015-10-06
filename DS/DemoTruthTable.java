/**
 * Write a Java program that will take a boolean expression in infix form as an input, and will display the truth table for that boolean expression. For parsing you can assume that- 

a) variables in boolean expression are single character long
b) there are no white spaces in the expression
c) expression is made of only three types of operators and(&), or (|) and not (~)
d) precedence of operators is as follows- not (~) > and (&) > or (|)
e)  and (&) associates from left to right, or (|) associates from left to right, not (~) associates from right to left
f) expression may have parentheses 

 */
package Assignment2;

/**
 * @author Anjita
 * Class Demonstrating truth table of boolean expression
 */
public class DemoTruthTable {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = sc.next();
		input = input.toLowerCase();
		if (Validation.isExpression(input)) {
			TruthTableGenerator truthTableObj = new TruthTableGenerator();
			truthTableObj.truthTableGenerator(input);
		} else {
			System.out.println("Enter Valid Expression");
		}
		sc.close();
	}
}
