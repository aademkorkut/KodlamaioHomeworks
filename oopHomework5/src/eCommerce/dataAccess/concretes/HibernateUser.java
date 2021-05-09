package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUser implements UserDao {

	private List<User> userList = new ArrayList<User>();

	@Override
	public void saveToDatabase(User user) {
		getUserList().add(user);
		System.out.println("User saved to Database");

	}

	@Override
	public List<User> getAll() {
		return getUserList();
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
