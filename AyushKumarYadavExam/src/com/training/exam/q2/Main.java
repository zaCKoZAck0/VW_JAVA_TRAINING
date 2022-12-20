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

		System.out.println("");
		System.out.println("Only Print Duration, if instanceof CrashCourse or instanceof SpecialisationCourse: ");
		System.out.println("Rest Displayed in code");
		
	}

	
	//	instanceof operator
	public static void checkInst(Course c) {
		
		System.out.println("");

//		c.setInstructors("Ayush");
		c.setInstructors(new String[]{"Ayush","Amit","Abhishek"});
		
		

		System.out.println(c);
		
		if (c instanceof SpecialisationCourse) {
			
			((SpecialisationCourse) c).setTrialDays(20);
			System.out.println("Specialisation Course: "+c+" has "+((SpecialisationCourse) c).getTrialDays()+" trial.");
		}
		System.out.println("");
	}
	
}
