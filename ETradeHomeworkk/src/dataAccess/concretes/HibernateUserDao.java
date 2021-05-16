package dataAccess.concretes;

import java.util.List;
import java.util.regex.Pattern;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> userList;
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getName());
		userList.add(user);
		
	}

	@Override
	public boolean checkUserEMail(User user) {
		if(userList == null) {
			return true;
		}
		else {
			for(User userList : userList) {
			if(userList.geteMail().equals(user.geteMail())) {
				return false;
			}
		}
		}
		
		return true;
	}

	@Override
	public boolean eMailValidator(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.geteMail()).find();
	}

	@Override
	public boolean eMailVerification(User user) {
		System.out.println("Mail doðrulandi " + user.geteMail());
		return true;
	
	}

	@Override
	public void eMailSend(User user) {
		System.out.println("E mail gonderildi. " + user.geteMail());
		
	}


}
