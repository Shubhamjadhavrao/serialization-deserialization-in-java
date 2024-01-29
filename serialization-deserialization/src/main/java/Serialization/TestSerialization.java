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
public class TestSerialization implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		Head head = new Head("Suzuki" ,1234);
		Engine engine = new Engine("R2C",2.4f,head);
		Bike bike = new Bike("RX100",2014,engine);
		
		System.out.println("Bike object to be Serialize: "+ bike);
		
		File file = new File("BikeCompositon.txt");
		
//		Serialization
		FileOutputStream Fos = new FileOutputStream(file);
		ObjectOutputStream Oos = new ObjectOutputStream(Fos);
		Oos.writeObject(bike);
		
		System.out.println("Object written to Successfuly!!!");
		
//		Deserialization
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream Ois = new ObjectInputStream(fis);
		
		Bike deserialize = (Bike) Ois.readObject();
		
		System.out.println("Object after deserialize: "+deserialize);
		
		
	}
}
