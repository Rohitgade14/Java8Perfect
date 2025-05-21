package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingOrderSorting {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7,5,4,2,1);  // for decending (s1,s2)-> s2.compareTo(s1)
		                                                   // for ascending (s1,s2)-> s1.compareTo(s2)
		List<Integer> result = numbers.stream().sorted( (s1,s2) ->s2.compareTo(s1)).collect(Collectors.toList());
		 System.out.println(result);
	}

}
