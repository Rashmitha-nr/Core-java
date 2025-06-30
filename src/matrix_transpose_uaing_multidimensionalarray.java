import java.util.Scanner;

public class matrix_transpose_uaing_multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int transpose[][] = new int[col][row];
        System.out.println("Enter the matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {

                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }
        System.out.println("transpose of matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
