package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Program {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,1,2,3,4};
		int a = removeDuplicates(nums);
	}

	private static int removeDuplicates(int[] nums) {
		List a = new ArrayList();
		
		for(int i=0;i<nums.length;i++) {
			a.add(nums[i]);
			
		}

		
		System.out.println(a);
		return 0;
		

	}

}