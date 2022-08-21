package lesson5;

/*
5. Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
Create a third class with the main method.
In the main method create two different objects of your classes specifying the full name of the classes
(including packages).
 */

public class Car {
    public static void main(String[] args) {
        lesson5.factory.Model model1 = new lesson5.factory.Model();
        lesson5.general.Model model2 = new lesson5.general.Model();

    }
}
