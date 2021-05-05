
public class Student extends User{

	private String grade;
	private String numberOfLesson;
	
	public Student() {
		
	}
	
	public Student(String grade, String numberOfLesson) {
		super();
		this.grade = grade;
		this.numberOfLesson = numberOfLesson;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getNumberOfLesson() {
		return numberOfLesson;
	}

	public void setNumberOfLesson(String numberOfLesson) {
		this.numberOfLesson = numberOfLesson;
	}
	
	
	
}
