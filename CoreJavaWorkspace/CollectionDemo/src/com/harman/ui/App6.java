package com.harman.ui;

import java.util.ArrayList;
import java.util.Collections;

import com.harman.comparator.NameComparator;
import com.harman.comparator.SalaryComparator;
import com.harman.model.Employee;

public class App6 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "srinivas", 50000.0));
		empList.add(new Employee(102, "ramana", 40000.0));
		empList.add(new Employee(105, "sudha", 35000.0));
		empList.add(new Employee(104, "lalita", 42000.0));
		empList.add(new Employee(103, "kiran", 51000.0));
		empList.add(new Employee(106, "aksheya", 25000.0));
		
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("-----------------------------------------------");
		
		Collections.sort(empList);
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("-----------------------------------------------");
		
		Collections.sort(empList, new NameComparator());
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("-----------------------------------------------");
		Collections.sort(empList, new SalaryComparator());
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("-----------------------------------------------");
		
		
	}

}
