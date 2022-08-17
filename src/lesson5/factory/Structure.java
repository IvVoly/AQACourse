package lesson5.factory;

/*
7. Answer the question: What is a package-private access? Create a simple program to demonstrate the
package-private access.
Tips:
 - Create two different packages
 - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
 - Create in one of the classes some package-private members(fields or methods).
 - In another two classes create objects of the class with package-private members and try to access its members.
 */

public class Structure {
    String name;
    public int region = 5;

    public void showRegion(){
        System.out.printf("region: %d", region);
    }

    public static void main(String[] args) {
        Work work = new Work();
        work.employees = 300;  // We can use package-private members from another class in this package
        work.showEmployees();
    }

}
