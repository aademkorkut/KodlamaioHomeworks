package oopHomework2;

public class Main {

	public static void main(String[] args) {

		String[] educatorLessons = { "JAVA", "C++", "C#", "Python" };

		String[] studentLessons = { "JAVA", "C#" };

		Student student = new Student();
		student.setId(10);
		student.setFirstName("Adem");
		student.setLastName("Korkut");
		student.setEmail("adem@gmail.com");
		student.setStudentLessons(studentLessons);
		student.setStudentEndingLessons(2);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Adli Ogrencinin Basarý Puani : "
				+ student.getStudentGrade());
		studentManager.returnLessons(student.getStudentLessons());

		/*------------------------------------------------------------*/

		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(student);

		/*------------------------------------------------------------*/

		Instructor instructor = new Instructor();
		instructor.setId(20);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engin@gmail.com");
		instructor.setEducatorLessons(educatorLessons);
		instructor.setEducatorLevel("Senior");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.returnLessons(instructor.getEducatorLessons());

	}

}
