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
 * 
 */
public class Validation {

	/** 
	 * Method to validate expression
	 * @param expression : expression to validate 
	 * @return true if validated, false otherwise
	 */
	public static boolean isExpression(String expression) 
	{
		if(expression == null)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int openCount = 0, closeCount = 0;
	    int i = 0;
	    
	    /* validation for two consecutive letters or numbers */
	    for(i = 0; i < (length-1); i++)
	    {
			
	    	if((Character.isLetter(expressionArray[i])))
	    	{
	    		if(Character.isLetter(expressionArray[i+1]) || expressionArray[i+1] == '(')
	    				return false;
	    	}
	    	if(expressionArray[i] == ')')
	    	{
	    		if(expressionArray[i+1] == '(')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == ')' || Character.isLetter(expressionArray[i]))
	    	{
	    		if(expressionArray[i+1] == '~')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == '&' || expressionArray[i] == '|')
	    	{
	    		if(expressionArray[i+1] == '&' || expressionArray[i+1] == '|')
	    				return false;
	    	}
	    }

	    /* validation for first character is operator */
	    if(expressionArray[0] == '&' || expressionArray[0] == '|' || expressionArray[length-1] == '&' || expressionArray[length-1] == '|' || expressionArray[length-1] == '~')
	    	return false;
	    
	    /* Validation for acceptable symbols number or open and closed braces */
	   for (char c : expressionArray) 
	    {
	    	if(!(Character.isLetter(c)) && !(c == '&') && !(c == '|') && !(c == '~') && !(c == '(') && !(c == ')')) {
	    		return false;
	    	}
	        else
	        {
	        	if(c == '(')
	        		openCount++;
	            else if(c == ')')
	            	closeCount++;
	        }
	    }
	    if(openCount == closeCount)
	    	return true;
	    else
	    	return false;
	}
}
