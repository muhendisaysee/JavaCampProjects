package core;

import account.GoogleAccount;
import entities.concretes.User;

public class GoogleAccountAdapter implements UserAccountService{

	@Override
	public void accountService(User user) {
		GoogleAccount googleaccount = new GoogleAccount();
		googleaccount.googleAccountCheck(user);
	}



}
