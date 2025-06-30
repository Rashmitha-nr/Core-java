import java.util.Scanner;

class Addition1{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class polymorphismexample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Addition1 obj=new Addition1();
        obj.add(a,b);
        obj.add(a,b,c);

    }
}
