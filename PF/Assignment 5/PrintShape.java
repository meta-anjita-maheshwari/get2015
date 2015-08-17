package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Anjita
 * main class which is used to print circle and square shape information i.e. draw and area of shapes.
 */
public class PrintShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int rad = sc.nextInt();
		System.out.println("Enter side of square");
		int side = sc.nextInt();
		Shape circleShape = new Circle(rad);
		Shape squareArea = new Square(side);
		circleShape.draw();
		printShape(circleShape);
		squareArea.draw();
		printShape(squareArea);
		System.out.println("Execution through list");
		List<Shape> shape = new ArrayList<Shape>();
		Shape circleAgain = new Circle(rad);
		// created the object of Shape and reference is of Circle class.
		Shape squareAgain = new Square(side);
		// created the object of Shape and reference of Square class.
		shape.add(circleAgain);
		shape.add(squareAgain);
		Iterator<Shape> itr = shape.iterator();
		// iterator is used to use every object.
		while (itr.hasNext()) {
			Shape s1 = itr.next();
			s1.draw();
			printShape(s1);
		}
		sc.close();
	}

	static void printShape(Shape shape) {
		System.out.println("Area of shape is" + shape.getArea());
	}

}
