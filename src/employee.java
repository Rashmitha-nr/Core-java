import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name=sc.next();
        System.out.println("Name:" + name);
        System.out.println("Enter Your Eid: ");
        int Eid=sc.nextInt();
        System.out.println("EID:" + Eid);
        System.out.println("Enter Your Company_Name: ");
        String Company_Name=sc.next();
        System.out.println("COMPANY_NAME:" + Company_Name);
        System.out.println("Enter Your department: ");
        String department=sc.next();
        System.out.println("Department:" + department);
        System.out.println("Enter Your Salary: ");
        double Salary=sc.nextDouble();
        System.out.println("Salary:" + Salary);


    }
}
