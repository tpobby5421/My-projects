import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PayCalculator {
//set up the main method to read the input file and write the output file
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
//read the input file and write the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean isFirstLine = true;
//read the input file line by line and write the output file line by line
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    // Write header with WeeklyPay column
                    writer.write(line + ",WeeklyPay");
                    writer.newLine();
                    isFirstLine = false;
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length < 3) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String name = parts[0].trim();
                double payRate = Double.parseDouble(parts[1].trim());
                double hoursWorked = Double.parseDouble(parts[2].trim());

                double weeklyPay = calculatePay(payRate, hoursWorked);

                writer.write(name + "," + payRate + "," + hoursWorked + "," + String.format("%.2f", weeklyPay));
                writer.newLine();
            }
//print out the output file
            System.out.println("Output written to " + outputFile);

        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data format error: " + e.getMessage());
        }
    }
//calculate the pay based on the rate and hours worked
    private static double calculatePay(double rate, double hours) {
        if (hours <= 40) {
            return rate * hours;
        } else {
            double regularPay = rate * 40;
            double overtimePay = (hours - 40) * rate * 1.5;
            return regularPay + overtimePay;
        }
    }
}
