package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class CustomSerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String originalString = "helloWorld";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);
        
        User user = new User(123, "Ram", "Ram@123");
		File file = new File("myEmployee.txt");
		//Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		System.out.println("Object written to file successfully!!");
		
		//Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User desrializedUser = (User) ois.readObject();
		System.out.println("User after deserialization : "+desrializedUser);

	}

}


