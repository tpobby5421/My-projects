public class Runner {
    public static void main(String[] args) {
        Test testScores = new Test();  // Create an instance of Test

        testScores.getAverage();  // Call method to collect test scores

        System.out.println(testScores.toString());  // Display the result
    }
}
