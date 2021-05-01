package oopHomework2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getId() + " Id'li Kaydin Kayit Ekleme Islemi Gerceklestirildi..! (Ortak Method)");
	}

	public void delete(User user) {
		System.out.println(user.getId() + " Id'li Kaydin Kayit Silme Islemi Gerceklestirildi..! (Ortak Method)");
	}

}
