
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		student1.setFirstName("Ogrenci1 isim");
		student1.setLastName("Ogrenci1 soyisim");
		
		Student student2 = new Student();
		student2.setFirstName("Ogrenci2 isim");
		student2.setLastName("Ogrenci2 soyisim");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Eğitmen1 isim");
		instructor.setLastName("Eğitmen1 soyisim");
		
		
		User[] users = {student1 , student2 , instructor};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.logIn();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn();
		
	}

}
