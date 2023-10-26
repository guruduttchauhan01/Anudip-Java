public class PlacesToVisit {
	public static void main(String[] args) {
		
		//Calling the parent class to show the base class the method they print the base class things.
		 HillStations hillStations = new HillStations();
		 hillStations.location();
		 hillStations.famousFor();

		 //Calling the manali class from parent class HillStations and calling the methods but this time the child class methods has been called.
		 HillStations manali = new Manali();
		 manali.location();
		 manali.famousFor();

		 //Same goes with Mussoorie and Gulmarg classes 
		 HillStations mussoorie = new Mussoorie();
		 mussoorie.location();
		 mussoorie.famousFor();

		 HillStations gulmarg = new Gulmarg();
		 gulmarg.location();
		 gulmarg.famousFor();

	}
}

//Creating the superclass HillStations
//We can implement HillStation as abstract class or interface class as these classes 
//follow hierarchy model better with there unique features.
class HillStations {
    
	public void location() {
		System.out.println( "-".repeat(10) + "Welcome" + "-".repeat(10));
	}
	public void famousFor() {
		System.out.println("HillStations are mainly famous for their scenic views.");
	}
}

//Created the subclass of HillStations Class Manali a location.

class Manali extends HillStations {
	//Overiding the superclass methods in child class
	@Override
	public void location() {
		System.out.println("Manali is a town, near Kullu town in Kullu district in the Indian state of Himachal Pradesh.");
	}
	@Override
	public void famousFor() {
		System.out.println("Manali is famous for its natural charm and unparalleled beauty.");
	}
}

//Creating the superclass HillStations child class Mussoorie

class Mussoorie extends HillStations {
	//Overiding the superclass methods in child class
	@Override
	public void location() {
		System.out.println("Mussoorie is a hill station in the Dehradun district of the Indian state of Uttarakhand.");
	}
	@Override
	public void famousFor() {
		System.out.println("Mussoorie, the queen of hill stations, is famous for its scenic beauty, good social life and entertainment.");
	}
}

//Creating the superclass HillStations child class Gulmarg
class Gulmarg extends HillStations {
	//Overiding the superclass methods in child class
	@Override
	public void location() {
		System.out.println("Gulmarg is a hill station and town in the Baramulla district of Jammu and Kashmir, India.");
	}
	@Override
	public void famousFor() {
		System.out.println("Gulmarg has attracted millions of tourists throughout its existence with the scenic beauty of the Himalayan Mountains in the back drop.");
	}
}
