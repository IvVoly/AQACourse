package lesson4;

/*
7.Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks.

 */
public class Town {
    int houses;
    int region;

    static String country;

    static int year;

    static {
        country = "USA";     // static initialization block
        year = 2022;
    }

    {
        houses = 500;     //initialization block
        region = 1;
    }
    public Town(){
        System.out.printf("First town, region %d , houses: %d", region, houses);
    }
}
