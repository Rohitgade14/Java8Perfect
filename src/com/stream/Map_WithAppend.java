package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Map_WithAppend {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		
          List<Integer> result= al.stream().map( num -> num+5).collect(Collectors.toList());
          System.out.println(result);
          
          al.stream().map(num -> num+10).forEach(System.err::println);
		
		
		   
		     al.stream().filter(num ->num>10).map(num -> num+10).forEach(System.out::print);
	}

}
