import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    private static int score = 0;
    private static int questionIndex = 0;
    private static String[][] questions = {
            {"What is the capital of India?", "a) New Delhi", "b) Mumbai", "c) Chandigarh", "d) Ranchi"},
            {"What is the powerhouse of the cell?", "a) Mitochondria", "b) Nucleus", "c) Ribosome", "d) Golgi Apparatus"},
            {"Which planet is closest to the sun?", "a) Mercury", "b) Earth", "c) Jupiter", "d) mars"}
    };

    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Time's up! Moving to the next question.");
                displayNextQuestion();
            }
        };
        timer.schedule(task, 0, 20000); // 20 seconds timer for each question

        while (questionIndex < questions.length) {
            displayNextQuestion();
            String answer = scanner.nextLine().toUpperCase();
            if (answer.length() == 1 && answer.charAt(0) >= 'A' && answer.charAt(0) <= 'D') {
                if (answer.equals(questions[questionIndex][1].substring(0, 1).toUpperCase())) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
                questionIndex++;
            } else {
                System.out.println("Please enter a valid answer (a, b, c, or d).");
            }
        }

        timer.cancel();
        System.out.println("Quiz Ended. Your final score is: " + score + "/" + questions.length);
    }

    private static void displayNextQuestion() {
        if (questionIndex < questions.length) {
            System.out.println(questions[questionIndex][0]);
            for (int i = 1; i < 5; i++) {
                System.out.println(questions[questionIndex][i]);
            }
        }
    }
}
