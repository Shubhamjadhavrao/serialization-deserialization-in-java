/**
 * 
 */
package Serialization;

import java.io.Serializable;

/**
 * 
 */
public class Person extends Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private static String Country = "India";

	public Person(int id, String name,String gender, float heigth, int weigth) {
		super(gender,heigth,weigth);
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCountry() {
		return Country;
	}

	public static void setCountry(String country) {
		Person.Country= country;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
