package com.basecodes;

import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		
		String s ="This is my country";
		Map<Character, Long> charCountMap = s.chars() // Convert string to IntStream
	            .filter(Character::isLetter) // Filter to keep only letters
	            .map(Character::toLowerCase) // Convert to lower case for case-insensitivity
	            .mapToObj(c -> (char) c) // Convert int to Character
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting())); 
		
	        // Print the character count map
	        System.out.println(charCountMap);
	        
	        
			
	}

}
