package basic.java.game.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class tikitata {
    public static int player;
    static int flag = 0; // temp var for wining the game true
    public static String[][] s = new String[11][11];

    // bordmaker q = new bordmaker();
    void check_A() {
        bordmaker q = new bordmaker();
        if (s[0][0] == s[1][0]) {
            if (s[1][0] == s[2][0]) {
                if (s[1][0] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();
                    System.exit(0);
                }
            }
        }
        if (s[0][0] == s[0][1]) {
            if (s[0][0] == s[0][2]) {
                if (s[0][0] == "X") {
                    System.out.print("Player A win the Game :)\n");

                    q.dispbrd();
                    System.exit(0);
                }
            }
        }

        if (s[1][0] == s[1][1]) {
            if (s[1][0] == s[1][2]) {
                if (s[1][0] == "X") {
                    System.out.print("Player A win the Game :)\n");

                    q.dispbrd();
                    System.exit(0);
                }
            }
        }
        if (s[2][0] == s[2][1]) {
            if (s[2][0] == s[2][2]) {
                if (s[2][0] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][1] == s[1][1]) {
            if (s[1][1] == s[2][1]) {
                if (s[0][1] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][2] == s[1][2]) {
            if (s[1][2] == s[2][2]) {
                if (s[0][2] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][0] == s[1][1]) {
            if (s[1][1] == s[2][2]) {
                if (s[1][1] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][2] == s[1][1]) {
            if (s[1][1] == s[2][0]) {
                if (s[1][1] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][0] == s[1][0]) {
            if (s[1][0] == s[2][0]) {
                if (s[1][0] == "X") {
                    System.out.print("Player A win the Game :)\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
    }

    void check_B() {
        int chb = 1;
        bordmaker q = new bordmaker();
        if (s[0][0] == s[0][1]) {
            if (s[0][0] == s[0][2]) {
                if (s[0][2] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[1][0] == s[1][1]) {
            if (s[1][0] == s[1][2]) {
                if (s[1][0] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[2][0] == s[2][1]) {
            if (s[2][0] == s[2][2]) {
                if (s[2][0] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][1] == s[1][1]) {
            if (s[1][1] == s[2][1]) {
                if (s[0][1] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][2] == s[1][2]) {
            if (s[1][2] == s[2][2]) {
                if (s[0][2] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][0] == s[1][1]) {
            if (s[1][1] == s[2][2]) {
                if (s[1][1] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][2] == s[1][1]) {
            if (s[1][1] == s[2][0]) {
                if (s[0][2] == "O") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();

                    System.exit(0);
                }
            }
        }
        if (s[0][0] == s[1][0]) {
            if (s[1][0] == s[2][0]) {
                if (s[1][0] == "X") {
                    System.out.print("Computer win the Game :(\n");
                    q.dispbrd();
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner e = new Scanner(System.in);
        tikitata t = new tikitata();
        Random r = new Random();
        int low = 0;
        int high = 3;
        AIPlayer ai = new AIPlayer();

        int a;
        int row, col; // entered row and column
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = " ";
            }
        }
        System.out.print("Welcome to AI Tic-Tac_toe in Console \n");

        bordmaker q = new bordmaker();
        int temp = 16;
        for (a = 1; a < 10; a++) {
            q.dispbrd();

            if (a % 2 != 0) {
                System.out.println("Enter the row and column for player A (X) ");
                player = 21;
                row = e.nextInt();
                col = e.nextInt();
                do {
                    if ((row < 0 && row > 3) && (col < 0 && col > 3)) {
                        System.out.println("Wrong Enter,Please enter row and col again");
                        row = e.nextInt();
                        col = e.nextInt();

                    }
                    if (s[row][col] != " ") {
                        System.out.println("Wrong Enter,Please enter row and col again");
                        row = e.nextInt();
                        col = e.nextInt();
                    }
                } while (s[row][col] != " ");
                System.out.println("\n");
                t.s[row][col] = "X";
                t.check_A();

            } else {
                player = 29;

                int[] result = ai.minimax(temp, player);
                // temp--;
                row = result[1];
                col = result[2];
                // System.out.println("BestScore"+result[0]);
                // System.out.println("Col is "+col);
                System.out.println("\n");
                t.s[row][col] = "O";
                t.check_B();

            }
        } // if for a%2!=0 closed
        System.out.println("Draw match");
    }

}
