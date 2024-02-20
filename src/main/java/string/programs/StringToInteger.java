package string.programs;

public class StringToInteger {

	
	public static void main(String[] args) {
		int num =0;
		String str = "12345";
		for(int i=0;i<str.length();i++) {
			
			System.out.println((int)str.charAt(i));
			num = num*10+(int)str.charAt(i)-48;
			System.out.println(num);
		}
	}
}
