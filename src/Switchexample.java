import java.util.Scanner;

public class Switchexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        int   grade=marks/10;
        switch (grade){
            case 10:
                System.out.println("O");
                break;
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B+");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C+");
                break;
            case 4:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 2:
                System.out.println("F");
                break;
            default:
                System.out.println("Enter valid marks");
        }
    }
}
