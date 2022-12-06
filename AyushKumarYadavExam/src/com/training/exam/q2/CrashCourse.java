package com.training.exam.q2;

import com.training.exam.q1.Course;

//[2:35 PM] Namrata Marathe (Guest)

//Group B 

//Collection Framework – HashMap, TreeMap , key – student , value – courseAnd you have
//to also make use of comparator interface – sort student birthdate   

//Course and CrashCourse/SpecialisationCourse  and depict use of constructor
//overloading, function overloading, function overriding, runtime
//polymorphism, instanceof operator


public class CrashCourse extends Course{
	public CrashCourse(String courseName) {
		super(courseName);
		// TODO Auto-generated constructor stub
	}
	
	public CrashCourse() {
		super();
	}
	
	//	function overriding
	public String getDurantion() {
		return 7 + " Days.";
	}
}
