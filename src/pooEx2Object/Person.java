package pooEx2Object;

/**
 * Class to represent a person
 */
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	private City bornCity;
	private City residenceCity;
	
	// Constructor without parameters
	Person(){
		this.firstname = "unknown";
		this.lastname = "unknown";
		this.age = 0;
		this.address = "unknown";
		this.bornCity = new City ();
		this.residenceCity = new City();
	}
	
	//Constructor with all the parameters
	Person(String firstname, String lastname, int age, String address, City bornCity, City residenceCity){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.bornCity = bornCity;
		this.residenceCity = residenceCity;
	}
	
	// With only firstname and lastname
	Person(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = 0;
		this.address = "unknown";
		this.bornCity = new City ();
		this.residenceCity = new City();
	}
	
	// With firstname, lastname and age
	Person(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = "unknown";
		this.bornCity = new City ();
		this.residenceCity = new City();
	}
	
	// Constructor without the address
	Person(String firstname, String lastname, int age, City bornCity, City residenceCity){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = "unknown";
		this.bornCity = bornCity;
		this.residenceCity = residenceCity;
	}
	
	/**
	 * @return the bornCity
	 */
	public City getBornCity() {
		return bornCity;
	}
	
	/**
	 * @param bornCity the bornCity to set
	 */
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}
	
	/**
	 * @return the residenceCity
	 */
	public City getResidenceCity() {
		return residenceCity;
	}
	
	/**
	 * @param residenceCity the residenceCity to set
	 */
	public void setResidenceCity(City residenceCity) {
		this.residenceCity = residenceCity;
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
	
	public String toString() {
		// display number of inhabitants only if it's > 0
		String inhabitants = (this.bornCity.getNbOfInhabitants() == 0 ? "" : " population " + this.bornCity.getName() + " " + this.bornCity.getNbOfInhabitants() + " d'habitants");
		// display Bornnull if born city is not indicated
		String bornCity = this.bornCity.getName() == "unknown" ? "Bornnull" : this.bornCity.getName() + ", " + this.bornCity.getCountry() + inhabitants;
		// display the address only if it's indicated
		String address = this.getAddress() == "unknown" ? "" : this.getAddress() + " à ";
		
		return this.firstname + ", " + this.lastname + ", " + this.age + " ans, habitant " + address + this.residenceCity.getName() + ", Ville de naissance " + bornCity;
	}
	
	/**
	 * Function to know if a person is born in a given city
	 */
	public boolean bornInCountry(String countryName) {
		if(this.getBornCity().getCountry() == countryName) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Function to know if a person lives in a given city
	 */
	public boolean livesInCity(String cityName) {
		if(this.getResidenceCity().getName() == cityName) {
			return true;
		}else {
			return false;
		}
	}
}
