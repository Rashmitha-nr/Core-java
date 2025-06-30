import java.util.Scanner;

interface details6{
    void person(String name,int age,String place);
}
public class lamdafunction1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String N=sc.nextLine();
        System.out.println("enter your place");
        String P=sc.nextLine();
        System.out.println("enter your age");
        int A=sc.nextInt();
        details6 obj=((name, age, place) -> System.out.println(name+" "+age+" "+place));
        obj.person(N,A,P);


    }
}
