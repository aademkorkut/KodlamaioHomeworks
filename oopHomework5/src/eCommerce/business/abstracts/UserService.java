package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {

	void registerUser(User user);
	
	void signIn(User user);
}
