import java.util.Scanner;

public class mydetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name=sc.next();
        System.out.println("Name:" + name);
        System.out.println("Enter Your RNo: ");
        String RNo=sc.next();
        System.out.println("RNO:" + RNo);
        System.out.println("Enter Your Branch: ");
        String branch=sc.next();
        System.out.println("Branch:" + branch);
        System.out.println("Enter Your Age: ");
        int Age=sc.nextInt();
        System.out.println("AGE:" + Age);
        System.out.println("Enter Your Cgpa: ");
        float cgpa=sc.nextFloat();
        System.out.println("CGPA:" + cgpa);

    }
}
