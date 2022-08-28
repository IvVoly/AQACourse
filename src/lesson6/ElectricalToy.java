package lesson6;

/*
4) Create a class A. Add several fields, two methods and parameterized constructors to it.
Create a class B that extends class A.
        Demonstrate in you program how class's B constructor should call class's A constructor to create
        a new object. Override one method of the class A to fully change it's behavior.
        Override another method to add some extra functionality to it, but it should then call class's A method.
        Create a test class and create several objects of class A and class B and call their methods.
*/

public class ElectricalToy {
    private String name;
    private String colorLight;
    private int speed;
    private boolean isOn;
    private int[] position;

    public ElectricalToy(String name, String colorLight, int speed, int x, int y) {
        this(name, colorLight, speed);
        position = new int[]{x, y};
    }

    public ElectricalToy(String name, String colorLight, int speed) {
        this(name, colorLight);
        this.speed = speed;

    }

    public ElectricalToy(String name, String colorLight) {
        this.name = name;
        this.colorLight = colorLight;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOf() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorLight() {
        return colorLight;
    }

    public void setColor(String colorLight) {
        this.colorLight = colorLight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        position = new int[]{x, y};
    }

    public void move(int click) {
        int velocity = speed * click;
        position[0] = position[0] + velocity;
        position[1] = position[1] + velocity;
    }

    public void shine() {
        System.out.println("glow light " + colorLight);
    }

    public void play() {
        powerOn();
        shine();
    }
}

