package basic_programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems {

	public static void main(String[] args) {
		
//		//1
	    int[] a = {1,2,3,4,5,3,5,7,6,8};
	    List b5 = removeDuplicates(a);
		System.out.println(b5);
		int b = maxNumber(a);
		System.out.println(b);
		
		//2
		int[] b1 = reverseInt(a);
		System.out.println(Arrays.toString(b1));
		
		//3**
		int b3 = maxSecondNumber(a);
		System.out.println(b3);
		
		//4
		int[] a1 = {1,3,5,6,7};
		int a2[] = {2,4,6,8};
		int [] b4 = mergeArray(a1,a2);
		
		System.out.println(Arrays.toString(b4));
		
		//5
		System.out.println(isSorted(a));
		
		int a3[] = {1,3,2,5,4,7,8,6,10};
		System.out.println(missingNumber(a3));
		
		int a4[] = {1,2,3,4,3,5};
		System.out.println(duplicateNumber(a4));
		
		int a5=7;
		List<List<Integer>> b6 = allPairsOfTargetSum(a4,a5);
		System.out.println(b6);
		
		int a6 [] = {0,1,2,0,2,1,2,0};
		System.out.println(Arrays.toString(sorted(a6)));

	}

	private static int[] sorted(int[] a6) {
		int temp=0;
		for(int i=0;i<a6.length;i++) {
			for(int j=i+1;j<a6.length;j++) {
				if(a6[i]>a6[j]) {
					temp = a6[j];
					a6[j]=a6[i];
					a6[i]=temp;
				}
			}
		}
		return a6;
	}

	private static List<List<Integer>> allPairsOfTargetSum(int[] a, int b) {
		
		List<List<Integer>> a2 = new ArrayList<List<Integer>>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]+a[j]==b) {
					
				List<Integer> a1 = Arrays.asList(a[i], a[j]);
				if(!a2.contains(a1)) a2.add(a1);
				}
			}
			
		}
		return a2;
	}

	private static int duplicateNumber(int[] a4) {
		Arrays.sort(a4);
		int duplicate =0;
		for (int i=0;i<a4.length-1;i++) {
			if(a4[i]==a4[i+1]) {
				duplicate = a4[i];
				
			}
		}
		return duplicate;
	}

	private static int missingNumber(int[] a) {
		Arrays.sort(a);
		int miss = 0;
		for (int i=0;i<a.length-1;i++) {
			if(a[i+1]!=a[i]+1) {
				miss = a[i]+1;
			}
		}
		return miss;
	}

	private static List removeDuplicates(int[] a) {
		
		List a1 = new ArrayList();
		
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]!=a[j] && !a1.contains(a[i])) {
					a1.add(a[i]);
				}
			}
		}
		
		if(!a1.contains(a[a.length-1])) a1.add(a[a.length-1]);
		return a1;
	}

	private static boolean isSorted(int[] a1) {
		
		int c=0;
		for (int i=0;i<a1.length-1;i++) {
			if(a1[i]>a1[i+1]) {
				c++;
			}
		}
		if(c==0) return true;
		return false;
	}

	private static int[] mergeArray(int[] a1, int[] a2) {
		
		int length = a1.length + a2.length;
		int [] a3 = new int[length];
		
		for (int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for (int i=0;i<a2.length;i++) {
			a3[i + a1.length]=a2[i];
		}
		Arrays.sort(a3);		
		return a3;
	}

	private static int maxSecondNumber(int[] a) {
        int a1 = Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a1<a[i]) {
				second=a1;
				a1 = a[i];
			}
			if(second<a[i] && a[i]<a1) {
				second = a[i];
			}
		}
		return second;
	}


	private static int[] reverseInt(int[] a) {
		
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[a.length-1-i];
		}
		return b;
	}

	private static int maxNumber(int[] a) {
		int a1 = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a1<a[i]) {
				a1 = a[i];
			}
		}
		return a1;
	}

}
