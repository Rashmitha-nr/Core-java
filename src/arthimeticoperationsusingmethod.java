import java.util.Scanner;

class operators {
    public void Add(int a, int b) {
        System.out.println("Addition is: " + (a+b));
    }

    public void Sub(int a, int b) {
        System.out.println("Subtration is: " + (a-b));
    }

    public void MUL(int a, int b) {
        System.out.println("Multiplication  is: " + (a*b));
    }

    public void div(int a, int b) {
        if(b!=0) {
            System.out.println(a/b);
        }
            else{
                System.out.println("denominator should not be 0");
            }
            System.out.println("division is: " + (a/b));

    }

    public void mod(int a, int b) {
        System.out.println("mod is: " + (a%b));
    }
}

public class arthimeticoperationsusingmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        operators obj=new operators();
        obj.Add(a,b);
        obj.Sub(a,b);
        obj.MUL(a,b);
        obj.div(a,b);
        obj.mod(a,b);

    }
}
