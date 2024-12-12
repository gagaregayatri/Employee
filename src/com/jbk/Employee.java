package com.jbk;

public class Employee implements EmployeeAI{
	private String Name;
	private salary s;
	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		 Name = name;
	}


	public salary getS() {
		return s;
	}


	public void setS(salary s) {
		this.s = s;
		}


	@Override
	public void display() {
		System.out.println("Name:"+Name);
		System.out.println("CompanyName:"+EmployeeAI.CompanyName);
		System.out.println("salary amount:"+s.getAmount());
		
		if(s.isIscredit()) {
			System.out.println("salary credited"+"YES");
		}else {
			System.out.println("salary credited"+"NO");
		}
		
	}
		
	}
	
	


