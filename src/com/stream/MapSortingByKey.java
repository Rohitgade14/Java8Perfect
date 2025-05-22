package com.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortingByKey {
	public static void main(String[] args) {
		Map<String, Integer> price = new HashMap<>();
		price.put("realme", 23000);
		price.put("sony", 1900);
		price.put("samsung", 3000);
		price.put("apple", 11000);
		price.put("apple", 66000);
		price.put("oppo", 88000);
		
		
 List<Entry<String, Integer>> collect = price.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		System.out.println(collect); 
		
		price.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
	}

}
