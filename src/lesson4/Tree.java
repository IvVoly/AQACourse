package lesson4;
/*
5. Create a simple class with a bunch of constructors.
All these constructors should take different number of parameters.
Demonstrate in your class, how we can call one constructor from another.
 */

public class Tree {
    int age;
    double height;
    String country;

    Tree(){
        age = 0;
        height = 0.0;
        country = "unknown";
    }
    Tree(int age){
        this.age = age;
    }
    Tree( int x, double y){
        this(x);
        this.height = y;
    }
    Tree( int x, double y, String country){
        this(x, y);
        this.country = country;
    }

    public void getInfo(){
        System.out.printf("age tree: %d; height tree: %f; country: %s", age,height,country);
    }

    public static void main(String[] args) {
        Tree tree = new Tree(3,4,"Ukraine");
        tree.getInfo();
    }
}
