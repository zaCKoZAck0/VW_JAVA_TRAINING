package com.training.exam.q1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//[2:35 PM] Namrata Marathe (Guest)

//Group B 

//Collection Framework – HashMap, TreeMap , key – student , value – courseAnd you have
//to also make use of comparator interface – sort student birthdate   

//Course and CrashCourse/SpecialisationCourse  and depict use of constructor
//overloading, function overloading, function overriding, runtime
//polymorphism, instanceof operator




public class Main {
	public static void main(String[] args) {
		Map<Student, Course> student_course = new HashMap<>();
		
		Course c1 = new Course("Java Adv.");
		c1.setInstructors("Ayush");
		Course c2 = new Course("Python");
		c2.setInstructors("Ayush");

		Student s1 = new Student(1,"Ayush", LocalDate.of(2001, 11, 30),c2);
		Student s2 = new Student(2,"Amit", LocalDate.of(2000, 12, 30),c2);
		Student s3 = new Student(3,"Arpit", LocalDate.of(2000, 7, 15),c1);
		

		
	student_course.put(s1, c2);
	student_course.put(s2, c2);
	student_course.put(s3, c1);
	
	// prints Map collection
	System.out.println("MAP Collection: "+student_course);
	
	TreeSet<Student> stdTree = new TreeSet<Student>();
	stdTree.add(s1);
	stdTree.add(s2);
	stdTree.add(s3);
	
	//prints TreeSet collection
	System.out.println("TreeSet Collection Sorted by Birthdate (asc.): "+stdTree);
	
	}
}
