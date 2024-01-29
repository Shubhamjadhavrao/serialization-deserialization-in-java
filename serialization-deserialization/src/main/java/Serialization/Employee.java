/**
 * 
 */
package Serialization;

import java.io.Serializable;

/**
 * 
 */
public class Employee implements Serializable {
	private String Neme;
	private String Department;
	private transient int  Salary;
	
	
	public Employee() {
		super();
		
	}


	public Employee(String neme, String department, int salary) {
		super();
		this.Neme = neme;
		this.Department = department;
		this.Salary = salary;
	}


	public String getNeme() {
		return Neme;
	}


	public void setNeme(String neme) {
		Neme = neme;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [Neme=" + Neme + ", Department=" + Department + ", Salary=" + Salary + "]";
	}


	
	
	
	

}
