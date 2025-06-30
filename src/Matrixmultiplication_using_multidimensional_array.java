import java.util.Scanner;

public class Matrixmultiplication_using_multidimensional_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number of row and column of matrix1");
        int row1 = sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter the number of row and column of matrix2");
        int row2=sc.nextInt();
        int col2 = sc.nextInt();
        System.out.println("Enter the matrix1");
        int r1[][] = new int[row1][col1];
        int c1[][] = new int[row2][col2];
        int matrix[][] = new int[col1][row2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                r1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the matrix2");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j <col2; j++) {
                 c1[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < c1.length; j++) {
                for (int k = 0; k < col1; k++) {
                    matrix[i][j] += r1[i][k] * c1[k][j] ;
                }
            }
        }
        System.out.println("matrix multiplication");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < row1; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }


                    System.out.println();


                }
            }
        }




