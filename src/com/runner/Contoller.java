package com.runner;
import com.jbk.Employee;
import com.jbk.salary;

public class Contoller {
public static void main(String arg[]) {
	Employee emp=new Employee();
	emp.setName("Gayatri");
	salary sal=new salary();
	sal.setAmount(18405);
	sal.setIscredit(true);
	emp.setS(sal);
	emp.display();
}
}
