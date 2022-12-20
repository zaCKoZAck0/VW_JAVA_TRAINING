package com.training.exam.q1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//[2:35 PM] Namrata Marathe (Guest)

//Group B 

//Collection Framework – HashMap, TreeMap , key – student , value – courseAnd you have
//to also make use of comparator interface – sort student birthdate   

//Course and CrashCourse/SpecialisationCourse  and depict use of constructor
//overloading, function overloading, function overriding, runtime
//polymorphism, instanceof operator


public class Student implements Comparable<Student>{

	private int rollNumber;
	private String name;
	private Course course;
	private LocalDate birthDate;
	
	
	public Student(int rollNumber, String name, LocalDate birthDate, Course course) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.birthDate = birthDate;
		this.course = course;
	}	
	
	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.rollNumber == s.rollNumber) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.course.getCourseId();
	}
	
	@Override
	public String toString() {
		return this.rollNumber + " " + this.name + " ("+this.birthDate+")";
	}
	
	public int compareTo(Student s) {
		return (int) ChronoUnit.DAYS.between(this.birthDate, s.birthDate);
	}
}
