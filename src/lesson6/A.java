package lesson6;

//1)

public class A {
    private B b;
    private C c;
    private int a;

    public A(B b, C c, int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }

    public A(int a) {
        this.a = a;
    }

    public A(){

    }

    public void setB(B b) {
        this.b = b;
    }

    public void setC(C c) {
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int sumOfthree(){
        return c.sum() + a;
    }

    public double multAndDiv(){
        return b.multiply() / a;
    }
}
