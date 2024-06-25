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


        String stringshenanigans = "The fitnezz gram pacer test...";
        System.out.println(stringshenanigans);
        

    }
}