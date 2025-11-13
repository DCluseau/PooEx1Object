package pooEx2Object;

public class TestCity {

	public static void main(String[] args) {
		// Initialize cities object
		City toulouse = new City("Toulouse", "France", 450000);
		City montousse = new City("Montoussé", "France", 248);
		City biarritz = new City("Biarritz", "France", 25000);
		
		// Display cities without specific method
		/*
		 * System.out.println("City : " + toulouse.name +"\nCountry : " +
		 * toulouse.country + "\nNumber of inhabitants : " + toulouse.nbOfInhabitants);
		 * System.out.println("----------------------"); System.out.println("City : " +
		 * montousse.name +"\nCountry : " + montousse.country +
		 * "\nNumber of inhabitants : " + montousse.nbOfInhabitants);
		 * System.out.println("----------------------"); System.out.println("City : " +
		 * biarritz.name +"\nCountry : " + biarritz.country +
		 * "\nNumber of inhabitants : " + biarritz.nbOfInhabitants);
		 * System.out.println("----------------------");
		 * 
		 * // Add 20 000 inhabitants to Toulouse toulouse.nbOfInhabitants += 20000;
		 * System.out.println("Adding 20 000 inhabitants to Toulouse");
		 * System.out.println("City : " + toulouse.name +"\nCountry : " +
		 * toulouse.country + "\nNumber of inhabitants : " + toulouse.nbOfInhabitants);
		 */
		
		// Access attributes via getters and setters
		System.out.println("City : " + toulouse.getName() +"\nCountry : " + toulouse.getCountry() + "\nNumber of inhabitants : " + toulouse.getNbOfInhabitants());
		System.out.println("----------------------");
		System.out.println("City : " + montousse.getName() +"\nCountry : " + montousse.getCountry() + "\nNumber of inhabitants : " + montousse.getNbOfInhabitants());
		System.out.println("----------------------");
		System.out.println("City : " + biarritz.getName() +"\nCountry : " + biarritz.getCountry() + "\nNumber of inhabitants : " + biarritz.getNbOfInhabitants());
		System.out.println("----------------------");
		
		// Add 20 000 inhabitants to Toulouse using setter
		toulouse.setNbOfInhabitants(toulouse.getNbOfInhabitants() + 20000);
		System.out.println("Adding 20 000 inhabitants to Toulouse");
		System.out.println("City : " + toulouse.getName() +"\nCountry : " + toulouse.getCountry() + "\nNumber of inhabitants : " + toulouse.getNbOfInhabitants());
		System.out.println("----------------------");
		
		// If the user wants to substract a number of inhabitants to a city, they can get the value of the attribute and substract the value directly. Example to set the number of inhabitants to 370000 :
		toulouse.setNbOfInhabitants(toulouse.getNbOfInhabitants() - 100000);
		System.out.println("Substracting 20 000 inhabitants to Toulouse");
		System.out.println("City : " + toulouse.getName() +"\nCountry : " + toulouse.getCountry() + "\nNumber of inhabitants : " + toulouse.getNbOfInhabitants());
		System.out.println("----------------------");
		// Note : another way is to set directly the new value with the setter : 
		// toulouse.setNbOfInhabitants(370000);
		
		// Initiate a city with only its name and number of inhabitants
		City rabat = new City("Rabat", 577000);
		System.out.println("[ville : " + rabat.getName() + "] [pays : " + rabat.getCountry() + "] [nombre d'habitants : " + rabat.getNbOfInhabitants());
		System.out.println("----------------------");
		// Modify name of country
		rabat.setCountry("Maroc");
		System.out.println("[ville : " + rabat.getName() + "] [pays : " + rabat.getCountry() + "] [nombre d'habitants : " + rabat.getNbOfInhabitants());
		System.out.println("----------------------");
		
		// Display City using display() method
		toulouse.display();
		System.out.println("----------------------");
		
		// Si on utilise System.out.println, la console va afficher la référence de l'objet
		// en mettant le nom du package puis de la classe et enfin l'adresse de l'objet
		// pooEx1Object.City@24d46ca6
		// C'est affiché comme cela car il n'y a pas encore de méthode toString dans la classe City
		// Résultat en ayant initialisé la méthode toString
		System.out.println(toulouse);
		System.out.println("----------------------");
		
		// Count the number of instances by using a static attribute
		System.out.println("Nombre d'instances : " + City.getInstanceCount());
		System.out.println("----------------------");
		// Note : we could also use a list to stock the instances then display its length
		
	}

}
