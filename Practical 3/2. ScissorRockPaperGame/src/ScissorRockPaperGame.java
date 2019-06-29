/* Write a program that plays the popular scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a
 * scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock,
 * and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the
 * user or the computer wins, loses, or draws. */

import java.util.Scanner;

class ScissorRockPaperGame {

    public static void main(String[] args) {

        // menu of the game
        System.out.println("\n*** Scissor-Rock-Paper Game ***\n");
        System.out.println("1 - Start Game");
        System.out.println("2 - Exit\n");

        Scanner input1 = new Scanner(System.in);

        System.out.println("Choose a option from the menu: ");

        int option = input1.nextInt();

        // it will count the score of the game.
        int scoreComp = 0;
        int scoreUser = 0;

        // this block will be execute while the option choose is not 2 (exit).
        do {

            switch (option) {

                case 1:

                    Scanner input2 = new Scanner(System.in);

                    // user have to choose between 0, 1 or 2.
                    System.out.println("\n*** Options ***\n");
                    System.out.println("0 - Scissor");
                    System.out.println("1 - Rock");
                    System.out.println("2 - Paper");
                    System.out.println("3 - Exit");

                    // variable to store the user input.
                    int numberChosen = input2.nextInt();

                    // computer choose a number between from 0 to 2 randomly.
                    int numberComp = (int) (Math.random() * 3);

                    switch (numberChosen) {

                        // the first possibility for the user with the 3 options of combination.
                        case 0:

                            if (numberComp == 0) {
                                System.out.println("The computer is scissor. You are scissor too. It is a draw!");

                            } else if (numberComp == 1) {
                                System.out.println("The computer is rock. You are scissor. You lost!");
                                scoreComp++;

                            } else {
                                System.out.println("The computer is paper. You are scissor. You won!");
                                scoreUser++;
                            }

                            break;

                        // the second possibility for the user with the 3 options of combination.
                        case 1:

                            if (numberComp == 0) {
                                System.out.println("The computer is scissor. You are rock. You won!");
                                scoreUser++;

                            } else if (numberComp == 1) {
                                System.out.println("The computer is rock. You are rock too. It is a draw!");

                            } else {
                                System.out.println("The computer is paper. You are rock. You lost!");
                                scoreComp++;
                            }

                            break;

                        // the last possibility for the user with the 3 options of combination.
                        case 2:

                            if (numberComp == 0) {
                                System.out.println("The computer is scissor. You are paper. You lost");
                                scoreComp++;

                            } else if (numberComp == 1) {
                                System.out.println("The computer is rock. You are paper. You won");
                                scoreUser++;

                            } else {
                                System.out.print("The computer is paper. You are paper. It is a draw!");
                            }

                            break;

                        case 3:
                            // it will show the score of the game, when the user select the exit, number 3.
                            System.out.println("** Final Score **\n");

                            System.out.println("User " + scoreUser + "  |  Computer " + scoreComp + "\n");

                            if (scoreUser > scoreComp) {

                                System.out.println("Congratulations you won!!\n");

                            } else if (scoreUser == scoreComp) {
                                System.out.println("It is a draw!!! Try again!!!\n");

                            } else {
                                System.out.println("Try again!!!\n");
                            }

                            System.out.print("Bye bye, see you soon!!");
                            System.exit(3); // exit the game.

                        default:
                            System.out.println("\n*** Write a valid option ***");
                    }

                    break;

                // exit of the game
                case 2:
                    System.out.print("Bye bye, see you soon!!");
                    System.exit(2);

            }
        }

        // the game will run up to the user choose an exit option.
        while (option != 2);

    }
}





