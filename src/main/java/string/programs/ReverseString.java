package string.programs;

import java.util.HashMap;
import java.util.TreeMap;

public class ReverseString {

	
	public static void doReverse(String str) {
		
		String temp = "";
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			
			temp = temp + ch[i];
		}
		
		System.out.println("reverse String is = " +temp);
	}
	
	
	public static int countWords(String str) {
		
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				
				count++;
				
			}
			
		}
		
		//System.out.println("count = " +(count+1));
		return count;
	}
	
	public static void countCharecters(String str) {
		
		char[] ch = str.toCharArray();
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		
		doReverse("hello");
		int val = countWords("    Hello   How are    Himanshu        ji  ");
		System.out.println(val);
		countCharecters("mississippi");
	}
}
