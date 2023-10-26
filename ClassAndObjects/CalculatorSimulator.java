public class CalculatorSimulator {
    //Created a static field for test cases no that should increment after each call
    private static int textcaseNo = 1;
    //Created a static block which will run once during execution
    static {
        String s = """
                Test Cases          Name            Salary          Is Indian          Message Expected
                -------------------------------------------------------------------------------------------------
                """;
        System.out.print(s);
    }
    public static void main(String[] args) {
        //Test Cases 
        TaxCalculator Ron = new TaxCalculator("Ron", "France", 34000);
        TaxCalculator Tim = new TaxCalculator("Tim", "Indian", 1000);
        TaxCalculator Jack = new TaxCalculator("Jack", "Indian", 55000);
        TaxCalculator noName = new TaxCalculator("null", "Indian", 30000); //By the design i have created the null like this but we can 
        //also catch exception for if user not include their name or not fill but for now i have done like this.
        calculatorsimulator(Ron);
        calculatorsimulator(Tim);
        calculatorsimulator(Jack);
        calculatorsimulator(noName);
    }

    public static void calculatorsimulator(TaxCalculator t) {
        
        try {
            System.out.printf("Test Case %-10d%-15s%-18.0f%-15bTax amount is %.0f%n",textcaseNo, t.getEmpName(), t.getEmpSal(), t.getIsIndian(), t.calculateTax());
        } catch(CountryNotValidException e) {
            System.out.printf("Test Case %-10d%-15s%-18.0f%-15b%s%n",textcaseNo, t.getEmpName(), t.getEmpSal(), t.getIsIndian(), e.getMessage());
        } catch(EmployeeNameInvalidException e) {
            System.out.printf("Test Case %-10d%-15s%-18.0f%-15b%s%n",textcaseNo, t.getEmpName(), t.getEmpSal(), t.getIsIndian(), e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.printf("Test Case %-10d%-15s%-18.0f%-15b%s%n",textcaseNo, t.getEmpName(), t.getEmpSal(), t.getIsIndian(), e.getMessage());
        }
        textcaseNo++;
    }
}

class TaxCalculator {
    //Creating instance variable which can be excessed by this class only.
    private String empName;
    private boolean isIndian;
    private double empSal;

    
    //Creating a constructor for instializing the fields, but in constructor I have added a minor change
    //it takes the countryName as a string and than countryName will will checked inside the constructor
    //that is it satisfying our conditions
    public TaxCalculator(String empName, String countryName, double empSal) {
        this.empName = empName;
        //Here I am using a boolean expression for checking the is user inputed the country name as india or not
        //Here user can input input india in various ways so i have included the toUpperCase method that can make 
        //the userInput to all in uppercase and then compare them.
        this.isIndian = (countryName.toUpperCase().equals("INDIAN") || countryName.toUpperCase().equals("INDIA")) ? true : false;
        this.empSal = empSal;
    }

    //Now a method to calculate the tax.
    public double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        double taxAmount = 0;
            if(!isIndian) {
                //If user is not indian than this exception is thrown
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
            } else if(empName.equals("null") || empName.equals("empty") || empName.equals("")) {
                throw new EmployeeNameInvalidException("The employee name cannot be empty");
            } else if(empSal > 0 && empSal < 10000) {
                throw new TaxNotEligibleException("The employee does not need to pay tax");
            } else {
                if(empSal >= 10000 && empSal < 30000){
                    taxAmount = (empSal *4/100);
                } else if(empSal >= 30000 && empSal < 50000) {
                    taxAmount = (empSal *5/100);
                } else if(empSal >= 50000 && empSal < 100000) {
                    taxAmount = (empSal *6/100);
                } else {
                    taxAmount = (empSal *8/100);
                }
            }

        return taxAmount;
    }
    public String getEmpName(){
        return empName;
    }
    public double getEmpSal(){
        return empSal;
    }
    public boolean getIsIndian(){
        return isIndian;
    }
}

//Creating a country not valid exception for calculating the tax if the isIndian is false then it will be thrown.
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

//Creating a Employee Name Invalid Exception if user enterend their name as null or empty
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}
