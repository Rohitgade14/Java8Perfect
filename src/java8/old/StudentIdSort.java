package java8.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentIdSort implements Comparator<Student>{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "kiran", "pune"));
		list.add(new Student(4, "amar", "nashik"));
		list.add(new Student(3, "ram", "mumbai"));
		list.add(new Student(2, "vijay", "ahemdabad"));
		
		Collections.sort(list,new StudentIdSort());
		
		for(Student s :list) {
			System.out.println(s);
		}
		
	}


//	public int compare(Student s1,Student s2) {
//		return s1.getName().compareTo(s2.getName());
//	}
//	@Override
//	public int compare(Student o1, Student o2) {
//	    return Integer.compare(o1.getId(), o2.getId());
//	}
//	
	
	public int compare(Student s1,Student s2) {
		return s1.getAddress().compareTo(s2.getAddress());
		
	}

	
//	public int compare(Student o1, Student o2) {
//	     if(o1.getId()==o2.getId()) {
//	    	 return 0;
//	     }
//	     else if(o1.getId()<o2.getId()) {
//	    	 return -1;
//	     }
//	     else {
//	    	 return 1;
//	     }
//	
//	}
}
