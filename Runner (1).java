import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a Calc object
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);
        double n1, n2;

        // Validate first number input
        System.out.print("Please enter the first number: ");
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a numeric value: ");
            scan.next(); // Clear invalid input
        }
        n1 = scan.nextDouble();

        // Validate second number input
        System.out.print("Please enter the second number: ");
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a numeric value: ");
            scan.next(); // Clear invalid input
        }
        n2 = scan.nextDouble();

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Output from Calc instance
        System.out.println(myCalculator);
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // Perform calculations and display results
        System.out.println("The sum is: " + myCalculator.add());
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
