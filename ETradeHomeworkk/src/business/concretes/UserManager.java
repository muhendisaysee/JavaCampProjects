package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.UserAccountService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private UserAccountService userAccountService;
	
	public UserManager(UserDao userDao,UserAccountService userAccountService) {
		super();
		this.userDao = userDao;
		this.userAccountService = userAccountService;
		
	}

	@Override
	public void add(User user) {
		
		boolean check = true;
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olusmalýdýr.");
			check = false;
		}
		if((user.getName()+user.getSurname()).length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakterden olusmalidir.");
			check = false;
		}
		if(!userDao.checkUserEMail(user)) {
			System.out.println("Bu mail sistemde kayitli");
			check = false;
		}
				
		if(!userDao.eMailValidator(user)) {
			System.out.println("Gecersiz e mail");
			check = false;
		}
		if(check == true) {
			userDao.eMailSend(user);
			System.out.println("Dogrulama maili gonderildi");
		}
		
		if(check == true && userDao.eMailValidator(user)) {
			System.out.println("KAYIT BASARILI");
		}
		else if(check == false || !userDao.eMailValidator(user)) {
			System.out.println("Kayýt BASARISIZ");
		}
	}

	@Override
	public void sigin(User user) {
		if(user.geteMail() == null || user.getPassword() == null) {
			System.out.println("E mail ve parola zorunludur !");
			System.out.println("Giris basarisiz");
		}
		else {
			System.out.println("Giris basarili");
		}
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
