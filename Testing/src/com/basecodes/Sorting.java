package com.basecodes;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		
		int [] arr = {1,2,1,23,33,1,3,5};
	    int n = arr.length;
	    int temp;
	    ArrayList <Integer> a1 = new ArrayList<Integer>();
		
	    for (int i=0;i<n-1;i++) {
	    	
	    	for (int j=0; j<n-i-1;j++) {
	    		
	    		if(arr[j]>=arr[j+1]) {
	    			
	    			temp=arr[j];
	    			arr[j] = arr[j+1];
	    			arr[j+1] = temp;
	    			
	    			
	    		}
	    	}
	    }
	    for (int i=0;i<n;i++) {
	    	for(int j=i;j<n;j++) {
	    		
	    		if(arr[i]!=arr[j] && !a1.contains(arr[i])) {
	    			
	    			
					a1.add(arr[i]);
	    		}
	    		
	    		
	    	}
	    }
	    for(int num:arr) {
	    	System.out.print(num + " ");
	    }
	    System.out.println();
	    System.out.println(a1);

	}
        
}
