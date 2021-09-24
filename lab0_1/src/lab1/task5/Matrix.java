package lab1.task5;

import java.util.Scanner;

public class Matrix {
    int r, c, i, j;
    int[][] array;

    public void read() {
        Scanner scanner = new Scanner(System.in);

        int i, j;
        System.out.println("Enter the number of rows:");
        r = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        c = scanner.nextInt();
        array = new int[r][c];
        System.out.println("Enter the elements of matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }


    public void display() {
        System.out.println("Matrix: ");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void transposition() {
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(array[j][i] + " ");

            }
            System.out.print("\n");


        }
    }
}