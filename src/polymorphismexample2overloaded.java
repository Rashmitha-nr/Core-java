import java.util.Scanner;

class StudentDetilas{
    void Student(String name,String branch){
        System.out.println("Name:"+name+" "+"Branch:"+branch);
    }
    void Student(String name,String branch,String address){
        System.out.println("Name:"+name+" "+"Branch:"+branch+" "+"Address: "+ address);
    }
}
public class polymorphismexample2overloaded {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);                   //overloaded same class same method name but different parameters
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your branch");
        String branch=sc.nextLine();
        StudentDetilas obj=new StudentDetilas();
        obj.Student(name,branch);
        System.out.println("Enter your name");
        String name1=sc.nextLine();
        System.out.println("Enter your branch");
        String branch2=sc.nextLine();
        System.out.println("Enter your address");
        String address=sc.nextLine();
        StudentDetilas obj1=new StudentDetilas();
        obj1.Student(name1,branch2,address);



    }
}
