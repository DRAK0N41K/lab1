package lab1.task6;

public class Main {
    public static void main(String[] args) {
        final int[][] A = {
                {1, 2, 3, 4},
                {4, 3, 2, -1}
        };
        final int[][] B = {
                {9, 3, 8},
                {6, 8, 5},
                {4, 6, 0,},
                {4, 9, 1}
        };

        System.out.println("Matrix A is : ");
        print(A);
        System.out.println("Matrix B is: ");
        print(B);
        final int[][] C = multiplication(A, B);
        System.out.println("Matrix AxB is : ");
        print(C);
    }

    public static int[][] multiplication(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%8d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
