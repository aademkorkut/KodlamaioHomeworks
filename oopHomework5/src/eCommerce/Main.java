package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.GoogleUserServiceImpl;
import eCommerce.business.concretes.MyUserServiceImpl;
import eCommerce.business.concretes.RegisterCheckManager;
import eCommerce.dataAccess.concretes.HibernateUser;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService myUserService = new MyUserServiceImpl(new RegisterCheckManager(), new HibernateUser());

		UserService googleUserService = new GoogleUserServiceImpl(new HibernateUser());

		System.out.println("----------------------------------");
		User user = new User(0, "Adem", "Korkut", "123456", "adem@gmail.com");
		myUserService.registerUser(user);
		myUserService.signIn(user);

		System.out.println("----------------------------------");
		User user2 = new User(0, "Ali", "Veli", "ali123", "adem@gmail.com");
		myUserService.registerUser(user2);
		// userManager.signIn(user2);

		System.out.println("----------------------------------");
		User user3 = new User(0, "Ahmet", "Korkut", "ahmet123", "ahmet@gmail.com");
		googleUserService.registerUser(user3);
		googleUserService.signIn(user3);

	}

}
