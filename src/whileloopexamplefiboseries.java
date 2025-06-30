import java.util.Scanner;

public class whileloopexamplefiboseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println(first+" "+second);
        int sum=first+second;
        System.out.println(sum);
        while(sum<=num){
            System.out.println(sum);
            first=second;
            second=sum;
            sum=first+second;

        }
    }
}
