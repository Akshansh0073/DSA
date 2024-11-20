package com.basecodes;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;
		ArrayList<Integer> a = new ArrayList();
		
		
		for (int i=2; i<=n; i++) {
			
			if (i<=3) {
				a.add(i);
			}
			for (int j=2;j<=Math.sqrt(i);j++) {
				
				b=false;
				
				if(i%j == 0) {
					break;
				} else {
					b=true;
				}
				
			}
			if(b) {
				a.add(i);
			}
			
		}
		
		System.out.println(a);
		

	}

}
