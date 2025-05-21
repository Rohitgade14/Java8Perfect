package com.stream;

import java.util.ArrayList;

public class Any_Match {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("kotlin");
		al.add("php");
		al.add("aws");
		
        boolean result= al.stream().anyMatch(str -> str.contains("java"));	
        System.out.println(result);
        
        
        boolean result1= al.stream().allMatch(str -> str.contains("java"));
        System.out.println(result1);
	}

}
