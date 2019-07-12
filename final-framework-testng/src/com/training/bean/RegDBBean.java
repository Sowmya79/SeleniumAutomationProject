package com.training.bean;

public class RegDBBean {
	
	private String FirstName, LastName;
	private String Email, Telephone, Company;
	private String Address1, Address2, City, Postcode, Country, Zone_id;
	private String Password, Confirm;
	
	public RegDBBean() {
		
	}

	public RegDBBean(String FirstName, String LastName, String Email, String Telephone, String Company, String Address1, String Address2, String City, String Postcode, String Country, String Zone_id, String Password, String Confirm){
		super();
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.Email = Email;
		this.Telephone = Telephone;
		this.Company = Company;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.City = City;
		this.Postcode = Postcode;
		this.Country = Country;
		this.Zone_id = Zone_id;
		this.Password = Password;
		this.Confirm = Confirm;
	}

 // getter, setter Methods
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPostcode() {
		return Postcode;
	}

	public void setPostcode(String postcode) {
		Postcode = postcode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getZone_id() {
		return Zone_id;
	}

	public void setZone_id(String zone_id) {
		Zone_id = zone_id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirm() {
		return Confirm;
	}

	public void setConfirm(String confirm) {
		Confirm = confirm;
	}
	
	@Override
	public String toString() {
		return "RegDBBean [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", Telephone =" + Telephone + ", Company =" + Company + ", Address1 =" + Address1 + ", Address2 =" + Address2 + ", City =" + City + ", Postcode =" + Postcode + ", Country =" + Country + ", Zone_id =" + Zone_id + ", Password =" + Password + ", Confirm =" + Confirm + ",]";
	}

}
