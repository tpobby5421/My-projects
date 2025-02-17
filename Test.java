
import java.util.Scanner;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Test {
    private double sum;  // Stores the sum of scores
    private int count;   // Stores the number of scores

    // Constructor
    public Test() {
        sum = 0;
        count = 0;
    }

    // Method to get the average
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter test scores (press -1 to quit): ");
        int score = scanner.nextInt();  // starting the loop

        while (score != -1) {
            sum += score;
            count++;

            System.out.println("Enter test scores (press -1 to quit): ");
            score = scanner.nextInt();
        }

        scanner.close();
    }

    // Method to calculate and return the formatted average
    public String toString() {
        if (count == 0) {
            return "The average of the 0 scores entered is NaN.";
        }

        double average = sum / count;
        DecimalFormat df = new DecimalFormat("#.00"); // "rounding" to 2 decimal places

        return "The average of the " + count + " scores entered is " + df.format(average) + ".";
    }
}

