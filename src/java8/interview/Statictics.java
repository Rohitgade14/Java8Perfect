package java8.interview;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class Statictics {
	public static void main(String[] args) {
		ArrayList<HdfcBank> list = new ArrayList<>();
		list.add(new HdfcBank("Rohit", 234, 4544.99));
		list.add(new HdfcBank("kiran", 34, 9944.99));
		list.add(new HdfcBank("rahul", 934, 7744.99));
		list.add(new HdfcBank("ajay", 232, 37484.8));
		
		
		   DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(bank ->bank.getBalance()));
	
	       System.out.println(collect);
	}

}
