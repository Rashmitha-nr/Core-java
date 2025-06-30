import java.util.Scanner;

public class arrrayreversingaarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("reverse of an array");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println( a[i]);

        }
    }
}

