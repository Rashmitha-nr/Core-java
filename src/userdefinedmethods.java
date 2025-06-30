class Add{
    public void sum(int a, int b){
        System.out.println(a+b); // without return
    }
    public int sub(int a ,int b){
        return a-b;                    //with returnse4
    }
}
public class userdefinedmethods {
    public static void main(String[] args) {
        Add obj=new Add();
        obj.sum(5,5);
        obj.sub(4,7);


    }
}
