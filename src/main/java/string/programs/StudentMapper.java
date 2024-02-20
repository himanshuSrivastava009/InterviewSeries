package string.programs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import selenium.interview.series.Details;

public class StudentMapper {

	
	public static void main(String[] args) throws JsonProcessingException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		StudentPojo student = new StudentPojo("Himanshu", 0, 0);
		ExportStudents export = new ExportStudents("PDF","Done");
		
		FormData data = new FormData(student,export);
		
		String writeValueAsString = mapper.writeValueAsString(data);
		
		System.out.println(writeValueAsString);
		
		BuilderTest test = new BuilderTest();
		Details builderTest = test.setCity("ranchi")
				.setName("Himanshu")
				.setPincode(834003)
				.setState("Jharkhand")
				.build();
		
		
		 System.out.println(builderTest);
		 
		 Class<?> c = Class.forName("string.programs.StudentPojo");
		 Object newInstance = (StudentPojo)c.newInstance();
		 System.out.println(c.getName());
		 Method[] methods = c.getDeclaredMethods();
		 
		 for(Method m : methods) {
			 
			String name = m.getName();
			if(name.equals("setName")) {
				
				m.invoke(newInstance,"Chipundi Is Indi Mindi");
			}
			
		//	m.invoke(newInstance);
		 }
		 for(Method m : methods) {
			 
				String name = m.getName();
				if(name.equals("getName")) {
					
				System.out.println(m.invoke(newInstance));
				}
				
				//m.invoke(newInstance);
			 }
		
		// System.out.println(c.getMethod("getName"));
	}
}
