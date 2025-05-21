package java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToCreateStream {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,6);
		System.out.println(number);
		
		
		List<String> list = Arrays.asList("apple","mango","bannana");
		System.out.println(list);
		
		
		Stream<Integer> num = Stream.of(2,4,6,8,10);
		  num.filter(num1 -> num1>4).forEach(System.out::print);
		  
		
		 
		
	}

}
