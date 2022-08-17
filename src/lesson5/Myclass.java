package lesson5;

/*
15. Create a class with two different methods and two fields. One of methods should be static, another - non-static.
        The same thing should be done with class fields(first - static, second - non-static).
        These two methods should change the corresponding fields of the class when called.
        Create another class with main method to test your code.*/

public class Myclass {
    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = value;
    }
    void anotherChange(int value) {
        this.dynamicField=value;
    }
}

