package com.basecodes;

import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		
		List a = List.of(1,2,3,4,5,6,5,6,6);
		
		ArrayList a1 = new ArrayList();
		
		for(int i=0;i<a.size()-1;i++) {
			
			if(!a1.contains(a.get(i))) {
				a1.add(a.get(i));
			}
		}
		
			System.out.println(a1);
	}

}
