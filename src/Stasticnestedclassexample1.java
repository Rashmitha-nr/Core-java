class arithmeticoperation1 {
    static class operation {
        void add(int a, int b) {
            System.out.println("addition:"+(a+b));
        }
        void sub(int a, int b) {
            System.out.println("substraction:"+(a-b));
        }
        void mul(int a, int b) {
            System.out.println("multiplication:"+(a*b));
        }
        void div(int a, int b) {
            System.out.println("division:"+(a/b));
        }
        void mod(int a, int b) {
            System.out.println("modulus:"+(a%b));
        }
    }
}
public class Stasticnestedclassexample1 {
    public static void main(String[] args) {
        arithmeticoperation1.operation obj=new arithmeticoperation1.operation();
        obj.add(4,5);
        obj.sub(5,6);
        obj.mul(4,5);
        obj.div(5,5);
        obj.mod(9,3);

    }
}
