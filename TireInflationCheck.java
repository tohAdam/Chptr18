import java.util.Scanner;

public class TireInflationCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input right front pressure: ");
        int rightFront = scan.nextInt();

        System.out.print("Input left front pressure: ");
        int leftFront = scan.nextInt();

        System.out.print("Input right rear pressure: ");
        int rightRear = scan.nextInt();

        System.out.print("Input left rear pressure: ");
        int leftRear = scan.nextInt();

        if (rightFront == leftFront && rightRear == leftRear) 
            System.out.println("Inflation is OK");
        else 
            System.out.println("Inflation is NOT OK");
    }
}
