import java.util.Scanner;

public class userinputforarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array elements");
        int n = sc.nextInt();
        int a[] = new int[n]; //empty array is created
        System.out.println("enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array elements are");
        for (int i = 0; i < a.length; i++) { //to print all the array elememts together
            System.out.println(a[i]);
        }

    }
}


