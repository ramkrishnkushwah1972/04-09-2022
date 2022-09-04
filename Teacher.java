package com.inheritance.bll;

public class Teacher extends Person {

	private static final int maximum_courses = 5;
	private int numCourses = 0;
	private String courses[]= {};
	
	
	public Teacher(String name, String address){
		super(name,address);
		courses = new String[maximum_courses];
		
	}
	@Override
	public String toString(){
		return "Teacher : "+super.toString();
	}
	
	public boolean addCourse(String course){
		 for(int i=0; i<numCourses; i++){
			if(courses[i] == course){
				return false;
			}
		 }
			this.courses[numCourses] = course;
			numCourses++;	
			return true;
	}
	public boolean removeCourse(String course){
		int idx=numCourses;
		for(int i = 0; i<numCourses; i++){
			if(courses[i]==course){
				idx=i;	
			}
		}
		if(idx == numCourses)
		{
			return false;
		}
		else{
			for(int i=idx; i<(courses.length)-1; i++){
				courses[i]=courses[i+1];
			}
		}
		numCourses--;
		return true;
	}
	
}
