package string.programs;

public class ExportStudents {

	
	private String formType;
	private String fromDetails;
	
	public ExportStudents() {
		
	}
	
	public ExportStudents(String formType, String fromDetails) {
		super();
		this.formType = formType;
		this.fromDetails = fromDetails;
	}
	public String getFormType() {
		return formType;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getFromDetails() {
		return fromDetails;
	}
	public void setFromDetails(String fromDetails) {
		this.fromDetails = fromDetails;
	}
	
	
}
