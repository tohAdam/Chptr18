import java.util.Scanner;

public class TireInflationCheckA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goodPressure = true;

        System.out.print("Input right front pressure: ");
        int rightFront = scanner.nextInt();
        if (rightFront < 35 || rightFront > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left front pressure: ");
        int leftFront = scanner.nextInt();
        if (leftFront < 35 || leftFront > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input right rear pressure: ");
        int rightRear = scanner.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left rear pressure: ");
        int leftRear = scanner.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        if (rightFront == leftFront && rightRear == leftRear && goodPressure) 
            System.out.println("Inflation is OK");
        else 
            System.out.println("Inflation is BAD");
    }
}
