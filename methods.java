public class methods {
    public static void main(String[] args) {
        String[] questions = new String[3];
        questions[0] = "Question 1: What is 1 + 1 = ?";
        questions[1] = "Question 2: What color is Pikachu";
        questions[2] = "Question 3: In the third panel of page 87 of Dungeon Meshi volume 8, what does Chilchuck say?";

        String[] answers = new String[3];
        answers[0] = "2";
        answers[1] = "yellow";
        answers[2] = "do i look like i could eat a kilo?";

        outputQuestionsAndAnswersXTimes(3, questions, answers);

    }
    public static void outputQuestionsAndAnswersXTimes (int x, String[] questions, String[] answers) { //inside parentheses are parameters
        for (int y = 0; y < x; y++) {
            for (int i = 0; i < questions.length; i++) { //questions and answers will stay redlined until they are added in the parameter
                System.out.println(questions[i]);
                System.out.println(answers[i]);
            }
            System.out.println("----------");
        }
    }
}
