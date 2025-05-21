package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingSortedOrder {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("php");
		al.add("j2ee");
		al.add("c++");

		List<String> list = al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(list);
	}

}
