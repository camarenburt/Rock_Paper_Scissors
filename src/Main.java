import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String player1;
        String player2;
        String yn;
        boolean done = false;
        boolean done1 = false;
        boolean done2 = false;

        do {
            done1 = false;
            done2 = false;
            do {
                System.out.println("Player 1 Choose rock paper or scissors? [R,P,S]");
                player1 = scan.nextLine();
                if (player1.equalsIgnoreCase("R")) {
                    done1 = true;
                    do {
                        System.out.println("Player 2 Choose rock paper or scissors? [R,P,S]");
                        player2 = scan.nextLine();
                        if (player2.equalsIgnoreCase("R")) {
                            done2 = true;
                            System.out.println("Rock ties Rock");
                        } else if (player2.equalsIgnoreCase("S")) {
                            done2 = true;
                            System.out.println("Rock breaks Scissors");
                        } else if (player2.equalsIgnoreCase("P")) {
                            done2 = true;
                            System.out.println("Paper covers Rock");
                        } else {
                            System.out.println("You entered an invalid input. Please try again.");
                        }
                    } while (!done2);
                } else if (player1.equalsIgnoreCase("S")) {
                    done1 = true;
                    do {
                        System.out.println("Player 2 Choose rock paper or scissors? [R,P,S]");
                        player2 = scan.nextLine();
                        if (player2.equalsIgnoreCase("R")) {
                            done2 = true;
                            System.out.println("Rock breaks Scissors");
                        } else if (player2.equalsIgnoreCase("S")) {
                            done2 = true;
                            System.out.println("Scissors ties Scissors");
                        } else if (player2.equalsIgnoreCase("P")) {
                            done2 = true;
                            System.out.println("Scissors cuts Paper");
                        } else {
                            System.out.println("You entered an invalid input. Please try again.");
                        }
                    } while (!done2);
                } else if (player1.equalsIgnoreCase("P")) {
                    done1 = true;
                    do {
                        System.out.println("Player 2 Choose rock paper or scissors? [R,P,S]");
                        player2 = scan.nextLine();
                        if (player2.equalsIgnoreCase("R")) {
                            done2 = true;
                            System.out.println("Paper covers Rock");
                        } else if (player2.equalsIgnoreCase("S")) {
                            done2 = true;
                            System.out.println("Scissors cuts Paper");
                        } else if (player2.equalsIgnoreCase("P")) {
                            done2 = true;
                            System.out.println("Paper ties Paper");
                        } else {
                            System.out.println("You entered an invalid input. Please try again.");
                        }
                    } while (!done2);
                } else {
                    System.out.println("You entered an invalid input. Please try again.");
                }
            } while (!done1);
            System.out.println("Would you like to play again? [Y/N]");
            yn = scan.nextLine();
            if (yn.equalsIgnoreCase("N")) {
                done = true;
            }
        }while (!done);
    }
}
