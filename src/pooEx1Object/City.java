package pooEx1Object;

/**
 * Class City to represent a city
 */
public class City {
	// Public attributes to allow the program to access them without getters and setters
//	public String name;
//	public String country;
//	public int nbOfInhabitants;
	
	// Private attributes to prevent the program to access them without getters and setters
	private String name;
	private String country;
	private int nbOfInhabitants;
	
	// Variable to count the number of instances of the class
	private static int instanceCount = 0;
	
	City(){
		this.name = "unknown";
		this.country = "unknown";
		this.nbOfInhabitants = 0;
		instanceCount += 1;
	}
	
	City(String name, String country, int nbOfInhabitants){
		this.name = name;
		this.country = country;
		// Display error if nbOfInhabitants is < 0
		if(nbOfInhabitants < 0) {
			System.out.println("A city can't have a negative number of inhabitants. Setting the number to 0.");
		}else {
			this.nbOfInhabitants = nbOfInhabitants;
		}
		instanceCount += 1;
	}
	
	// Constructor with two parameters
	City(String name, int nbOfInhabitants){
		this.name = name;
		this.country = "unknown";
		this.nbOfInhabitants = nbOfInhabitants;
		instanceCount += 1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the nbOfInhabitants
	 */
	public int getNbOfInhabitants() {
		return nbOfInhabitants;
	}

	/**
	 * @param nbOfInhabitants the nbOfInhabitants to set
	 */
	public void setNbOfInhabitants(int nbOfInhabitants) {
		if(nbOfInhabitants < 0) {
			System.out.println("A city can't have a negative number of inhabitants. Setting the number to 0.");
		}else {
			this.nbOfInhabitants = nbOfInhabitants;
		}
	}
	
	public void display() {
		System.out.println("ville de " + this.getName() + " en " + this.getCountry() + " ayant " + this.getNbOfInhabitants() + " habitants.");
	}
	
	public String toString() {
		return "ville de " + this.getName() + " en " + this.getCountry() + " ayant " + this.getNbOfInhabitants() + " habitants.";
	}
	
	public static int getInstanceCount() {
		return instanceCount;
	}
}
