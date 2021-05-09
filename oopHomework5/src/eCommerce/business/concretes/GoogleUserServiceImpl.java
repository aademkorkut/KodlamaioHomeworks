package eCommerce.business.concretes;

import eCommerce.RegisterWS.GoogleUserRegisterWS;
import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class GoogleUserServiceImpl implements UserService {

	private UserDao userDao;

	public GoogleUserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void registerUser(User user) {
		GoogleUserRegisterWS googleUserRegisterWS = new GoogleUserRegisterWS();
		googleUserRegisterWS.googleRegisterWS();
		userDao.saveToDatabase(user);
	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " Login successful from Google...!");

	}

}
