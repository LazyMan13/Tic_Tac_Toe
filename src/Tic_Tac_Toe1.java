/********************************************************************************
 * This program will demonstrate how to use keyboard input of Student first and
 * last name, compute the total of grades using a FOR LOOP,compute the average,
 * and display the results. This program will save the data into an array called
 * "Student_Info".
 * Author: Mike Hostetler
 * Assignment: Student Example 7
 * Date: 1-4-2009
 ********************************************************************************/

import java.util.*;

public class Tic_Tac_Toe1
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String[][]  ttt = new String[5][5];
        String list = "", letter= "",winner = "";
        int row, col, count = 1, a, number;

        ttt[0][1]= "|"; ttt[0][3]= "|";
        ttt[2][1]= "|"; ttt[2][3]= "|";
        ttt[4][1]= "|"; ttt[4][3]= "|";
        ttt[1][0]= "-"; ttt[1][1]= "+"; ttt [1][2]= "-";
        ttt[1][3]= "+"; ttt[1][4]= "-";
        ttt[3][0]= "-"; ttt[3][1]= "+"; ttt [3][2]= "-";
        ttt[3][3]= "+"; ttt[3][4]= "-";

        ttt[0][0]= "1"; ttt [0][2]= "2"; ttt [0][4]= "3";
        ttt[2][0]= "4"; ttt [2][2]= "5"; ttt [2][4]= "6";
        ttt[4][0]= "7"; ttt [4][2]= "8"; ttt [4][4]= "9";

        do
        {
            list ="";
            for (row = 0; row < 5; row++)
            {
                for (col = 0; col < 5; col++)
                {
                    list = list + ttt[row][col];
                }
                list = list + "\n";
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("count = " + count);
            System.out.println(list);

            a = count % 2;
            if (a == 0)
            {
                letter = "X";
            }

            if (a == 1)
            {
                letter = "O";
            }
            System.out.println("Please choose a number (1-9) to place your " + letter);
            number = keyboard.nextInt();

            switch (number)
            {
                case 1:
                    ttt [0][0] = letter;
                    break;

                case 2:
                    ttt [0][2] = letter;
                    break;

                case 3:
                    ttt [0][4] = letter;
                    break;

                case 4:
                    ttt [2][0] = letter;
                    break;

                case 5:
                    ttt [2][2] = letter;
                    break;

                case 6:
                    ttt [2][4] = letter;
                    break;

                case 7:
                    ttt [4][0] = letter;
                    break;

                case 8:
                    ttt [4][2] = letter;
                    break;

                case 9:
                    ttt [4][4] = letter;
                    break;

                default:
                    System.out.println("You did not enter a number between 1 and 9!");
                    break;
            }

            if (count >=5)
            {
                //Horizontal
                if ((ttt[0][0]).equals(ttt[0][2]) && (ttt[0][0]).equals(ttt[0][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                else if ((ttt[2][0]).equals(ttt[2][2]) && (ttt[2][0]).equals(ttt[2][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                else if ((ttt[4][0]).equals(ttt[4][2]) && (ttt[4][0]).equals(ttt[4][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                //Vertical
                else if ((ttt[0][0]).equals(ttt[2][0]) && (ttt[0][0]).equals(ttt[4][0]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                else if ((ttt[0][2]).equals(ttt[2][2]) && (ttt[0][2]).equals(ttt[4][2]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                else if ((ttt[0][4]).equals(ttt[2][4]) && (ttt[0][4]).equals(ttt[4][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }

                //Diagnal
                else if ((ttt[0][0]).equals(ttt[2][2]) && (ttt[0][0]).equals(ttt[4][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }
                else if ((ttt[4][0]).equals(ttt[2][2]) && (ttt[4][0]).equals(ttt[0][4]))
                {
                    winner = letter + (" is the winner!");
                    count = 10;
                }
                else
                {
                    System.out.println("We have no winner yet!");
                }
            }

            count++;
        }while (count <= 9);

        list ="";
        for (row = 0; row < 5; row++)
        {
            for (col = 0; col < 5; col++)
            {
                list = list + ttt[row][col];
            }
            list = list + "\n";
        }
        System.out.println();

        System.out.println(list);
        System.out.println (winner);
        keyboard.close();
    }
}// End of class program