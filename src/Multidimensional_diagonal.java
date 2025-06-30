public class Multidimensional_diagonal {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {      //condition to print diagonal

            System.out.print(array[i][i]+ " "); //used print to print in same line
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - 1 - i]+" "); //print reverse diagonal ex: in the array 3 5 9


        }
        System.out.println();
    }
}



