package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			al.add(i);
			
		}
		
		List<Integer> result = al.stream().filter(num -> num%2==0).collect(Collectors.toList());
         System.out.println(result);
         
         al.stream().filter(num -> num%2!=0).collect(Collectors.toList()).forEach(System.out::print);
	}

}
