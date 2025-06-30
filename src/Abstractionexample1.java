import java.util.Scanner;

abstract class CDetails {
    abstract void employee(String name, int id, double salary); //abstract method

    abstract void department(String dname, int did); //abstract method

    void add(int a, int b) {    // method

    }
}
class detail extends CDetails {
        @Override
        void employee(String name, int id, double salary) {
            System.out.println("Name:" + name + " " + "Id:" + id + " " + "salary:" + salary);

        }

        @Override
        void department(String dname, int did) {
            System.out.println("Name:" + dname + " " + "Id:" + did);


        }

        void add(int a, int b) {
            System.out.println("addition:" + (a + b));
        }
    }

    public class Abstractionexample1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your name");
            String name = sc.nextLine();
            System.out.println("Enter your department name ");
            String dname = sc.nextLine();
            System.out.println("Enter your id");
            int id = sc.nextInt();
            System.out.println("enter your salary");
            double salary = sc.nextDouble();
            detail obj = new detail();
            obj.employee(name, id, salary);
            System.out.println("Enter department id");
            int did = sc.nextInt();

            obj.department(dname, did);
            obj.add(5, 6);


        }
    }


