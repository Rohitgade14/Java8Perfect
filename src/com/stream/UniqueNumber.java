package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumber {
	  public static void main(String[] args) {
	         List<Integer> list= Arrays.asList(1,2,3,3,4);
	         List<Integer> uniqueNumber = list.stream().distinct().collect(Collectors.toList());
	         System.out.println(uniqueNumber);
	}

}
