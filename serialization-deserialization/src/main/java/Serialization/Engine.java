/**
 * 
 */
package Serialization;

import java.io.Serializable;

/**
 * 
 */
public class Engine implements Serializable{
	private String Type;
	private float Capacity;
	private Head head;
	
	
	
	public Engine() {
		super();
		
	}



	public Engine(String type, float capacity, Head head) {
		super();
		Type = type;
		Capacity = capacity;
		this.head = head;
	}



	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public float getCapacity() {
		return Capacity;
	}



	public void setCapacity(float capacity) {
		Capacity = capacity;
	}



	public Head getHead() {
		return head;
	}



	public void setHead(Head head) {
		this.head = head;
	}



	@Override
	public String toString() {
		return "Engine [Type=" + Type + ", Capacity=" + Capacity + ", head=" + head + "]";
	}
	
	

}
