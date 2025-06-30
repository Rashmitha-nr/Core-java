class outer5{
    private String name="rashmi";
    private int age=22;
    class inner{
        void details(){
            System.out.println("Name:"+name+" "+"Age:"+age);
        }
    }

}
public class nonstaticnestedclass {
    public static void main(String[] args) {
        outer5 obj=new outer5();
        outer5.inner obj1=obj.new inner();
        obj1.details();


    }
}
