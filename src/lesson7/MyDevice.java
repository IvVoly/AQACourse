package lesson7;

/* 3) Create two interfaces Volume and State:
        Create a new class "MyDevice" which implements both interfaces. Provide your implementations of methods.*/

public class MyDevice implements Volume, State {
    private double volume;
    private boolean isOn;

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void changeVolume(double value) {
        if (isOn) {
            volume = value;
        }
    }

    public static void main(String[] args) {
        MyDevice device = new MyDevice();
        device.on();
        device.changeVolume(10.2);
        System.out.println(device.volume);
        device.off();
    }
}
