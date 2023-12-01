package com.java.vishnu;

public class Employee {
	private String Name;
	private int Number;
	private String company;
	
	
	public void Employee() {
		
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getNumber() {
		return Number;
	}


	public void setNumber(int number) {
		Number = number;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Number=" + Number + ", company=" + company + ", getName()=" + getName()
				+ ", getNumber()=" + getNumber() + ", getCompany()=" + getCompany() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	public void hello() {
		System.out.println("hello employee");
	}

}
