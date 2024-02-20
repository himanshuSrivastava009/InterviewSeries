package selenium.interview.series;

public class UpperToLowerCase {

	static String st ="";
	
	public static void upperToLower(String str) {
	
		
		for(int i=0;i<str.length();i++) {
			
			int val	= str.charAt(i);
			
			if(val>=65 && val < 97) {
				
				val = val + 32;
				st = st+(char)val;
			}
			else {
				val = val - 32;
				System.out.println("Value = " +val);
				st = st+(char)val;
			}
		}
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		
		upperToLower("HiManSHU");
		
		String s = "Aa";
		
		System.out.println((int)s.charAt(0));
		System.out.println((int)s.charAt(1));
		
				
	}
	
}
