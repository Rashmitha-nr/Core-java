import java.util.Scanner;
class addition1{
    public void add(float a,float b){
        System.out.println(a+b);
    }
    public void add(float a,float b,float c){

        System.out.println(a+b+c);
    }
}
public class polymorphismexample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        addition1 obj=new addition1();
        obj.add(a,b);
        obj.add(a,b,c);

    }
}
