package lesson5;

/*
15. Create a class with two different methods and two fields. One of methods should be static, another - non-static.
        The same thing should be done with class fields(first - static, second - non-static).
        These two methods should change the corresponding fields of the class when called.
        Create another class with main method to test your code.*/

public class TestMyclass {
    public static void main(String[] args) {
        Myclass first = new Myclass();
        first.anotherChange(3);
        System.out.println(first.dynamicField);
        Myclass.change(5);
        System.out.println(Myclass.staticField);
    }
}
