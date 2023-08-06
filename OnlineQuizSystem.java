import java.util.Scanner;

public class OnlineQuizSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz Questions
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which planet is known as the 'Red Planet'?",
            "3. What is the chemical symbol for water?",
        };

        // Quiz Choices
        String[][] choices = {
            {"A. Kolkata", "B. Mumbai", "C. Delhi", "D. Lucknow"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Wa", "B. Wo", "C. H2O", "D. Co"},
        };

        // Quiz Correct Answers
        char[] correctAnswers = {'C', 'B', 'C'};

        int score = 0;
        int totalQuestions = questions.length;

        System.out.println("Welcome to the Online Quiz System!");
        System.out.println("----------------------------------");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < choices[i].length; j++) {
                System.out.println(choices[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + totalQuestions);

        scanner.close();
    }
}
