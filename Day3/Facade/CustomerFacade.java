public class CustomerFacade {
	private String firstName;
	private String middleName;
	private String lastName;

	private String doorNo;
	private String street1, street2, street3, city, state, pinCode;

	private Customer customer;

	public CustomerFacade( 
			String firstName, 
			String middleName, 
			String lastName,
			String doorNo,
			String street1,
			String street2,
			String street3,
			String city,
			String pinCode,
			String state) 
	{
		this.firstName = firstName;	
		this.middleName = middleName;
		this.lastName = lastName;

		this.doorNo = doorNo;
		this.street1 = street1;
		this.street2 = street2;
		this.street3 = street3;

		this.city = city;
		this.state = state;
		this.pinCode = pinCode;

		customer = new Customer();

		setCustomerDetails();

	}

	private void setCustomerDetails() {

		customer.setFirstName ( firstName );
		customer.setMiddleName ( middleName );
		customer.setLastName ( lastName );

		customer.setDoorNo ( doorNo );
		customer.setStreet1 ( street1 );
		customer.setStreet2 ( street2 );
		customer.setStreet3 ( street3 );
		customer.setCity ( city );
		customer.setState ( state );
		customer.setPinCode ( pinCode );

	}

	public String getName() {
		return customer.getFirstName() 
			+ " " + customer.getMiddleName() 
			+ " " + customer.getLastName();
	}

	public String getAddress() {
		return customer.getDoorNo() + "," + 
		       customer.getStreet1() + "," +
		       customer.getStreet2() + "," +
		       customer.getStreet3() + "," +
		       customer.getCity() + "," +
		       customer.getPinCode() + "," +
		       customer.getState();
	}



}
