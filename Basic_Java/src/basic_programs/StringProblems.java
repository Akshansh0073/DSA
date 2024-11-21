package basic_programs;

import java.util.Stack;

public class StringProblems {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("akshansh","akshanhsa"));
		
		System.out.println(isWellFormed("({[()]})"));
		
		
		String s1 ="121";
		String s2 = "123";
		int i = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(i);

	}

	private static boolean isWellFormed(String string) {
		
		Stack<Character> st = new Stack();
		
		for(int i=0;i<string.length();i++) {
			char ch = string.charAt(i);
			
			if(st.empty())
			{
				st.push(ch);
			}
			else if (ch=='(' || ch=='{'|| ch=='[') {
				st.push(ch);
			}
			else if(ch==')' && st.peek()=='(') {
				st.pop();
			}
			else if(ch=='}' && st.peek()=='{') {
				st.pop();
			}
			else if(ch==']' && st.peek()=='[') {
				st.pop();
				
			} else {
				return false;
			}
		}
		if (st.empty()) return true;
		return false;
	}

	private static boolean isAnagram(String string, String string2) {
		
		int[] count = new int[256];
		
		if(string.length()!=string2.length()) return false;
		
		for (int i=0;i<string.length();i++) {
			count[string.charAt(i)]++;
			count[string2.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
