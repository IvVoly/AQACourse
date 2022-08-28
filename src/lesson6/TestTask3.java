package lesson6;
/*
3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally,
create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering,
changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
*/

public class TestTask3 {
    public static void main(String[] args) {
        Car car = new Car("WvW", "4500");
        car.move(110,35);
        car.showGear();
        car.decreaseSpeed(70);
        car.showCurrentVelocity();
        car.showGear();
        Truck truck = new Truck("DAF","19500");
        truck.move(100,87);
        truck.showGear();
        truck.decreaseSpeed(40);
        truck.showCurrentVelocity();
        truck.showGear();
    }
}
