import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        System.out.println("hello world");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String input = scanner.nextLine();
        System.out.println("You are " + input);

        int x = 10;
        int y = 20;

        int result = x + y;
        System.out.println(result);

        result = x - y;
        System.out.println(result);

        result = x * y;
        System.out.println(result);

        result = x / y;
        System.out.println(result);

        System.out.println(Math.max(x, y));

        System.out.println("---------- string stuff below");
        
    //string stuff like methods
        String stringshenanigans = "The fitnezz gram pacer test...";

        //upper and lower case
        System.out.println(stringshenanigans.toUpperCase());
        System.out.println(stringshenanigans.toLowerCase());

        //length
        System.out.println("string length is: " + stringshenanigans.length());

        //indexOf
        System.out.println(stringshenanigans.indexOf("gram")); //prints index of first letter of "gram"

        //replace
        System.out.println(stringshenanigans.replace("zz", "ss"));

    //following returns booleans
        //isEmpty
        String sure = "am i empty";
        boolean booLean = sure.isEmpty();
        System.out.println(booLean);

        //startsWith and endsWith; looks at whole sentence and accounts for upper/lower case
        System.out.println(stringshenanigans.startsWith("T"));
        System.out.println(stringshenanigans.endsWith("s"));

        //contains
        System.out.println(stringshenanigans.contains("pacer"));

        //charAt
        System.out.println(stringshenanigans.charAt(15));

        //substring; returns everything after that index
        System.out.println(stringshenanigans.substring(15));

        System.out.println("---------- casting below");

    //casting (converting data types between each other, like int and float)
        int loan = 370;
        float interestRate = 0.05134f;
        
        float interest = loan * interestRate; //can make float from float * int, cannot make int from float * int
        System.out.println(interest);

        float ya = 50.5f * 20.6f;
        System.out.println(ya);

        float ye = (int)50.5f * 20.6f; //different from example above bc 50.5 is cast as int before its multiplied and recast as float
        System.out.println(ye);

        System.out.println("---------- ternary operator below");

    //ternary operator (alternative way to write an if statement)
        int exam = 65;
        int gift = 0;

        if (exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        } //this is standard if/else statement
        System.out.println(gift);

        gift = (exam >= 50) ? 10 : 0; //this is a ternary operator
        System.out.println(gift);

        System.out.println("---------- arrays below");

    //arrays (yippee)
        String[] questions = new String[3];
        questions[0] = "Question 1: What is 1 + 1 = ?";
        questions[1] = "Question 2: What color is Pikachu";
        questions[2] = "Question 3: In the third panel of page 87 of Dungeon Meshi volume 8, what does Chilchuck say?";

        String[] answers = new String[3];
        answers[0] = "2";
        answers[1] = "yellow";
        answers[2] = "do i look like i could eat a kilo?";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        questions[0] = "what that fuck are you?";
        System.out.println(questions[0].length()); //things in an array can be easily changed
        //note: arrays have a fixed size; for unfixed size, use ArrayList which is also not confined to one data type
        
        System.out.println("---------- loops below");

    //loops
        //fori
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        //foreach
        for(String question : questions) {
            System.out.println(question);
        }

        //while loops
        while(true) {
            System.out.println("Do you want to continue?");
            if(scanner.next().toLowerCase().equals("yes")) {
                continue;
            } else {
                break;
            }
        }

        System.out.println("----------- methods below");

    //methods
        outputQuestionsAndAnswersXTimes(3, questions, answers);

        scanner.close();
    }

    public static void outputQuestionsAndAnswersXTimes (int x, String[] questions, String[] answers) { //inside parentheses are parameters
        for (int y = 0; y < x; y++) {
            for (int i = 0; i < questions.length; i++) { //questions and answers will stay redlined until they are added in the parameter
                System.out.println(questions[i]);
                System.out.println(answers[i]);
            }
            System.out.println("**********");
        }
    }
}