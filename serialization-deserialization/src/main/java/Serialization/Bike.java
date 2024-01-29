package Serialization;

import java.io.Serializable;

public class Bike implements Serializable {
	private String BikeName;
	private int MakeYear;
	private Engine engine;
	
	
	public Bike() {
		super();
		
	}
	public Bike(String bikeName, int makeYear, Engine engine) {
		super();
		BikeName = bikeName;
		MakeYear = makeYear;
		this.engine = engine;
	}
	public String getBikeName() {
		return BikeName;
	}
	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}
	public int getMakeYear() {
		return MakeYear;
	}
	public void setMakeYear(int makeYear) {
		MakeYear = makeYear;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Bike [BikeName=" + BikeName + ", MakeYear=" + MakeYear + ", engine=" + engine + "]";
	}
	
	

}
