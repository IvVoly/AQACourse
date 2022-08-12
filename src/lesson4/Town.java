package lesson4;

/*
7.Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks.

 */
public class Town {
    int houses;
    int region;

    {
        houses = 500;     //initialization block
        region = 1;
    }
    public Town(){
        System.out.printf("First town, region %d , houses: %d", region, houses);
    }
}
