package account;

import entities.concretes.User;

public class GoogleAccount {
	public void googleAccountCheck(User user) {
		System.out.println("Signed up with google account : "+ user.geteMail());
	}
}
