import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleAccountAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAccountAdapter());
		//Hatasýz kayit
		User user1 = new User("Ayse", "Ozavci", "ayseeozavci@gmail.com", "deneme");
		//E-mail yanlis
		User user2 = new User("Fatma", "Ozavci", "fatmaozavc.com", "deneme");
		//Sifre kisa
		User user3 = new User("Mehmet", "Ozavci", "mehmetozavci@gmail.com", "dene");
		//E-posta ve parola zorunlu
		User user4 = new User("Mehmet", "Ozavci", null, null);
		
		userService.add(user1);
		System.out.println("-------------------------------");
		userService.add(user2);
		System.out.println("-------------------------------");
		userService.add(user3);
		System.out.println("-------------------------------");
		userService.sigin(user4);
		System.out.println("-------------------------------");
		
		
	}

}
