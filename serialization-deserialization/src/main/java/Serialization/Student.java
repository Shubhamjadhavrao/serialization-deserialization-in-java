package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	

	private String gender;
	private float heigth;
	private int weigth;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String gender, float heigth, int weigth) {
		super();
		this.gender = gender;
		this.heigth = heigth;
		this.weigth = weigth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	


	@Override
	public String toString() {
		return "Student [gender=" + gender + ", heigth=" + heigth + ", weigth=" + weigth + "]";
	}

}
