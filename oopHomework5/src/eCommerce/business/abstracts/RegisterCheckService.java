package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface RegisterCheckService {

	boolean checkPassword(String password);

	boolean checkEmail(String email);

	boolean checkFirstName(String firstName);

	boolean checkLastName(String lastName);

	boolean checkEmailDuplicate(List<User> list, String mail);

	void sendEmailForRegister(String mail);

	boolean checkEmailConfirmation(String mail);

}
