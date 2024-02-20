package selenium.interview.series;

public class Details {

	private String name;
	private String city;
	private String state;
	private int pincode;
	
	public Details() {
		// TODO Auto-generated constructor stub
	}
	public Details(String name, String city, String state, int pincode) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
