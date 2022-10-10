import java.util.Random;

public class Tets {
    public static void main(String[] args) {
        int randomMatrix[][] = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                randomMatrix[i][j] = rand.nextInt(10);
        System.out.println("Your matrix: \n");
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
                System.out.print(randomMatrix[i][j] + "  ");
            System.out.println();
        }
    }
}
