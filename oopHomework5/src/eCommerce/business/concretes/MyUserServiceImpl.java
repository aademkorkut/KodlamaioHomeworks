package eCommerce.business.concretes;

import eCommerce.business.abstracts.RegisterCheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class MyUserServiceImpl implements UserService {

	private RegisterCheckService registerCheckService;
	private UserDao userDao;

	public MyUserServiceImpl(RegisterCheckService registerCheckService, UserDao userDao) {
		this.registerCheckService = registerCheckService;
		this.userDao = userDao;
	}

	@Override
	public void registerUser(User user) {
		if (registerCheckService.checkPassword(user.getPassword()) && registerCheckService.checkEmail(user.getEmail())
				&& registerCheckService.checkFirstName(user.getFirstName())
				&& registerCheckService.checkLastName(user.getLastName())
				&& registerCheckService.checkEmailDuplicate(userDao.getAll(), user.getEmail())) {

			registerCheckService.sendEmailForRegister(user.getEmail());
			if (registerCheckService.checkEmailConfirmation(user.getEmail())) {
				System.out.println("User Register Successful...!");
				userDao.saveToDatabase(user);
			}
		} else
			System.out.println("User Register Unsuccessful...!");

	}

	@Override
	public void signIn(User user) {
		if (user.getEmail().length() == 0 || user.getPassword().length() == 0) {
			System.out.println("Password-Mail required for login...!");
		} else
			System.out.println(user.getFirstName() + user.getLastName() + " Login successful...!");

	}

}
