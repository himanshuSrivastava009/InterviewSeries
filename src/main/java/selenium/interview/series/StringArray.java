package selenium.interview.series;

public class StringArray {

	public static int countWords(String str) {

		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ') {

				count++;
			}

		}
		if (str.charAt(str.length() - 1) != ' ') {
			count++;
		}

		return count;
	}

	public static void reverseStringOnSamePosition(String str) {
		//Hello How Are you
		int length = countWords(str);
		String st = "";
		int count =0;
		String[] arr = new String[length];
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				
				st = st+str.charAt(i);
			}
			else if(st.length()>0) {
					arr[count] = st;
					st="";
					count++;
			}
		}
		

		if (str.charAt(str.length() - 1) != ' ')	
			arr[length-1]=st;

	System.out.println(arr.length);
	System.out.println(arr[0]+" |"+arr[1]+" |"+arr[2]+" |"+arr[3]);
	
	String rev = "";
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=arr[i].length()-1;j>=0;j--) {
			
			rev = rev+arr[i].charAt(j);
		}
		System.out.print(rev+" ");
		rev = "";
	}
	
	//System.out.println(rev);

	}

	public static void main(String[] args) {
		
		int count = countWords(" ");
		System.out.println(count);
		
		reverseStringOnSamePosition("   Hello   how  are   you himanshu  ");
	}
}
