class Student1{
    private String name="rashmi";
    private String branch="cse";
    private int rollno=8;
    private String address="bangalore";

    public void setName(String name1){
        name=name1;
    }
    public void setBranch(String branch1){
        branch=branch1;
    }

    public void setRollno(int rollno1) {
        rollno=rollno1;

    }
    public void setAddress(String address1){
        address=address1;
    }
    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public int getRollno(){
        return rollno;
    }

    public String getAddress(){
        return address;
    }

}
public class Encapsulationwriteonlymethodexample1 {
    public static void main(String[] args) {
        Student1 obj=new Student1();
        obj.setName("Nikhil");
        obj.setBranch("cse");
        obj.setRollno(7);
        obj.setAddress("bangalore");
        System.out.println("Name:"+obj.getName()+" "+"branch:"+obj.getBranch()+" "+"rollno:"+obj.getRollno()+" "+"Address:"+obj.getAddress());

    }
}
