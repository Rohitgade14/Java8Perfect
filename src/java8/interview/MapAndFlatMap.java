package java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	public static void main(String[] args) {
	   List<String> list = Arrays.asList("rohit","kiran");
	   List<String> result1 = list.stream().map(String::toUpperCase)
			   .collect(Collectors.toList());
	   
	   System.out.println(result1);
				
	   
	   List<List<String>> nestedList = Arrays.asList(
			Arrays.asList("apple","banna"),
			Arrays.asList("mango","orange")
			   );
	   
	    List<String> result2 = nestedList.stream()
	    		.flatMap(List::stream).map(String::toUpperCase)
	    		.collect(Collectors.toList());
	
	  System.out.println(result2);
	}
	
	
	
	

}
