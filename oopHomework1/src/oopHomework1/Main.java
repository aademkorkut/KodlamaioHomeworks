package oopHomework1;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses(0, "JAVA Kursu ", 10);

		Courses course2 = new Courses(1, "C# Kursu ", 12);

		Courses[] courses = { course1, course2 };

		for (Courses course : courses) {
			System.out.println(course.id + " " + course.name + " " + course.educationTime);
		}

		System.out.println("-------------------------------");

		Educators educator1 = new Educators(0, "Engin Demirog ", "JAVA Eðitmeni");
		Educators educator2 = new Educators(1, "Ali Veli ", "C# Eðitmeni");

		Educators[] educators = { educator1, educator2 };

		for (Educators educator : educators) {
			System.out.println(educator.id + " " + educator.name + " " + educator.courseName);
		}

		System.out.println("-------------------------------");

		CoursesManager courseManager = new CoursesManager();

		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);

		courseManager.deleteToCourse(course1);
		courseManager.deleteToCourse(course2);

		System.out.println("-------------------------------");

		EducatorsManager educatorManager = new EducatorsManager();

		educatorManager.addToEducator(educator1);
		educatorManager.addToEducator(educator2);

		educatorManager.deleteToEducator(educator1);
		educatorManager.deleteToEducator(educator2);

	}

}
