package string.programs;

public class StudentPojo {

	
	private String name;
	private int classNumber;
	private int pendingFees;
	
	
	public StudentPojo() {
		
	}
	
	public StudentPojo(String name, int classNumber, int pendingFees) {
		super();
		this.name = name;
		this.classNumber = classNumber;
		this.pendingFees = pendingFees;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getPendingFees() {
		return pendingFees;
	}
	public void setPendingFees(int pendingFees) {
		this.pendingFees = pendingFees;
	}

	
}
