import java.util.Scanner;

class Student {
    private int id;
    public String name;

    void displaydetails(int id,String name) {
        System.out.println(id+" "+name);


    }
}

    public class StudentdetailsusingAccessmodifier {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name ");
            String name = sc.nextLine();
            System.out.println("Enter your id");
            int id = sc.nextInt();
            Student obj = new Student();
            obj.displaydetails(id,name);


        }
    }

