package lesson4;
/*6. Create a simple class with any 3 fields.
        Demonstrate in your class how we can use "this" keyword to refer to the object,
        from which a constructor or a method was invoked.
 */

public class House {
    int qRoom = 5;
    int region;
    String material;
    String color = "RAL3012";

    public void showInfo(House unit){
        System.out.printf("quantity rooms: %d;\ncolor: %s",unit.qRoom,unit.color);
    }
    public void getHouse(){
        showInfo(this);
    }

    public static void main(String[] args) {
        House house = new House();
        house.getHouse();
    }
}
