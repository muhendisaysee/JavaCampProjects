package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean checkUserEMail(User user);
	boolean eMailValidator(User user);
	void eMailSend(User user);
	boolean eMailVerification(User user);
	
}
