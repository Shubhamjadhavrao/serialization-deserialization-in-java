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
public class SerializationTest  {
	public static void main(String[] args) throws IOException, ClassNotFoundException   {
//		Person s1 = new Person(28, "Male", "Shubham", 6.0f,45);
//		
//		System.out.println(s1);
//		
//		System.out.println("Gender: "+s1.getGender());
//		System.out.println("Heigth: "+s1.getHeigth());
//		System.out.println("weigth: "+s1.getWeigth());
//		
		File file = new File("myPerson.txt");
		
//Serializable
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		
		System.out.println("Objecct File Written Successfully!!!!!!!!");
		
		
//Deserialized
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person deserilizedP = (Person) ois.readObject();
		System.out.println("After Desrialized : "+deserilizedP);
//		System.out.println("Gender: "+s1.getGender());
//		System.out.println("Heigth: "+s1.getHeigth());
//		System.out.println("weigth: "+s1.getWeigth());
		System.out.println(deserilizedP.getCountry());

		
		
		
	}

}
