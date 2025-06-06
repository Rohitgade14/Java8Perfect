package java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
	
	public static void main(String[] args) {
	    List<Integer> numbers= Arrays.asList(2,3,4,5,7,9);
	    List<Integer> result = numbers.stream()
	                   .filter(num -> num%2==0)
	                   
	                   .map(num1 ->num1*num1)
                       .sorted()
	                   .collect(Collectors.toList());
	    
	      System.out.println(result);
		
	}

}
