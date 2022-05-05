import java.util.*;
import java.io.*;

/*
    (Fn  ) = (1 1)^n-1 (1)
    (Fn-1)   (1 0)     (1)
    n >= 2
*/

public class prog {
    public static void multiplyMatrix(int mat1[][], int mat2[][], int res[][], int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Matrix dimension improper for multiplication.");
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < r2; k++) {
                        sum += mat1[i][k] * mat2[k][j];
                    }
                    res[i][j] = sum;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res[][] = { { 0 },
                { 0 } };

        int one[][] = { { 1 },
                { 1 } };

        int mat[][] = { { 1, 1 },
                { 1, 0 } };

        for (int i = 0; i < 5; i++) {
            int tempmat[][] = { { 0, 0 },
                    { 0, 0 } };
            multiplyMatrix(mat, mat, tempmat, 2, 2, 2, 2);

            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    mat[j][k] = tempmat[j][k];
        }
        multiplyMatrix(mat, one, res, 2, 2, 2, 1);
        System.out.println("f(1025) = " + res[0][0]);

    }
}
