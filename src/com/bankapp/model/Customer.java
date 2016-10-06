package com.bankapp.model;

public class Customer {
private String firstName;
private String lastName;
private String dob;
private String contactNo;
private String email;
private Address correspondenceAddress;
private Address permanentAddress;
private Product product;
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the dob
 */
public String getDob() {
	return dob;
}
/**
 * @param dob the dob to set
 */
public void setDob(String dob) {
	this.dob = dob;
}
/**
 * @return the contactNo
 */
public String getContactNo() {
	return contactNo;
}
/**
 * @param contactNo the contactNo to set
 */
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the correspondenceAddress
 */
public Address getCorrespondenceAddress() {
	return correspondenceAddress;
}
/**
 * @param correspondenceAddress the correspondenceAddress to set
 */
public void setCorrespondenceAddress(Address correspondenceAddress) {
	this.correspondenceAddress = correspondenceAddress;
}
/**
 * @return the permanentAddress
 */
public Address getPermanentAddress() {
	return permanentAddress;
}
/**
 * @param permanentAddress the permanentAddress to set
 */
public void setPermanentAddress(Address permanentAddress) {
	this.permanentAddress = permanentAddress;
}
/**
 * @return the product
 */
public Product getProduct() {
	return product;
}
/**
 * @param product the product to set
 */
public void setProduct(Product product) {
	this.product = product;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
