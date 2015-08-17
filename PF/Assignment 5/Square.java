package Assignments;

/**
 * @author Anjita
 * class Square implementing Shape class
 * Defined both functions of Interface Shape i.e. draw and getArea
 */
public class Square implements Shape {
	private int side;

	/**
	 * @param constructor sets value of side
	 */
	public Square(int side) {
		this.side = side;
	}

	public void draw() {
		System.out.println("This is a square");
	}

	public double getArea() {
		return side * side;
	}

}
