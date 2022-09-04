package com.inheritance.pll;

import com.inheritance.bll.*;

public class Test {
	public static void main(String[] args) {
		Student std1 = new Student("Ramkrishna","Khategaon");
		Teacher tch1 = new Teacher("Premchandra","Jhansi");
		System.out.println(std1);
		std1.addCourseGrade("BSC001", 89);
		std1.addCourseGrade("BCA002", 99);
		std1.addCourseGrade("BBA003", 66);
		std1.printGrades();
		System.out.println("*********************************");
		System.out.println("Average : "+std1.getAverageGrade());
		
		System.out.println("*********************************");
		System.out.println(tch1);
		String[] courses = {"BA011","BA011","BBA004", "BCOM013","BLL014"};
		 for (String course: courses) {
			 if (tch1.addCourse(course)) 
			 System.out.println("Successfully add course : "+course);
			 else {
				 System.out.println("You can not add : "+course +" Course because it is already added");
			 }
		 }//end for
		 System.out.println("*********************************");
		 
		 /*if (tch1.addCourse("BBA004")){
			 System.out.println("Successfully add course : BBA004 ");
		 }
		 else
		 System.out.println("You can not add BBA004 course because it is already added");*/
		 
		 for (String course: courses) {
				 if (tch1.removeCourse(course)) {
				 System.out.println(course + " Course deleted");
				 } else {
				 System.out.println(course + " You can not delete because it is already deleted ");
				 }
			 }//end for
/*		 if (tch1.removeCourse("BBA004")){
			 System.out.println(" Course deleted");
		 }
		 else
		 System.out.println("You can not delete ");
*/		 
	}//end main method

}
