package oopHomework2;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()
				+ " Adli Egitimcinin Kayit Islemi Basariyla Gerceklestirildi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()
				+ " Adli Egitimcinin Silme Islemi Basariyla Gerceklestirildi");
	}

	public void returnLessons(String[] lessonList) {
		for (String lessons : lessonList) {
			System.out.println(lessons);
		}
	}

}
