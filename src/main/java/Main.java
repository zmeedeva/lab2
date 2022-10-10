import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Input size of the matrix: ");
        int x = in.nextInt();
        if (x > 21 && x == 21)
            System.out.println("Invalid size. Try number less 21");
        else {
            System.out.print("Choose the method of filling the matrix: \n1 - random \n2 - manual\n");
            int choice = in.nextInt();
            if (choice == 1)
            {
                int randomMatrix[][] = new int[x][x];
                Random rand = new Random();
                for (int i = 0; i < x; i++)
                    for (int j = 0; j < x; j++)
                        randomMatrix[i][j] = rand.nextInt(10);
                System.out.println("Your matrix: \n");
                for (int i = 0; i < x; i++)
                {
                    for (int j = 0; j < x; j++)
                        System.out.print(randomMatrix[i][j] + "  ");
                    System.out.println();
                }
            }
            if (choice == 1)
            {

            }
        }
        in.close();
    }
}