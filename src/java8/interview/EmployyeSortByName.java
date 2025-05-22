package java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployyeSortByName {
	public static void main(String[] args) {
		  
		ArrayList<Employee> employeesList = new ArrayList<>();
	
			employeesList.add(new Employee(1,"Rohit",23000.56));
			employeesList.add(new Employee(2, "kiran", 4433.55));
			employeesList.add(new Employee(4, "amar", 6633.55));
			employeesList.add(new Employee(5, "rahul", 8933.67));
			employeesList.add(new Employee(6, "vishal", 4533.55));	
			employeesList.add(new Employee(3, "sonu", 2233.55));
			
			
		

		
		   List<Employee> salary= employeesList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
            System.out.println(salary);
            
              List<Employee> salary1 = employeesList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
            System.out.println(salary1);
            
                  long count = employeesList.parallelStream().filter(sal -> sal.getSalary()>20000).count();
	              System.out.println(count);
	              
	              long count2 = employeesList.parallelStream().count();
	              System.out.println(count2);
	
	
	}


}
