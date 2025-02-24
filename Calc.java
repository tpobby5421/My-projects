public class Calc {
    private double num1;
    private double num2;

    // Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Operations
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not-a-Number
        }
    }

    // Override toString() method for better display
    @Override
    public String toString() {
        return "Calc Object: num1 = " + num1 + ", num2 = " + num2;
    }
}
