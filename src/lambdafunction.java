interface B4{
    void demo(int a);

}
public class lambdafunction {
    public static void main(String[] args) {
        B4 obj=(a)-> System.out.println("hello"+a); //->lambda function
        obj.demo(5);


    }
}
