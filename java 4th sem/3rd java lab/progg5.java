// 5. Find sum of each diagonal (left &amp; right) elements separately of a user entered 3 X 3
// matrixes in Java.

import java.util.Scanner;

public class progg5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
        int leftD = 0, rightD = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    leftD += matrix[i][j];
                if (i + j == 2)
                    rightD += matrix[i][j];
            }
        System.out.println("Sum of left diagonal elements = " + leftD);
        System.out.println("Sum of right diagonal elements = " + rightD);
    }
}






