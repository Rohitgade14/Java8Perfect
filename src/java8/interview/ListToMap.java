package java8.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
		  List<Bank> bank = new ArrayList<>();
		  bank.add(new Bank("Rohit", 5678));
		  bank.add(new Bank("kiran", 9978));
		  bank.add(new Bank("rahul", 3378));
		  bank.add(new Bank("vijay", 2990));
		  
		  
		  Map<String, Integer> collect = bank.stream().collect(Collectors.toMap(Bank::getName,Bank::getBalance));
		 System.out.println(collect); 
		 
		 Set<Bank> collect2 = bank.stream().collect(Collectors.toSet());
		 System.out.println(collect2);
		 
	      Set<String> names=bank.stream().map(Bank::getName).collect(Collectors.toSet());
	      System.out.println(names);
	
	}

}
