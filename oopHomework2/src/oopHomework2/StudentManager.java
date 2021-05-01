package oopHomework2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()
				+ " Adli Ogrenci Kayit Islemi Basariyla Gerceklestirildi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()
				+ " Adli Ogrenci Silme Islemi Basariyla Gerceklestirildi");
	}

	public void returnLessons(String[] lessonsList) {
		for (String lessons : lessonsList) {
			System.out.println(lessons);
		}
	}
}
