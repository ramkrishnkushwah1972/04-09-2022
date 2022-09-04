package com.inheritance.bll;
//import com.inheritance.bll.Author;
public class Book extends Author {
	private String name;
	private Author author;
	private double price;
	private int qty;

	public Book() {
		super();
		//System.out.println("Book constructor");
	}
	public Book(String name, Author author, double price, int qty){
		
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	@Override
	public String toString(){
		return "Book-name "+name+ " by "+super.toString(); 
	}
}
