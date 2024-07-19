import java.util.Scanner;

public class TicTacToe {
/**
 * documentation (do it next time)
 */
    public static void main(String[] args) {
        String Empty = " placeholder ";
        String VertLine = "|";
        String[] array = new String[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i + 1);
        } //set-up variables and array to make the tictactoe board;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions: type a number from 1-9 to claim your space.");

        makeBoard(Empty, VertLine, array);
        System.out.println("PlayerX turn:");

        for (int i = 0; i < 5; i++) {
            PlayerXTurn(Empty, VertLine, array, scanner);
            if (winConditionRow(array) || winConditionColumn(array) || winConditionDiagonal(array)) {
                break;
            }
            else {
                if(isDraw(array)) {
                    break;
                }
            }
            System.out.println("PlayerO turn:");
            PlayerOTurn(Empty, VertLine, array, scanner);
            if (winConditionRow(array) || winConditionColumn(array) || winConditionDiagonal(array)) {
                break;
            }
            else {
                if(isDraw(array)) {
                    break;
                }
            }
            System.out.println("PlayerX turn:");
        }
        
        scanner.close();

    }

    // isDraw is if there is no winCondition
    public static boolean isDraw(String[] array) {
        // for every element in the array...
        for (int element = 0; element < array.length; element++) {
            // check if the elements are still an integer...
            try {
                // if there's still an integer, it won't trigger the break; otherwise it will trigger the break
                Integer.parseInt(array[element]);
                return false;
            }
            catch(Exception e) {
            }    
        }
        System.out.println("It's a draw");
        return true;
    }

    // winConditionDiagonal should check if the diagonals are all O or X
    public static boolean winConditionDiagonal(String[] array) {
        // for every even index in the array...
        for (int index = 0; index < 3; index+=2) {
            if(index == 0) {
                // check if array elements 0, 4, 8 are the same
                if(array[index] == array[index + 4] && array[index] == array[index + 8]) {
                    // check if the elements all hold X...
                    if(array[index] == "X") {
                        System.out.println("Winner is PlayerX");
                        return true;
                    }
                    // or O
                    else {
                        System.out.println("Winner is PlayerO");
                        return true;
                    }
                }
            }
            else {
                // or check if array elements 2, 4, 6, are the same
                if(array[index] == array[index + 2] && array[index] == array[index + 4]) {
                    // check if the elements all hold X...
                    if(array[index] == "X") {
                        System.out.println("Winner is PlayerX");
                        return true;
                    }
                    // or O
                    else {
                        System.out.println("Winner is PlayerO");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // winConditionColumn should check if any column all O or X
    public static boolean winConditionColumn(String[] array) {
        // for each column...
        for (int inAColumn = 0; inAColumn < 3; inAColumn++) {
            // check if the elements in the column is the same
            if(array[inAColumn] == array[inAColumn + 3] && array[inAColumn] == array[inAColumn + 6]) {
                // check if the elements all hold X...
                if(array[inAColumn] == "X") {
                    System.out.println("Winner is PlayerX");
                    return true;
                }
                // or O
                else {
                    System.out.println("Winner is PlayerO");
                    return true;
                }
            }
        }
        return false;
    }


    // winConditionRow should check if any row has all O or X
    public static boolean winConditionRow(String[] array) {
        // for every last element in a row...
        for (int lastInRow = 2; lastInRow < array.length; lastInRow+=3) {
            // if the element is the last in the row, check if the others in the row are the same...
            if(array[lastInRow] == array[lastInRow-1] && array[lastInRow] == array[lastInRow-2]) {
                // then check if the elements all hold X...
                if(array[lastInRow] == "X") {
                    System.out.println("Winner is PlayerX");
                    return true; // this line should instead return true so it triggers a break in main
                } 
                // or O
                else {
                    System.out.println("Winner is PlayerO");
                    return true; // this line should instead return true so it triggers a break in main
                }
            }
        }
        return false; // this line should return false because you went through the whole loop and did not find a winning row
    }

    // function for playerX
    public static void PlayerXTurn(String Empty, String VertLine, String[] array, Scanner scanner) {
        String inputX = scanner.nextLine();
        // check if the input was an integer
        try {
            Integer.valueOf(inputX);
            int playerX = Integer.valueOf(inputX);
            // check if input corresponded with an unticked space
            try {
                Integer.valueOf(array[playerX - 1]);  
                array[playerX - 1] = "X";
                makeBoard(Empty, VertLine, array);
            }
            // occurs if input corresponded with a ticked space or if the integer is too big
            catch(Exception e) {
                System.out.println("Space is already filled or you input an integer larger than 9. Try again");
                makeBoard(Empty, VertLine, array);
                System.out.println("PlayerX turn:");
                PlayerXTurn(Empty, VertLine, array, scanner);
            }
        }
        // occurs if the input was not an integer
        catch(Exception e) {
            System.out.println("You didn't put a number from 1-9 did you?");
            makeBoard(Empty, VertLine, array);
            System.out.println("PlayerX turn:");
            PlayerXTurn(Empty, VertLine, array, scanner);
        }
    }

    //function for playerO
    public static void PlayerOTurn(String Empty, String VertLine, String[] array, Scanner scanner) {
        String inputO = scanner.nextLine();
        // check if input was an integer
        try {
            Integer.valueOf(inputO);
            int playerO = Integer.valueOf(inputO);
            // check if input corresponded with an unticked space
            try {
                Integer.valueOf(array[playerO - 1]);  
                array[playerO - 1] = "O";
                makeBoard(Empty, VertLine, array);
            }
            // occurs if input corresponded with ticked space or if the integer is too big
            catch(Exception e) {
                System.out.println("Space is already filled or you input an integer larger than 9. Try again");
                makeBoard(Empty, VertLine, array);
                System.out.println("PlayerO turn:");
                PlayerOTurn(Empty, VertLine, array, scanner);
            }
        }
        // occurs if the input was not an integer
        catch(Exception e) {
            System.out.println("You didn't put a number from 1-9 did you?");
            makeBoard(Empty, VertLine, array);
            System.out.println("PlayerO turn:");
            PlayerOTurn(Empty, VertLine, array, scanner);
        }
        
    }

    // make the base tictactoe board
    public static void makeBoard(String Empty, String VertLine, String[] array) {
        int i = 0;
        // for every row in the board, start with an empty string
        for (int row = 0; row < 3; row++) {
            String Line = "";
            // for every column...
            for (int col = 0; col < 3; col++) {
                // if this is the last element of the column, don't add a vertical line 
                if(col == 2) {
                    Line += Empty.replace("placeholder", array[i]);
                    i += 1;
                }
                // if it isn't the last element of the column, add a vertical line
                else {
                    Line += Empty.replace("placeholder", array[i]) + VertLine;
                    i += 1;
                }
            }
            // print the row
            System.out.println(Line);
            // if it's not the last row, add a horizontal line
            if(row != 2) {
                System.out.println("-----------");
            }
        }
    }
}
