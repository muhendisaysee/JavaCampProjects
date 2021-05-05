
public class Instructor extends User{

	private String branch;
	private String numberOfStudent;
	
	public Instructor() {
		
	}
	public Instructor(String branch, String numberOfStudent) {
		super();
		this.branch = branch;
		this.numberOfStudent = numberOfStudent;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(String numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	
	
	
}
