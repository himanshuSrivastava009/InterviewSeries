package string.programs;

public class FormData {

	private StudentPojo student;
	private ExportStudents export;
	
	public FormData() {
		
	}
	
	public FormData(StudentPojo student, ExportStudents export) {
		super();
		this.student = student;
		this.export = export;
	}

	public StudentPojo getStudent() {
		return student;
	}

	public void setStudent(StudentPojo student) {
		this.student = student;
	}

	public ExportStudents getExport() {
		return export;
	}

	public void setExport(ExportStudents export) {
		this.export = export;
	}
	
	
	
	
}
