package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountOfNumbers {
	public static void main(String[] args) {
	    List<Integer> list=	Arrays.asList(1,2,3,5,6);
	     long count = list.stream().count();
	     System.out.println(count);

	}

}
