package lesson5;

/*
10. Create a new class. Make it impossible to create a new object of this class using a constructor.
Provide an appropriate public method that will allow clients of your class create a new object.
 */

public class OnlyOne {
    String name;
    private OnlyOne(){
    }
    public static OnlyOne createObject(){
        return new OnlyOne();
    }
}
