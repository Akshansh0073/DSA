package com.basecodes;

public class StringTutorial {

	public static void main(String[] args) {
		
		StringBuilder first = new StringBuilder("Akshansh");
		StringBuilder last = new StringBuilder("Sharma");
		int f=first.length();
		int l=last.length();
		first = first.append(last);
		
		
		
	}

}
