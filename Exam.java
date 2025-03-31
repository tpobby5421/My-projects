public class Exam extends Assessment {
    private int totalQuestions;  // Total number of questions
    private int missedQuestions; // Number of missed questions
    private double pointsEach;   // Points per question

    /**
     * Constructor that initializes the exam details
     * @param questions Total number of questions
     * @param missed Number of questions missed
     */
    public Exam(int questions, int missed) {
        this.totalQuestions = questions;
        this.missedQuestions = missed;
        this.pointsEach = 100.0 / questions; // Each question's value
        
        // Calculate the score and set it in the Assessment class
        int score = (int) Math.round((questions - missed) * pointsEach);
        setScore(score);
    }

    /**
     * Gets the points each question is worth.
     * @return The value of each question.
     */
    public double getPointsEach() {
        return this.pointsEach;
    }
}
