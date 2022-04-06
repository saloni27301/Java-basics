package com.harman.ui;

import com.harman.model.Employee;
import com.harman.model.Manager;
import com.harman.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("ravi", 20, 35000.0);
		System.out.println(s1.getName() + "\t" + s1.getAge() + "\t" + s1.getFee());
		
		Employee e1 = new Employee("sudha", 25, 59000.0);
		System.out.println(e1.getName() + "\t" + e1.getAge() + "\t" + e1.getSalary());
		
		Manager m1 = new Manager("ramana", 46, 68000.0, 29000.0);
		System.out.println(m1.getName() + "\t" + m1.getAge() + "\t" + m1.getSalary() + "\t" + m1.getBonus());
	}

}
