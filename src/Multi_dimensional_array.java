public class Multi_dimensional_array {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {         //row
            for (int j = 0; j < array.length; j++) {       //column

                System.out.print(+array[i][j] + " "); //used print to print in same line
            }
            System.out.println();
        }

    }
}
