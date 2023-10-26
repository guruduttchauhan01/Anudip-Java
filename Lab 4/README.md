Develop a simple java application to calculate the tax for a particular employee based on his salary with below details

	- Develop a class named “TaxCalculator“ with a method named calculateTax, this method should return a double taxAmount.


		Variable Name    Data Type

		empName             String

		isIndian                   boolean

		empSal                   double



The business logic for calculating the tax is as follows, this has to be implemented inside the method,

	- If the employee is not a Indian

		- The calculator should throw a "CountryNotValidException".

	- If the employee name is null or empty

		- The calculator should throw a "EmployeeNameInvalidException".

	- If empSal is greater than one lakh and isIndian true

		- taxAmount =empSal *8/100

	- Otherwise If empSal is between 50K and 1lakh and isIndian true

		- taxAmount =empSal *6/100

	- Otherwise If empSal is between 30 and 50 Thousand and isIndian true

		- taxAmount =empSal *5/100

	- Otherwise If empSal is between 10 and 30 Thousand and isIndian true

		- taxAmount =empSal *4/100

	- Otherwise

		- The calculator should throw a TaxNotEligibleException.



Develop a main class CalculatorSimulator, implement the following logic in main method

	- 1. Execute the calculateTax Method and print the tax amount as “Tax amount is : “<<Tax Amount>>"

	- 2. In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages,

		a. Country not valid: “The employee should be an Indian citizen for calculating tax”

		b. Employee name not valid: “The employee name cannot be empty”

		c. Not eligible for Tax calculation: “The employee does not need to pay tax”



The following test cases to be executed, change the data in main method and run it and verify the



Output messages




Test Cases 	Name	   Salary 	Is Indian 		Message Expected

-----------------------------------------------------------------------------------

Test Case 1 	 Ron 	    34000 		False 		The employee should be an Indian citizen for calculating tax.

Test Case 2 	 Tim 	     1000 		        True 		The employee does not need to pay tax

Test Case 3 	 Jack 	     55000 		True 		Tax amount is 3300

Test Case 4 	 <empty>    30000 		True 		The employee name cannot be empty
