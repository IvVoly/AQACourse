package lesson7.RemoteDevice;

/*4) Write a project named "Remote Device". Create a class "RemoteController"
which will be simulation the real one to control the TV.
  Create interfaces Device and Volume.
  The "Device" interface should have methods powerOn(), powerOff(), setChannel(int channel),
  and currentChannel(); The "Volume" interface should have methods "upVolume(), downVolume() and mute();
  Write an abstract class TVDevice which will be implementing interfaces Volume and Device and has the fields String
  modelName and boolean isOn (Tip: You don't need to implement methods from the interfaceif you class is abstract).
  Write a class "TV" which extends the class TVDevice. Implements all the methods.
  Write a class RemoteController to control your TV.
  Example of the structure in the attachments.*/

public class TV extends TVDevice {
    private int volumeLevel;
    private int channelNumber;

    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    @Override
    public void setChannel(int number) {
        if (isOn && number == 0) {
            channelNumber++;
        }
        if (isOn && number > 0) {
            channelNumber = number;
        }
    }

    @Override
    public void currentChannel() {
        if (isOn) {
            System.out.println("Channel - " + channelNumber);
        }
    }

    @Override
    public void upVolume() {
        if (isOn) {
            volumeLevel++;
        }

    }

    @Override
    public void downVolume() {
        if (isOn) {
            volumeLevel--;
        }

    }

    @Override
    public void mute() {
        if (isOn) {
            volumeLevel = 0;
        }

    }
}
