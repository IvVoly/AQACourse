package lesson5;
/*
9. Answer the question: What is a private access? Create a simple program to demonstrate the private access.
Tips:
 - Create two classes
 - In on of them create private members
 - In the second class create an object of the first class
 - Try to access the private members
 */

public class DeviceTest {
    public static void main(String[] args) {
        Device micro = new Device(2);
    //    micro.number = 5; error  private access  - is only in the class in which they are declared
    }
}
