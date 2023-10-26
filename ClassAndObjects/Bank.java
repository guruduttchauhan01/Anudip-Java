import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        //Question One
        BankSimulation bank = new BankSimulation();
        bank.withdraw(5000); //Withdraw money from the bank and print the remaining balance
        bank.deposit(5000); //Deposit money to the account and print the total balance after money added to the account

        //Question two 
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the number num1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the number num2 : ");
		int num2 = input.nextInt();
		int maximum = Bank.maximum(num1, num2);
		System.out.println(maximum);
        input.close();
    }

    //Question Two Maximum of two numbers using Ternary Operator
    public static int maximum(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

}
//Created a BankSimulation class
class BankSimulation {
	//declaring instance variable for BankSimulation class with a private access modifier
	double amount;
	public BankSimulation() {
		this.amount = 10000;
	}
	//Call this method from main method to withdrawal money from the account
	public void withdraw(double withdrawalAmount) {
		String message = (amount > withdrawalAmount) ? "Withdrawal Successful" : "Insufficient balance";
		amount -= withdrawalAmount;
		System.out.println(message + " Balance is : " + amount);
	}
	//To deposit money call this method from the main method
	public void deposit(double depositAmount) {
		String message = (depositAmount > 0) ? "Deposited Successfully" : "Please enter value greater than 0";
        amount += depositAmount;
        System.out.println(message + " Total bank balance : " + amount);
	}
}
