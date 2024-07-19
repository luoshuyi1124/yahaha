import java.util.Scanner;

public class newTrivia {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int points = 0;

        System.out.println("Welcome to Bad Quiz.");
        System.out.println("");
        System.out.println("Note: don't use punctuation (apostrophes allowed)");
        System.out.println("");

        String[] questions = new String[5];
        questions[0] = "Q1: Where is it fun to stay at?";
        questions[1] = "Q2: My girlfriend turned into the moon.";
        questions[2] = "Q3: Is that weed?";
        questions[3] = "Q4: Road work ahead?";
        questions[4] = "Q5: Miss Keysha? Miss Keysha!";

        String[] answers = new String[5];
        answers[0] = "ymca";
        answers[1] = "that's rough buddy";
        answers[2] = "i'm calling the police";
        answers[3] = "uh yeah i sure hope it does";
        answers[4] = "omfg she fuckin dead";

        TheGame(UserInput, points, questions, answers);
        
        UserInput.close();
    }

    public static void TheGame(Scanner scanner, int points, String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String input = scanner.nextLine();
            points = PlusOneIfAnswerCorrect(points, answers, i, input);
        }
    }

    public static int PlusOneIfAnswerCorrect(int points, String[] answers, int i, String input) {
        if(input.toLowerCase().equals(answers[i])) {
            points += 1;
            System.out.println("Correct. Score: " + points);
            System.out.println("----------");
        } else {
            points += 0;
            System.out.println("Incorrect. Score: " + points);
            System.out.println("----------");
        }
        return points;
    }

}
