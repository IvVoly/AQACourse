package lesson6;

/*1) Write a simple java program to demonstrate composition of classes.
        Tips:
        a) Create several classes A, B, C;
        b) Add functionality of classes B and C to the class A without using inheritance.
        c) Create a test class and demonstrate how we can use
        functionality of classes B and C via created object of the class A;*/

public class TestTask1 {
    public static void main(String[] args) {
        B b = new B(4, 3);
        C c = new C(3, 4);
        A a = new A(b, c, 7);
        System.out.println(a.multAndDiv());
        System.out.println(a.sumOfthree());
    }
}
