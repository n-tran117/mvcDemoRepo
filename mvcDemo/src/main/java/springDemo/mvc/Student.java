package springDemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String>coutryList;
	
	public Student() {
		coutryList = new LinkedHashMap<>();
		coutryList.put("br", "Brazil");
		coutryList.put("fr", "France");
		coutryList.put("de", "Germany");
		coutryList.put("in", "India");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCoutryList() {
		return coutryList;
	}
	
	

}
