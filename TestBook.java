package com.inheritance.pll;
import com.inheritance.bll.*;

public class TestBook {

public static void main(String[] args) {

		Book b1= new Book();
		System.out.println(b1);
		Author A1 = new Author("Yashavant Kanetkar","yas@123.com",'M');

		Book b2= new Book("Letus C", A1,150.0, 2);
		System.out.println(b2);
		//Author A2 = new Author();
		System.out.println("**********************************");
		System.out.println("Name :"+b2.getName());
	
		System.out.println("Price :"+b2.getPrice());
		System.out.println("Quantity :"+b2.getQty());

		System.out.println("Gender :"+ b2.getEmail());
		
		
	}
}
