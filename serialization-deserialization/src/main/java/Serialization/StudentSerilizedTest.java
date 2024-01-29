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
public class StudentSerilizedTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException   {
		Student s1 = new Student("Male",6.0f,45);
		
		System.out.println(s1);
		
		System.out.println("Gender: "+s1.getGender());
		System.out.println("Heigth: "+s1.getHeigth());
		System.out.println("weigth: "+s1.getWeigth());
		
		File file = new File("studentfile.txt");
		
//Serializable
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		System.out.println("Objecct File Written Successfully!!!!!!!!");
		
		
//Deserialized
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student deserilized = (Student) ois.readObject();
		System.out.println("Gender: "+deserilized.getGender());
		System.out.println("Heigth: "+deserilized.getHeigth());
		System.out.println("weigth: "+deserilized.getWeigth());
		
		
		System.out.println(deserilized);
		
	}

}
