package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("kiran");
		al.add("ram");
		al.add("rushi");

			List<String> list= al.stream().map( str-> str.toUpperCase()).collect(Collectors.toList());
			System.out.println(list);
	}

}
