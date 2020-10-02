package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Employee_sort {

	public static void main(String[] args) {
		HashSet<Employee>  unsorted=new HashSet<Employee>();
		Employee employee1 = new Employee("Raghav", 23655, "Automation");
		Employee employee2 = new Employee("Muneer",30550, "Marketing");
		Employee employee3 = new Employee("Jayesh",50000," IT");
		Employee employee4 = new Employee("Raj",20000,"Business");
		unsorted.add(employee1);
		unsorted.add(employee2);
		unsorted.add(employee3);
		unsorted.add(employee4);
		ArrayList<Employee> sorting = new ArrayList<Employee>(unsorted);//passing unsorted which is HashSet to ArrayList.
		Collections.sort(sorting);
		System.out.println(sorting);
		
	}

}
