import java.util.Scanner;

public class TireInflationCheckB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goodPressure = true;

        // Ask for the pressure of each tire and check if it's within range
        System.out.print("Input right front pressure: ");
        int rightFront = scan.nextInt();
        if (rightFront < 35 || rightFront > 45) {
            System.out.println("Warning: right front pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input left front pressure: ");
        int leftFront = scan.nextInt();
        if (leftFront < 35 || leftFront > 45) {
            System.out.println("Warning: left front pressure is out of range");
            goodPressure = false;
        }

        System.out.print("Input right rear pressure: ");
        int rightRear = scan.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            System.out.println("Warning: right rear pressure is out of range");
            goodPressure = false;
        }
        System.out.print("Input left rear pressure: ");
        int leftRear = scan.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            System.out.println("Warning: left rear pressure is out of range");
            goodPressure = false;
        } if (goodPressure && Math.abs(rightFront - leftFront) <= 3 && Math.abs(rightRear - leftRear) <= 3) 
            System.out.println("Inflation is OK");
          else 
            System.out.println("Inflation is BAD");
        

    }
}

