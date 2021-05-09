package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Player implements IEntity{
	private int id;
	private String nationalityId;
	private String name;
	private String surname;
	private LocalDate birth;
	
	public Player() {
		
	}

	public Player(int id, String nationalityId, String name, String surname, LocalDate birth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.name = name;
		this.surname = surname;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
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

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	
	
	
}
