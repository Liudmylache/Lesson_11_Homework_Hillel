import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input matrix dimensions below:");
        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] matrix = new int[M][N];

        System.out.println("Input matrix numbers below:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
               matrix [i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }

        printMatrix(matrix);
        int[][] transpose = transpose(matrix);
        printNewMatrix(transpose);

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Original matrix");
        System.out.println("------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println();
        }
    }
    

    public static int[][] transpose(int[][] original) {
        int rows = original.length;
        int columns = original[0].length;

        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        return transposed;
    }
    public static void printNewMatrix(int[][] transpose) {
        System.out.println();
        System.out.println("New matrix");
        System.out.println("-------------");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }
    }
}