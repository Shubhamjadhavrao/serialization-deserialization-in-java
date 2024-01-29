/**
 * 
 */
package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */
public class EmployeeTest implements Serializable {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee("Shubham","IT",12056);
		System.out.println(emp1);
		System.out.println("Name: "+emp1.getNeme());
		System.out.println("Department: "+emp1.getDepartment());
		System.out.println("salary: "+emp1.getSalary());
		
		
		File file = new File("Employee.txt");
		
//		Serializable
		
		FileOutputStream fos = new FileOutputStream(file);
	    ObjectOutputStream Oos = new ObjectOutputStream(fos);
	    Oos.writeObject(emp1);
	    
	    System.out.println("file written succesfully!!!");
	    
//	    Deserialized
	    
	    FileInputStream Fis = new FileInputStream(file);
	    ObjectInputStream Ois = new ObjectInputStream(Fis);
	    
	    Employee deserialized = (Employee) Ois.readObject();
	    
	    System.out.println("Name: "+deserialized.getNeme());
		System.out.println("Department: "+deserialized.getDepartment());
		System.out.println("salary: "+deserialized.getSalary());
		
		
		
	}

}
