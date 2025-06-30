class Edetails{
    private class Edetailsinformation{
        void employee(String name,int id){
            System.out.println("Name:"+name+" "+"Id:"+id);

        }
        void department(String dname,int id) {
            System.out.println("Name:" + dname + " " + "Id:" + id);
        }

    }
    void Edetails(){
        Edetailsinformation obj=new Edetailsinformation();
        obj.employee("Rashmi",8);
        obj.department("cse",10);

    }
}
public class staticnestedclassesexample {
    public static void main(String[] args) {
        Edetails obj1=new Edetails();
        obj1.Edetails();

    }
}
