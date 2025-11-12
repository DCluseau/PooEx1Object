package pooEx1Object;

/**
 * Class to represent a person
 */
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	private City bornCity;
	
	Person(){
		this.firstname = "unknown";
		this.lastname = "unknown";
		this.age = 0;
		this.address = "unknown";
		this.bornCity = new City ();
	}
	Person(String firstname, String lastname, int age, String address, City bornCity){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.bornCity = bornCity;
	}
	// With only firstname and lastname
	Person(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = 0;
		this.address = "unknown";
		this.bornCity = new City ();
	}
	// With firstname, lastname and age
	Person(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = "unknown";
		this.bornCity = new City ();
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + this.firstname + ", lastname=" + this.lastname + ", age=" + this.age + ", address=" + this.address
				+ "]" + (this.bornCity.getName() == "unknown" ? "Bornnull" : "BornCity" + " [name=" + this.bornCity.getName() + ", state=" + this.bornCity.getCountry() + ", nbInhabitants=" + this.bornCity.getNbOfInhabitants() + "]");
	}
	
}
