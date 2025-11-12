package pooEx1Object;

public class TestPerson {

	public static void main(String[] args) {
		City amiens = new City("Amiens", "France", 0);
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", amiens);
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");
		
		System.out.println(manu.toString());
		System.out.println("----------------------");
		System.out.println(poutine.toString());
		System.out.println("----------------------");
		System.out.println(biden.toString());
		System.out.println("----------------------");
	}

}
