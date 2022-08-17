package lesson5;

/*
9. Answer the question: What is a private access? Create a simple program to demonstrate the private access.
Tips:
 - Create two classes
 - In on of them create private members
 - In the second class create an object of the first class
 - Try to access the private members
 */

public class Device {
    private int number;

    Device(int x){
        this.number = x;
    }

    Device(){
        number = 1;
    }

    void setNumber(int a){
        this.number = a;
    }

    int getNumber(){
        return number;
    }

}



