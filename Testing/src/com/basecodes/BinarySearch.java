package com.basecodes;



public class BinarySearch {
	
	public static int binarySearchIndex (int arr[], int target) {
		
		int low=0;
		int high = arr.length-1;
		int i =0;
		while (low<=high) {
			System.out.println(" pass " +i);
			i++;
			
			int mid = low + (high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(target > arr[mid]) {
				low=mid+1;
			}
			if(target < arr[mid]) {
				high = mid-1;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8};    // should be sorted
		int a1= binarySearchIndex(a, 7);
		System.out.println(a1);
	}
}
