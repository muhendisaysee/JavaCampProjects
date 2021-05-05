
public class User {

	private String IdentificationNumber;
	private String firstName;
	private String lastName;
	
	public User() {
		
	}
	
	public User(String identificationNumber, String firstName, String lastName) {
	
		IdentificationNumber = identificationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getIdentificationNumber() {
		return IdentificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		IdentificationNumber = identificationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
