package com.basecodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQuestion {

	private static int findMaxValue(int[] marks) {
		int l = marks[0];

		for (int i = 1; i < marks.length; i++) {

			if (l < marks[i]) {

				l = marks[i];

			}
		}
		return l;
	}
	
	private static int[] reverseArray(int[] marks) {
		int k = marks.length;

		// 1 approach
		for (int i = 0; i < k / 2; i++) {

			int temp = marks[i];
			marks[i] = marks[k - i - 1];
			marks[k - i - 1] = temp;
		}

		// 2 approach
//		int rev [] = new int[k];
//		for (int i =0;i<k;i++) {
//			rev[i]=marks[k-i-1];
//		}
//
		return marks;
	}
	
	private static int sumOfElement(int[] marks) {
		int sum = 0;

		for (int i = 0; i < marks.length; i++) {

			sum += marks[i];
		}
		return sum;
	}
	
	private static int countOccurence(int[] marks, int k) {
		int count = 0;

		for (int i = 0; i < marks.length; i++) {

			if(k == marks[i]) {
				count++;
			}
		}
		return count;
	}
	private static ArrayList<String> sumPairs(int[] marks, int k) {

		ArrayList<String> pairsList = new ArrayList<>();

        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] + marks[j] == k) {
                    // Format each pair as a string and add it to the list
                    pairsList.add("[" + marks[i] + ", " + marks[j] + "]");
                }
            }
        }
        return pairsList;

	}
	
	private static int secondLarge(int[] marks) {
		int large = marks[0];
		int sec = marks[1];

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] > large) {          //1,2,3,4,54,3,3,534,4
				sec = large;     /// Important libne to execute kuki jruri nhi h sec condition m jaye hi jaye
				large = marks[i];
			} else if (marks[i] > sec && marks[i] != large) {
				sec = marks[i];
			}
		}
		return sec;
	}
	
	private static int secondSmall(int[] marks) {
		int small = marks[0];
		int sec = marks[1];

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] < small) {          //1,2,3,4,54,3,3,534,4
				sec = small;     /// Important libne to execute kuki jruri nhi h sec condition m jaye hi jaye
				small = marks[i];
			} else if (marks[i] < sec && marks[i] > small) {
				sec = marks[i];
			}
		}
		return sec;
	}
	
	private static int missingNumber(int[] marks) {
		int count=marks[0];
		int miss=0;
		

		for (int i = 0; i < marks.length; i++) {
			if(count==marks[i]) {
				count++;
			} else {
				miss = count;
			}
			
		}
		return miss;
		
	}
	
	private static int maxProduct(int[] marks) {
		int dn=Integer.MIN_VALUE;
		
		

		for (int i = 0; i < marks.length; i++) {
			for (int j=i+1;j<marks.length;j++) {
				
				if(dn < Math.abs(marks[i]*marks[j])) {
					dn = Math.abs(marks[i]*marks[j]);
			}
		}
	}
		return dn;
		}
		
		
	private static int findDuplicateNumber(int[] marks) {
		int dn=0;
		

		for (int i = 0; i < marks.length; i++) {
			for (int j=i+1;j<marks.length;j++) {
				if (marks[i]==marks[j]) {
					dn = marks[i];
					break;
				}
			}
			
		}
		return dn;
		
	}
	
	private static int[] sortedArray(int[] marks) {
		int k =marks.length;
		
		for (int i=0;i<k;i++) {
			for (int j=0;j<k-1-i;j++) {
				
				if(marks[j]>marks[j+1]) {
				int temp=marks[j];
				marks[j]=marks[j+1];
				marks[j+1]=temp;
				}
				
			}
		}
		return marks;
	}
	
	private static int[] sumOfEvenAndOdd(int[] marks) {
		int k =marks.length;
		int k1[] = new int[2];
		int evenSum=0,oddSum =0;
		for (int i=0;i<k;i++) {
			if(marks[i]%2==0) {
				evenSum += marks[i];
			} else {
				oddSum += marks[i];
			}
		}
		k1[0]=evenSum;
		k1[1]=oddSum;
		return k1;
	}
	
	private static int[] mergeTwoSortedArray(int[] marks, int[] num) {
		int n =marks.length;
		int m = num.length;
		int count=0,c1=0;
		int k1[] = new int[n+m];
		
		for(int i=0;i<n+m;i++) {
			
			k1[i++]=marks[count++];
			k1[i]=num[c1++];
		}
		
		sortedArray(k1);
		return k1;
		
	}
	
	private static boolean checkedSortedArray(int[] marks) {
		int k = marks.length;
		boolean isTrue = true;

		for (int i = 0; i < k - 1; i++) {

			if (marks[i] > marks[i + 1]) {
				isTrue = false;
				break;

			}

		}

		return isTrue;
	}
	
	private static int[] moveZeroes(int[] marks) {
		int k =marks.length;
		
		// 1 approach
//		for (int i=0;i<k;i++) {
//			
//			for(int j=i;j<k-1;j++)
//			
//			if(marks[j]==0) {
//				
//				int temp = marks[j];
//				marks[j]=marks[j+1];
//				marks[j+1]= temp;
//			}
//				
//			
//		}
		int count =0;
		int arr[] = new int [k];
		for (int i=0;i<k;i++) {
			if(marks[i]!=0) {
				arr[count] = marks[i];
				count++;
			} else {
				arr[k-count-1]=0;
			}
		}	
		return arr;
	}
	
	private static int[] leftRotate(int[] marks, int n) {
		int k =marks.length;
		
		// 1 approach
		for (int i=0;i<n;i++) {
			
			for(int j=0;j<k-1;j++)
			
			{
				int temp = marks[j];
				marks[j]=marks[j+1];
				marks[j+1]= temp;
			}
				
			
		}
		return marks;
	}
	
	private static int[] rightRotate(int[] marks, int n) {
		int k =marks.length;
		
		// 1 approach
		for (int i=0;i<n;i++) {
			
			for(int j=k-1;j>=1;j--)
			
			{
				int temp = marks[j];
				marks[j]=marks[j-1];
				marks[j-1]= temp;
			}
				
			
		}
		return marks;
	}
	
	private static int[] seperateZeroes(int[] marks) {
		int k =marks.length;
		int[] a = new int[k];
		int zero =0, one =0, two =0;
		// 1 approach
		for (int i=0;i<k;i++) {
			if(marks[i]==0) {
				zero++;
			}
			if(marks[i]==1) {
				one++;
			}
			if(marks[i]==2) {
				two++;
			}	
		}
		while(two>0) {
			a[zero+one+two-1]=2;
			two--;
		}
		while(one>0) {
			a[zero+one-1]=1;
			one--;
		}
		while(zero>0) {
			a[zero-1]=0;
			zero--;
		}
		return a;
	}
	
	private static ArrayList removeDuplicates(int[] marks) {
		int k =marks.length;
		
		ArrayList <Integer> a = new ArrayList();
		
		for (int i=0;i<k; i++) {
			
			if (!a.contains(marks[i])) {
				a.add(marks[i]);
			}
		}
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
		//1 max value in an array
		int marks[] = {1,0,2,0,3,4,0,54,0,0,0,3,3,534,534,4};
		int l = findMaxValue(marks);
		System.out.println(l);
		
		
		//2   reverse an array
		int [] l1 = reverseArray(marks);
		System.out.println(Arrays.toString(l1));
		
		//3  sum value
		int sum =  sumOfElement(marks);
		System.out.println(sum);
		
		//4 number of count of an element
		int count = countOccurence(marks, 3);
		System.out.println(count);
		
		//5 second large
		int sec = secondLarge(marks);
		System.out.println(sec);
		
		//5 second small
		int sec1 = secondSmall(marks);
		System.out.println(sec1);
		
		//8 MoveZeroes Array
		int [] moveZeroes = moveZeroes(marks);
		System.out.println(Arrays.toString(moveZeroes));
		
		//7 Sorted Array
		boolean checkSortedArray = checkedSortedArray(marks);
		System.out.println(checkSortedArray);
		
		//6 Sorted Array
		int [] sortedArray = sortedArray(marks);
		System.out.println(Arrays.toString(sortedArray));
		
		//9 Sorted Array
		int [] sumOfEvenAndOdd = sumOfEvenAndOdd(marks);
		System.out.println(Arrays.toString(sumOfEvenAndOdd));
		
		int a[] = {1,3,5,5,234,3462,7542,74783,78346};
		int b[] = {2,4,6,45,73,46,673,7356,5376};

		//9 Sorted Array
		int [] mergeTwoSortedArray = mergeTwoSortedArray(a,b);
		System.out.println(Arrays.toString(mergeTwoSortedArray));
		
		//10 Left rotate by k
		int [] leftRotate = leftRotate(a,2);
		System.out.println(Arrays.toString(leftRotate));
		
		//10 Right rotate by k
		int [] rightRotate = rightRotate(a,2);
		System.out.println(Arrays.toString(rightRotate));
		
		
		// Remove duplicates
		int a1[] = {1,1,1,1,1,2,3,4,5,6,75,54,4,4,4,4,4};
		ArrayList removeDuplicates = removeDuplicates(a1);
		System.out.println(removeDuplicates);
		
		int a2[] = {1,2,3,3,4,6,6};
		System.out.println(missingNumber(a2));
		
		
		System.out.println(findDuplicateNumber(a2));
		
		System.out.println(sumPairs(a2, 6));

		int a3[] = {1,2,3,3,4,6,-6};
		System.out.println(maxProduct(a3));
		
		int a4[] = {0,1,2,0,0,1,1,2,2,2,1,1};
		System.out.println(Arrays.toString(seperateZeroes(a4)));
	
	}



}
