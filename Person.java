package addressbook;

public class Person {
	String firstname;
	String lastname;
	String city;
	String state;
	String zip;
	long phone;
	
	

	

	public Person(String firstname, String lastname, String city, String state, String zip, long phone) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phone=" + phone + "]";
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}
