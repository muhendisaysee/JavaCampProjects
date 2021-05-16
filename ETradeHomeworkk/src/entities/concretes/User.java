package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private String name;
	private String surname;
	private String eMail;
	private String password;
	
	public User() {
		
	}

	public User(String name, String surname, String eMail, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
