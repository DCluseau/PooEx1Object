package pooEx2Object;

public class TestPerson {

	public static void main(String[] args) {
		City amiens = new City("Amiens", "France", 0);
		City paris = new City("Paris", "France", 2000000);
		Person manu = new Person("Macron", "Emmanuel", 43, "L'Elysée", amiens, paris);
		Person sarko = new Person("Sarkozy", "Nicolas", 66, paris, paris);
		
		City london = new City("London");
		City newyork = new City("New York", "USA");
		Person boris = new Person("Johnson", "Boris", 56, "Downing Street", newyork, london);
		
		City moscou = new City("Moscou");
		City chateauroux = new City("Châteauroux", "France");
		Person depardieu = new Person("Depardieu", "Gérard", 72, chateauroux, moscou);
		
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hôtel particulier", newyork, paris);
		
		City louisville = new City("Louisville", "USA");
		City indianhills = new City("Indian Hills", "USA");
		Person lawrence = new Person("Lawrence", "Jennifer", 30, indianhills, louisville);
		
		// Display all the personnalities
		System.out.println("Liste des personnalités");
		System.out.println(manu.toString());
		System.out.println(sarko.toString());
		System.out.println(boris.toString());
		System.out.println(depardieu.toString());
		System.out.println(kravitz.toString());
		System.out.println(lawrence.toString());
		System.out.println("----------------------");
		
		// Filter personnalities born or living in Paris
		System.out.println("Liste après notre filtre");
		if(manu.bornInCountry("France") || manu.livesInCity("Paris")) {
			System.out.println(manu.toString());
		}
		if(sarko.bornInCountry("France") || sarko.livesInCity("Paris")) {
			System.out.println(sarko.toString());
		}
		if(boris.bornInCountry("France") || boris.livesInCity("Paris")) {
			System.out.println(boris.toString());
		}
		if(depardieu.bornInCountry("France") || depardieu.livesInCity("Paris")) {
			System.out.println(depardieu.toString());
		}
		if(kravitz.bornInCountry("France") || kravitz.livesInCity("Paris")) {
			System.out.println(kravitz.toString());
		}
		if(lawrence.bornInCountry("France") || lawrence.livesInCity("Paris")) {
			System.out.println(lawrence.toString());
		}
	}

}
