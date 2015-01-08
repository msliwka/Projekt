package Store;

import java.util.ArrayList;
import java.util.List;

public class Person extends Entity {


	private ArrayList<Adress> adresses;

	public Person()
	{
		super();
		this.setAdresses(new ArrayList<Adress>());
	}
	private String firstName;
	private String surname;
	private String pesel;
	private User user;
	private List<Adress> addresses;
	
	public String getFirstName() {
		return firstName;
	}
	public String getSurname() {
		return surname;
	}
	public String getPesel() {
		return pesel;
	}
	public User getUser() {
		return user;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
		public ArrayList<Adress> getAdresses() {
		return adresses;
	}
	public void setAdresses(ArrayList<Adress> adresses) {
		this.adresses = adresses;
	}
	public List<Adress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Adress> addresses) {
		this.addresses = addresses;
	}
	
}
