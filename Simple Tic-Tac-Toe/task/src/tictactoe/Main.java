package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner Scanner = new Scanner(System.in);
        char[][] array = new char[3][3];
        String input = Scanner.nextLine();
        int X = 0, O = 0, empty = 0;
        /*
        int counter = 0;
        for(int i=0; i < input.length(); i++){
            if(input.length() <= 9 && input.charAt(i) == 'X'|| input.charAt(i) == 'O'||input.charAt(i) =='_') {
                counter+;
            }
        }

        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        for (int i = 0; i < input.length(); i++) {
            array[i] = input.charAt(i);
            if (array[i] == 'X') {
                X++;
            }
            else if (array[i] == 'O'){
                O++;
            }
            else {
                empty++;
            }
        }
        boolean xWin = array[0] == 'X' && array[1] == 'X' && array[2] == 'X'||
                array[3] == 'X' && array[4] == 'X' && array[5] == 'X'||
                array[6] == 'X' && array[7] == 'X' && array[8] == 'X'||
                array[0] == 'X' && array[3] == 'X' && array[6] == 'X'||
                array[1] == 'X' && array[4] == 'X' && array[7] == 'X'||
                array[2] == 'X' && array[5] == 'X' && array[8] == 'X'||
                array[0] == 'X' && array[4] == 'X' && array[8] == 'X'||
                array[2] == 'X' && array[4] == 'X' && array[6] == 'X';

        boolean oWin = array[0] == 'O' && array[1] == 'O' && array[2] == 'O'||
                array[3] == 'O' && array[4] == 'O' && array[5] == 'O'||
                array[6] == 'O' && array[7] == 'O' && array[8] == 'O'||
                array[0] == 'O' && array[3] == 'O' && array[6] == 'O'||
                array[1] == 'O' && array[4] == 'O' && array[7] == 'O'||
                array[2] == 'O' && array[5] == 'O' && array[8] == 'O'||
                array[0] == 'O' && array[4] == 'O' && array[8] == 'O'||
                array[2] == 'O' && array[4] == 'O' && array[6] == 'O';

        if (Math.abs(X - O) > 1 || xWin && oWin) {
            System.out.println("Impossible");
        }
        else if (xWin) {
            System.out.println("X wins");
        }
        else if (oWin) {
            System.out.println("O wins");
        }
        else if (empty > 0) {
            System.out.println("Game not finished");
        }
        else {
            System.out.println("Draw");
        }
        */
        int counter = 0;
        int xCoordinatee = 0, yCoordinatee = 0;
        boolean error = true;

        /*System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                array[i][j] = input.charAt((i*3) + j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
         */
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                array[i][j] = ' ';
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        while (error) {
            try {
                int emptyChar = 0;
                int firstCordinates = Scanner.nextInt();
                int secondCordinates = Scanner.nextInt();

                xCoordinatee = firstCordinates - 1;
                yCoordinatee = secondCordinates - 1;
                //System.out.println("This cell is occupied! Choose another one!");
                System.out.println(xCoordinatee);
                System.out.println(yCoordinatee);


                if (array[xCoordinatee][yCoordinatee] == 'X' || array[xCoordinatee][yCoordinatee] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    System.out.println("---------");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("|");
                    }
                    System.out.println("---------");

                } else if (array[xCoordinatee][yCoordinatee] == ' ') {
                    if (counter % 2 == 0) {
                        array[xCoordinatee][yCoordinatee] = 'X';
                    } else {
                        array[xCoordinatee][yCoordinatee] = 'O';
                    }

                    System.out.println("---------");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println("|");
                    }
                    System.out.println("---------");
                    counter++;

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (array[i][j] == ' ') {
                                emptyChar++;
                            }
                        }
                    }
                    boolean xWin = (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X')||
                            (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X')||
                            (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X')||
                            (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X')||
                            (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X')||
                            (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X')||
                            (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X')||
                            (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X');

                    boolean oWin = (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O')||
                            (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O')||
                            (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O')||
                            (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O')||
                            (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O')||
                            (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O')||
                            (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O')||
                            (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O');
                    System.out.println(xWin);
                    System.out.println(oWin);
                    System.out.println(Arrays.deepToString(array));

                    if (xWin) {
                        System.out.println("X wins");
                        error = false;

                    } else if (oWin) {
                        System.out.println("O wins");
                        error = false;

                    } else if (!xWin && !oWin && emptyChar == 0) {
                        System.out.println("Draw");
                        error = false;
                    }
                }
            }
            catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }
}
