package oopHomework2;

public class Student extends User {

	private String[] studentLessons;
	private int studentEndingLessons;

	public Student() {

	}

	public Student(String[] studentLessons, int studentEndingLessons, double grade) {
		super();
		this.studentLessons = studentLessons;
		this.studentEndingLessons = studentEndingLessons;
	}

	public String[] getStudentLessons() {
		return studentLessons;
	}

	public void setStudentLessons(String[] studentLessons) {
		this.studentLessons = studentLessons;
	}

	public int getStudentEndingLessons() {
		return studentEndingLessons;
	}

	public void setStudentEndingLessons(int studentEndingLessons) {
		this.studentEndingLessons = studentEndingLessons;
	}

	public double getStudentGrade() {
		return this.studentEndingLessons * 8.5;
	}

}
