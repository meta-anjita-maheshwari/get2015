package Assignments;
/**
 * @author Anjita
 * class circle implements shape interface.
 * variable radius is for storing value of radius circle.
 */
public class Circle implements Shape {
	private int radius;
/**
 * constructor sets value of radius
 * @param radius
 */
	public Circle(int radius)
	{
		this.radius = radius;
	}
/**
 * function draw shows that the function is in circle class.	
 */
	public void draw()
	{ 

		System.out.println("this is circle");
	}
/**
*getArea returns area of the shape circle.
*/
	public double getArea(){

		return (3.14*radius*radius);
	}

}
