public class Vaccination {
    public static void main(String[] args) {
        //Checking for person1 giving all values as required by the classes
        Vaccine person1 = new VaccinationSuccessful(18, "Indian");
        person1.firstDose(); //true
        person1.secondDose(); //true
        person1.boosterDose(); //true

        //For person2 giving the age values as 11 this is false and does not proccedd for first dose and second dose
        Vaccine person2 = new VaccinationSuccessful(11, "Indian");
        person2.firstDose(); //false
        person2.secondDose(); //false
        person2.boosterDose(); //true

        //For person3 age is above 18 but nationality is not Indian
        Vaccine person3 = new VaccinationSuccessful(21, "Italy");
        person3.firstDose(); //false
        person3.secondDose(); //false
        person3.boosterDose(); //true
    }
}





/*
		 *  Create abstract class vaccine.Create two variables age(int),nationality(String).
		 * create 2 concrete methods firstDose() and secondDose(). 
		 * Scenario 1:user can take the first dose if the user is Indian and age is 18.
		 * After vaccination the user has to pay 250rs(which will be displayed on the console). 
		 * Scenario 2: Users are eligible to take the second dose only after completing the first dose. 
		 * Scenario 3: create abstract method boosterDose() in abstract class Vaccine.
		 * Create one implementation class vaccinationSuccessful, where implement boosterDose() method. 
		 * Create main class vaccination and invoke all methods accordingly. 
		 * [Hint:Create constructor to initialize variables age and nationality,
		 * Use flow control(If-else) to check condition] Sample Input Nationality: Indian Age: 18
		 */
//Creating the abstract class vaccine
abstract class Vaccine {
	//Creating variable private so it can only be accessed directly by this class only.
	private int age;
	private String nationality;
    //IMPORTANT : In the question there is no mention for secondDose details is the person has to take first
    //vaccine to take second so for that i changed it make it look like more better and much logical i am 
    //adding a third field boolean isVaccinatedFirst
    private boolean isVaccinatedFirst = false;
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality.toUpperCase();//Making the nation name all uppercase
    }
	public void firstDose() {
		if(age >= 18 && nationality.equals("INDIAN")) {
            System.out.println("You are eligible to take the first dose.");
            System.out.println("Please pay 250 Rs.");
            isVaccinatedFirst = true;
        } else if(age < 18) {
            System.out.println("Not eligible to take the first dose. As your is below 18.");
        } else {
            System.out.println("You are not indian. So apply in your country.");
        }
	}

    public void secondDose() {
        if(isVaccinatedFirst) {
            System.out.println("You are eligible to take second dose.");
        } else {
            System.out.println("You haven't taken the first dose.");
        }
    }

    //Creating a abstract method booster
    abstract void boosterDose();

}


//Creating the class VaccinationSuccessful that extends the superclass Vaccine and check for Vaccination

class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    //No criteria written to take boosterDose so I am leaving this as simple method.
    @Override
    public void boosterDose() {
        System.out.println("Congratulation, You are eligible to take booster dose.");
    }
}

