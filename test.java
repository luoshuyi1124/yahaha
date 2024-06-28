import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        System.out.println("hello world");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String input = scanner.nextLine();
        System.out.println("You are " + input);
        scanner.close();

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
        
        float interest = loan * interestRate;
        System.out.println(interest);

    }
}