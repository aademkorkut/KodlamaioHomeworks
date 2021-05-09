package eCommerce.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.RegisterCheckService;
import eCommerce.entities.concretes.User;

public class RegisterCheckManager implements RegisterCheckService {

	@Override
	public boolean checkPassword(String password) {
		if (password.length() >= 6) {
			return true;
		} else
			System.out.println("Password must be at least 6 digits");
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.out.println("Invalid e-mail address");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() >= 2) {
			return true;
		} else
			System.out.println("FirstName must be at least 2 digits");
		return false;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length() >= 2) {
			return true;
		} else
			System.out.println("LastName must be at least 2 digits");
		return false;
	}

	@Override
	public boolean checkEmailDuplicate(List<User> list, String mail) {
		for (User users : list) {
			if (users.getEmail().equals(mail)) {
				System.out.println("E-mail address has been used..!");
				return false;
			}
		}
		return true;
	}

	@Override
	public void sendEmailForRegister(String mail) {
		// Ýþlem Kodlarý

		System.out.println("Mail confirmation sent to " + mail);
	}

	@Override
	public boolean checkEmailConfirmation(String mail) {
		// Ýþlem Kodlarý

		System.out.println(mail + " Accepted mail confirmation");
		return true;
	}

}
