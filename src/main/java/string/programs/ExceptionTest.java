package string.programs;

public class ExceptionTest {

	public static String test() {
		
		
		try {
			System.exit(0);
			return "String";
		}
		
		catch (Exception e) {
			
		}
		
		finally {
			
			System.out.println("In Final Block");
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}
}
