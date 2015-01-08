package Store;

import Store.Entity;
import Store.Person;


public class Adress extends Entity {
private String city;
private String postCode;
private String street;
private String streetNumber;

private Person person;

public String getCity() {
	return city;
}

public String getPostCode() {
	return postCode;
}

public String getStreet() {
	return street;
}

public String getStreetNumber() {
	return streetNumber;
}

public Person getPerson() {
	return person;
}

public void setCity(String city) {
	this.city = city;
}

public void setPostCode(String postCode) {
	this.postCode = postCode;
}

public void setStreet(String street) {
	this.street = street;
}

public void setStreetNumber(String streetNumber) {
	this.streetNumber = streetNumber;
}

public void setPerson(Person person) {
	this.person = person;
}
}

