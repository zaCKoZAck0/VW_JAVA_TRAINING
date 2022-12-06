package com.training.exam.q1;

import java.util.Arrays;

//[2:35 PM] Namrata Marathe (Guest)

//Group B 

//Collection Framework – HashMap, TreeMap , key – student , value – courseAnd you have
//to also make use of comparator interface – sort student birthdate   

//Course and CrashCourse/SpecialisationCourse  and depict use of constructor
//overloading, function overloading, function overriding, runtime
//polymorphism, instanceof operator


public class Course {
	private String courseName;
	private String[] instructors;
	
	public Course() {
		this.courseName = "Behavioural Training";
	}
	
	//  constructor overloading
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String[] getInstructors() {
		return instructors;
	}
	
	//	function overloading
	public void setInstructors(String[] instructors) {
		this.instructors = instructors;
	}
	
	
	public void setInstructors(String instructor) {
		this.instructors = new String[]{instructor};
	}

	public String getDurantion() {
		return null;
	}
	
	@Override
	public String toString() {
		return this.courseName; 
	}
}
