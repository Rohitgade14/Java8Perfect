package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingSortedOrder {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("php");
		al.add("j2ee");
		al.add("c++");

		List<String> list=al.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

}
