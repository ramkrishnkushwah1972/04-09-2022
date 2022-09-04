package com.inheritance.bll;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	public Author() {
		//System.out.println("Author Default constructor");
	}
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}
	public char getGender(){
		return gender;
	}
	@Override
	public String toString(){
		String gen;
		if(Character.toUpperCase(gender)=='M')
			gen="Male";
		else
			gen="Female";
				
		return name + "(" + gen + ") at " + email;
	}
}
