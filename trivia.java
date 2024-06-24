import java.util.Scanner;

public class trivia {
    public static void main(String[] args) {
        int score = 0;
        String Question1 = "Question 1: What is 1 + 1 = ?";
        String Question2 = "Question 2: What color is Pikachu?";
        String Question3 = "Question 3: In the third panel of page 87 of Dungeon Meshi volume 8, what does Chilchuck say?";
        String Answer1 = "2";
        String Answer2 = "yellow";
        String Answer3 = "do i look like i could eat a kilo?";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String input = scanner.nextLine();
        System.out.println("You're name is " + input);
        System.out.println("-------------------");

        System.out.println("Are you ready to begin? Enter yes or no.");
        String ready = scanner.nextLine();
        if (!ready.toLowerCase().equals("yes")) {
            System.exit(0);
        }       
        System.out.println("-------------------");

        

        System.out.println(Question1);
        String answer = scanner.next();
        if(answer.toLowerCase().equals(Answer1)) {
            System.out.println("You are correct.");
            score += 1;
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Incorrect. 1 + 1 = 2");
            score += 0;
            System.out.println("Your score: " + score);
        }
        System.out.println("-------------------");


        System.out.println(Question2);
        String answer2 = scanner.next();
        if(answer2.toLowerCase().equals(Answer2)) {
            System.out.println("You are correct.");
            score += 1;
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Incorrect. The answer is yellow.");
            score += 0;
            System.out.println("Your score: " + score);
        }
        System.out.println("-------------------");


        System.out.println(Question3);
        System.out.println("(If you need a hint, type 'hint')");
        scanner.nextLine();
        String answer3 = scanner.nextLine();
        if(answer3.toLowerCase().equals("hint")) {

            System.out.println("Read the code or get the book bruh :/ Try again:");
            scanner.nextLine();
            String answer4 = scanner.nextLine();
            if(answer4.toLowerCase().equals(Answer3)) {
                System.out.println("You are correct.");
                score += 1;
                System.out.println("Your score: " + score);
            } else {
                System.out.println("Incorrect. The answer is 'Do I look like I could eat a kilo?'");
                score += 0;
                System.out.println("Your score: " + score);
                System.out.println(answer4);
            }

        } else {

            if(answer3.toLowerCase().equals(Answer3)) {
                System.out.println("You are correct.");
                score += 1;
                System.out.println("Your score: " + score);
            } else {
                System.out.println("Incorrect. The answer is 'Do I look like I could eat a kilo?'");
                score += 0;
                System.out.println("Your score: " + score);
                System.out.println(answer3.toLowerCase());
            }

        }

        System.out.println("-------------------");
        System.out.println("Your final score is: " + score);

        scanner.close();
    }
    
}
