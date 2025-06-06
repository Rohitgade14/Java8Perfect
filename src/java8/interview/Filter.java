package java8.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	
	public static void main(String[] args) {
		ArrayList<HdfcBank> list = new ArrayList<>();
		list.add(new HdfcBank("Rohit", 234, 4544.99));
		list.add(new HdfcBank("kiran", 34, 9944.99));
		list.add(new HdfcBank("rahul", 934, 7744.99));
		list.add(new HdfcBank("ajay", 232, 37484.8));
		
		
		        
		List<HdfcBank> result=list.stream().filter(bank -> bank.balance>10000).collect(Collectors.toList());
		 System.out.println(result);
		 
		 
		 List<String> result1=list.stream().map(HdfcBank::getName).collect(Collectors.toList());
		 System.out.println(result1);
		 list.stream().map(HdfcBank::getName).forEach(System.out::println);
		 
		 // by using count also
		long  num= list.stream().map(HdfcBank::getAccountNum).count();
		System.out.println(num);
		 
	}

}
