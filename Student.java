package com.inheritance.bll;

public class Student extends Person {
	private static final int maximum_courses = 30;
	private int numCourses = 0;
	private String[] courses = {} ;
	private int[] grades = {};

	public Student(String name, String address){
		super(name,address);
		courses = new String[maximum_courses];
		grades = new int[maximum_courses];
	}
	@Override
	public String toString(){
		return "Student : "+super.toString();
	}
	public void addCourseGrade(String course,int grade){
		this.courses[numCourses] =course;
		this.grades[numCourses] =grade;
		numCourses++;
		
		
	}
	public void printGrades(){
		for(int i=0; i<numCourses; i++){
			System.out.println("Grade : " + grades[i]);	
		}
	}
	public double getAverageGrade(){
		double avg=0;
		for(int i :grades)
		{
			avg = avg + i;
		}
		return avg/numCourses;
	}
	
}
