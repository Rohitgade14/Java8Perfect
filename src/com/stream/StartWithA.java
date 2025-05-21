package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithA {
	public static void main(String[] args) {

	     List<String> list=  Arrays.asList("apple","bannana","amar","raj");

	        List<String> result = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
	        System.out.println(result);





	}

}
