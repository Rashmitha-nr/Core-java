import java.util.Scanner;

public class singlearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];  //syntax to create an empty array
        System.out.println("enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
            System.out.println("maximum:"+max);

        }
    }

