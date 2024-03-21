import java.util.Scanner;

public class BankServiceCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the balance in the checking account: ");
        double checkingBalance = scan.nextDouble();

        System.out.print("Enter the balance in the savings account: ");
        double savingsBalance = scan.nextDouble();

        if (checkingBalance > 1000 || savingsBalance > 1500) 
            System.out.println("No service charge for writing checks.");
        else {
            double serviceChargePerCheck = 0.15;
            System.out.println("Service charge per check: $" + serviceChargePerCheck);
        }
    }
}
