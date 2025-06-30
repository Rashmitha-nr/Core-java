import java.util.Scanner;

class details{
    public void person (String name,int age){                   //without return
        System.out.println(name+" "+age);
    }
    public void dog(String name,String color){
        System.out.println(name+" "+color);
    }
}

public class userdefinedexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   //person method we have taken user input
        String name=sc.nextLine();            // dog method we have called it main method we can do either this as per our requirement
        int age=sc.nextInt();
        details obj=new details();
        obj.person(name,age);
        obj.dog("simba","white");

    }
}
