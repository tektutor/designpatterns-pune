public class Customer {
	private String firstName;
	private String middleName;
	private String lastName;

	private String doorNo;
	private String street1, street2, street3, city, state, pinCode;

	public Customer() {}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDoorNo( String doorNo ) {
	       this.doorNo = doorNo;	
	}

	public void setStreet1( String street1 ) {
		this.street1 = street1;
	}

	public void setStreet2( String street2 ) {
		this.street2 = street2;
	}

	public void setStreet3( String street3 ) {
		this.street3 = street3;
	}

	public void setCity( String city) {
		this.city = city;
	}

	public void setPinCode( String pinCode) {
		this.pinCode = pinCode;
	}

	public void setState ( String state ) {
		this.state = state ;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public String getStreet1() {
		return street1;
	}

	public String getStreet2() {
		return street2;
	}

	public String getStreet3() {
		return street3;
	}

	public String getCity() {
		return city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public String getState() {
		return state;
	}

}
