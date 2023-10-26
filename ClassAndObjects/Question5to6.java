public class Question5to6 {
	public static void main(String[] args) {
		//Question 4
		isArmstrong(145); //Result : It's a strong number
		isArmstrong(165); //Result : It's not a strong number



		
		//Question 5
		isLeapYear(2000);//Leap Year
		isLeapYear(2004);//Leap Year
		isLeapYear(2002);//NOT a leap year




		//Question 6
		Employee em = new Employee(1, "john", 20000);
		 double annualSalary = em.calculateAnnualSalary();
		 System.out.println("Annual salary is : " + annualSalary);
	}

	//Question 4
	public static void isArmstrong(int num) {
		int rem, fact, sum = 0;
		while (num > 0) {
			rem = num % 10;
			fact = 1;
			for(int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num = num / 10;
		}
		if(sum == num) {
			System.out.println("It's a strong number");
		} else {
			System.out.println("It's not a strong number");
		}
	}

	//Question 5

	public static void isLeapYear(int year) {
		if(year % 4 == 0 ) {
			if (year % 100 == 0 ) {
				if(year % 400 == 0) {
					System.out.println("It's a leap year");
				} else {
					System.out.println("It's not a leap year");
				}
			}
			else {
				System.out.println("It's a leap year");
			}
			
		} else {
			System.out.println("It's not a leap year");
		}
	}
}


//Question 6
class User {
	private int id;
	private String name;
	public User (int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Employee extends User {
	private double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public double calculateAnnualSalary(){
		return salary * 12;
	}
	
}
