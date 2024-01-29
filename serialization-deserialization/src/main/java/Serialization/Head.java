/**
 * 
 */
package Serialization;

import java.io.Serializable;

/**
 * 
 */
public class Head implements Serializable {
	private String VenodoreName;
	private int HeadNumber;
	
	
	public Head() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Head(String venodoreName, int headNumber) {
		super();
		VenodoreName = venodoreName;
		HeadNumber = headNumber;
	}


	public String getVenodoreName() {
		return VenodoreName;
	}


	public void setVenodoreName(String venodoreName) {
		VenodoreName = venodoreName;
	}


	public int getHeadNumber() {
		return HeadNumber;
	}


	public void setHeadNumber(int headNumber) {
		HeadNumber = headNumber;
	}


	@Override
	public String toString() {
		return "Head [VenodoreName=" + VenodoreName + ", HeadNumber=" + HeadNumber + "]";
	}
	
	
	
	
	

}
