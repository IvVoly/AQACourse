package lesson6;

/*
3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally,
create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering,
changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
*/

public class Truck extends Car {
    private static final int MAX_SPEED = 150;

    public Truck(String name, String size) {
        super(name, size);
    }

    @Override
    public void increaseSpeed(int speed) {
        changeGearUp();
        int velocity = 0;
        while (velocity < speed && velocity < MAX_SPEED) {
            velocity+=5;
            switch (velocity){
                case(20):
                case(40):
                case(60):
                case(80):
                case(100):
                case(120):
                    changeGearUp();
                    break;
            }
        }
        setCurrentVelocity(velocity);
    }

    @Override
    public void decreaseSpeed(int speed) {
        int velocity = getCurrentVelocity();
        while (velocity != speed){
            switch (velocity){
                case(20):
                case(40):
                case(60):
                case(80):
                case(100):
                case(120):
                    changeGearDown();
                    break;
            }
            velocity-=5;
        }
        if(velocity == 0 ){
            changeGearDown();
            System.out.println("Truck stopped");
        }
        setCurrentVelocity(velocity);
    }
}
