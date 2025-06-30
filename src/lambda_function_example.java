import java.util.Scanner;

interface operation8{
    void add(int c,int d);
    //void sub(int e, int f);
    //void mul(int g,int h);
}
interface op8{
    void sub(int e, int f);

}
interface op9 {
    void mul(int g, int h);
}

    /**
     * class O5 implements operation8{
     *
     * @Override public void add(int a, int b) {
     * System.out.println(a+b);
     * }
     * @Override public void sub(int a, int b) {
     * System.out.println(a-b);
     * }
     * @Override public void mul(int a, int b) {
     * System.out.println(a*b);
     * }
     * }
     */
    public class lambda_function_example {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a value");
            int c8 = sc.nextInt();
            System.out.println("enter b value");
            int d8 = sc.nextInt();
            operation8 obj = (c, d) ->
                    System.out.println(c + d);

            op8 obj2 = (e, f) -> System.out.println(e - f);
            op9 obj3 = (g, h) -> System.out.println(g * h);


            /*** operation8 obj=new operation8() {
            @Override public void add(int a, int b) {
            System.out.println(a+b);

            }

            @Override public void sub(int a, int b) {
            System.out.println(a-b);

            }

            @Override public void mul(int a, int b) {
            System.out.println(a*b);

            }
            };*/
            obj.add(c8, d8);
            obj2.sub(c8, d8);
            obj3.mul(c8, d8);

        }
    }

