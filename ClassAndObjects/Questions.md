<b>Question 1: </b>Create a Bank class and declare an instance variable named amount of type double.Create parameterized constructor to initialize variable “amount” with value 10000.
             Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
             Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful”
             message will be printed on the console and amount should be updated after withdraw.
             Later on, deposit 5000 in the account balance.At the end display total balance on the console.
             String message = (withdrawal Amount <= amount) ? "Withdrawal successful" : "Insufficient balance"; 

              [Hint: Use constructor, ternary operator] Sample input: Amount=10000 Withdrawal amount=5000 Deposit amount=5000

<b>Question 2: </b> Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30

<b>Question 3:</b> Write a program to declare two variables num and n and take an input during compilation time to check whether the nth bit of the given number is set (1) or not (0). 
              Logic to get nth bit of a number Step by step descriptive logic to get the nth bit of a number. 1. 
              Take an input of any number and Store it in some variable, say num. 2. Take an Input the bit position and Store it in some variable, say n. 3. 
              To get the nth bit of num right shift num, n times. Then perform bitwise AND with 1 i.e. bitStatus = (num >> n) & 1. 
              Sample Input: Input number: num=12 Input nth bit number: n=2

<b>Question 4:</b> Write a program to check whether a number is a Strong number or not. 
              Strong number is a special number whose sum of factorial of digits is equal to the original number. 
              For example: 145 is a strong number. Since, 1! + 4! + 5! = 145 
              [Hint: conditional operator,method,use parameterized method to take input] Sample Input 1: 145



<b>Question 5:</b> Write a program to check leap year using if else. How to check whether a given year is a leap year or not. 
              [Hint:Take an input of any number. Store it in some variable say year. If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a year   is exactly divisible by 400 then it is a leap year.] 
              Sample Input 1: 2004

<b>Question 6:</b> Create a program to calculate the annual salary of an employee by using inheritance. Create a class named "User" with the following properties and methods:                           Properties: id(int): representing the id of the User name(String):representing the name of the User Constructor: Declare parameterized constructor to initialize id and                   name. Create a subclass named "Employee" that inherits from the "User" class. Add the following additional properties and methods: Properties: salary(double):representing                the monthly salary of the employee Method: double calculateAnnualSalary():to calculate the annual salary earned by the employee. In the main method, create an object of                 "Employee" class. Calculate the annual salary of the employee and display it.
              [Hint:Use constructor or setter methods to set the value] Sample Input: Id:1 name: john salary: 20000
