import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int num = input.nextInt();
        System.out.print("Input nth bit : ");
        int n = input.nextInt();
        input.close();

        int bitStatus = (num >> n) & 1;
        if(bitStatus == 1) {
            System.out.println("The nth bit of " + num + " is set.");
        } else {
            System.out.println("The nth bit of " + num + " is not set.");
        }
    }
}
