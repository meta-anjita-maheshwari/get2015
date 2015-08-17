package Assignments;

/**
 * @author Anjita
 * class Student extending Person class
 * variables
 * studentId :- student ID of student
 * course :- sets courses of student
 */
public class Student extends Person {
	private int studentId;
	private String[] courses;

	public Student(int uid, String name, int studentId, String[] courses) {
		super(uid, name);
		this.studentId = studentId;
		this.courses = courses;
	}

	/**
	 * @return student id of student
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param sets studentId of student
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return courses of student
	 */
	public String[] getCourses() {
		return courses;
	}

	/**
	 * @param sets courses of student
	 */
	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String toString() {
		return super.toString() + "\nStudent ID :-" + studentId;
	}

}
