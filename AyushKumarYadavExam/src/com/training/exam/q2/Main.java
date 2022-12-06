package com.training.exam.q2;

import com.training.exam.q1.Course;

//[2:35 PM] Namrata Marathe (Guest)

//Group B 

//Collection Framework – HashMap, TreeMap , key – student , value – courseAnd you have
//to also make use of comparator interface – sort student birthdate   

//Course and CrashCourse/SpecialisationCourse  and depict use of constructor
//overloading, function overloading, function overriding, runtime
//polymorphism, instanceof operator


public class Main {

	public static void main(String[] args) {
	
		Course c1;
		
		c1 = new Course();
		checkInst(c1);
		c1 = new SpecialisationCourse("Java Advanced Training");
		checkInst(c1);
		c1 = new CrashCourse("Python Training");
		checkInst(c1);
		
	}
	//	instanceof operator
	public static void checkInst(Course c) {
		
//		c.setInstructors("Ayush");
		c.setInstructors(new String[]{"Ayush","Amit","Abhishek"});
		
		System.out.println(c);
		
		if (c instanceof CrashCourse || c instanceof SpecialisationCourse) {
			System.out.println("Durantion: "+c.getDurantion());
		}
	}
	
}
