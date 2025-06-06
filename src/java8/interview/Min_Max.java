package java8.interview;

import java.util.ArrayList;
import java.util.Comparator;

public class Min_Max {
	
	public static void main(String[] args) {
		ArrayList<HdfcBank> list = new ArrayList<>();
		list.add(new HdfcBank("Rohit", 234, 4544.99));
		list.add(new HdfcBank("kiran", 34, 9944.99));
		list.add(new HdfcBank("rahul", 934, 7744.99));
		list.add(new HdfcBank("ajay", 232, 37484.8));
		
		
		 HdfcBank max=list.stream().max(Comparator.comparing(HdfcBank::getBalance)).get();
		 System.out.println(max);
		 
		HdfcBank min= list.stream().min(Comparator.comparing(HdfcBank::getBalance )).get();
		System.out.println(min);
		
	}

}
