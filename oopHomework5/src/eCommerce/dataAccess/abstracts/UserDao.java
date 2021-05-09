package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {

	void saveToDatabase(User user);

	List<User> getAll();
}
