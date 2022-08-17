package lesson5.factory;
/* 11. What is the difference between package-private access and protected access? ===

 */

import lesson5.A;

public class B extends A {
    int a;

    public static void main(String[] args) {
        B obj = new B();
        obj.a = obj.b;
        System.out.printf("a equal b: %d = %d ", obj.a, obj.b);
    }
}

/*
package-private access only in package, protected access in package and in child classes ( subclasses)
        even if the parent and child class in another packages*/
