package java8.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee  implements Comparable<Employee> {
  
	 private int id;
	 private String name;
	 private int salary;
	 
	 
   
	public Employee() {
		super();
	
	}



	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



//	public int compareTo(Employee e) {
//	
//		if(this.id==e.id) {
//			return 0;
//		}
//		else if(this.id<e.id) {
//			return -1;
//		}
//		else if(this.id>e.id) {
//			return 1;
//		}
//		return id;
//		
//	}
	
//	public int compareTo(Employee e) {
//		return Integer.compare(this.id, e.id);
//		
//	}
	
//	public  int compareTo(Employee e) {
//		return this.name.compareTo(e.name);
//		
//	}
	public int compareTo(Employee e) {
		return Integer.compare(this.salary, e.salary);
	}
	
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		   al.add(new Employee(1, "rohit", 29));
		   al.add(new Employee(4, "kiran", 29));
		   al.add(new Employee(2, "amar", 21));
		   al.add(new Employee(3, "ram", 33));
		   
		   Collections.sort(al);
		   
		   for(Employee e :al) {
			   System.out.println(e);
		   }
		   
	}
	

}
