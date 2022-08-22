package lesson6;

/*
3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally,
create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering,
changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
*/

public class Car extends Vehicle {
    private int gear;

    private static final int MAX_SPEED = 180;

    public Car(String name, String size) {
        super(name, size);
    }

    protected void changeGearUp() {
        gear += 1;
    }

    protected void changeGearDown() {
            gear-=1;
    }

    public void increaseSpeed(int speed) {
        changeGearUp();
        int velocity = 0;
        while (velocity < speed && velocity < MAX_SPEED) {
            velocity+=10;
            switch (velocity){
                case(20):
                case(40):
                case(60):
                case(80):
                    changeGearUp();
                    break;
            }
        }
        setCurrentVelocity(velocity);
    }
    public void decreaseSpeed(int speed) {
        int velocity = getCurrentVelocity();
        while (velocity != speed){
            switch (velocity){
                case(20):
                case(40):
                case(60):
                case(80):
                    changeGearDown();
                    break;
            }
            velocity-=10;
        }
        if(velocity == 0 ){
            changeGearDown();
            System.out.println("Car stopped");
        }
        setCurrentVelocity(velocity);
    }

    @Override
    public void move(int speed, int direction){
        steer(direction);
        increaseSpeed(speed);
        System.out.println("Moving at " + getCurrentVelocity() + "km/h" +" in direction " + getCurrentDirection());
    }
    @Override
    public void stop(){
        decreaseSpeed(0);
    }

    public void showGear(){
        System.out.println("Current gear: " + gear);
    }
}

