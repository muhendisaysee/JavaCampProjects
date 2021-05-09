package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity{
	int id;
	String name;
	String duration;
	
	public Campaign() {
		
		
	}
	
	public Campaign(int id, String name, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
