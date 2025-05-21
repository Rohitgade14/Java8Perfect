package com.stream;

import java.util.ArrayList;

public class FilterWithCount {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("php");
		al.add("j2ee");
		al.add("c++");

	     long count = al.stream().filter( str-> str.length()==4).count();
	     System.out.println(count);

	}

}
