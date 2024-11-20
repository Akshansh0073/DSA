package com.basecodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		boolean isTrue= false;
		
		for (int i=2;i<=Math.sqrt(a);i++) {
			
			if(a<=2) {
				System.out.println(a + " is a prime number");
			}
			if (a%i==0) {
				isTrue = true;
				break;
			}
		}
		if (!isTrue) { System.out.println(a + " is a prime number");
		} else {
			System.out.println("Not prime");
		}

		
	} 

}
