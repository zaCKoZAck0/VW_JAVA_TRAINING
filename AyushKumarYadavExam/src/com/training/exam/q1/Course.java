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
	private static int CId = 0;
	private int CourseId;
	private String[] instructors;
	
	public Course() {
		this.courseName = "Behavioural Training";
		this.CourseId = Course.CId;
		Course.CId ++;
	}
	
	//  constructor overloading
	public Course(String courseName) {
		this.courseName = courseName;
		this.CourseId = Course.CId;
		Course.CId ++;
	}

	public String getCourse(){
		return this.courseName;
	}

	public String[] getInstructors() {
		return instructors;
	}

	public int getCourseId(){
		return this.CourseId;
	}
	
	//	function overloading
	public void setInstructors(String[] instructors) {
		this.instructors = instructors;
	}
	
	public void setInstructors(String instructor) {
		this.instructors = new String[]{instructor};
	}

	public String getDurantion() {
		return "";
	}
	
	@Override
	public String toString() {
		return "#ID: "+this.CourseId+", "+this.courseName; 
	}
}
