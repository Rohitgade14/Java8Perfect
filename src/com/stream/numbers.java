package com.stream;

import java.util.Arrays;
import java.util.List;


public class numbers {
	
	public static void main(String[] args) {
		List<Integer> listOfIntergers = Arrays.asList(45,12,56,15,24,75,31,89);
		  listOfIntergers.stream()
		  .filter(num -> num%5==0)
		  .forEach(System.out::println);
		  
		   listOfIntergers.stream()
		   .filter(num ->num%5==0 )
		   .map(num->num/5)
		   .forEach(System.err::println);
		   
		  

}
}