package string.programs;

import selenium.interview.series.Details;

public class BuilderTest {

	
	private String name;
	private String city;
	private String state;
	private int pincode;
	
	public BuilderTest() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public BuilderTest setName(String name) {
		this.name = name;
		return this;
	}
	public String getCity() {
		return city;
	}
	public BuilderTest setCity(String city) {
		this.city = city;
		return this;
	}
	public String getState() {
		return state;
	}
	public BuilderTest setState(String state) {
		this.state = state;
		return this;
	}
	public int getPincode() {
		return pincode;
	}
	
	public BuilderTest setPincode(int pincode) {
		this.pincode = pincode;
		return this;
	}
	
	
	public Details build() {
		
		return new Details(name, city, state, pincode);
	}
	@Override
	public String toString() {
		return "BuilderTest [name=" + name + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}
