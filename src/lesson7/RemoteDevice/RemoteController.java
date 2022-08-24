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

public class RemoteController implements Device, Volume {
    TVDevice tvDevice;

    public void connectDevice(TVDevice dev) {
        tvDevice = dev;
    }

    public void disconnectDevice() {
        tvDevice = null;
    }

    public void switchTheChannel(int click) {
        while (click != 0) {
            tvDevice.setChannel(0);
            click--;
        }
    }

    private boolean checkIfDeviceConnected() {
        return tvDevice != null;
    }

    @Override
    public void powerOn() {
        tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        tvDevice.powerOff();
    }

    @Override
    public void setChannel(int number) {
        tvDevice.setChannel(number);
    }

    @Override
    public void currentChannel() {
        tvDevice.currentChannel();
    }

    @Override
    public void upVolume() {
        tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        tvDevice.downVolume();
    }

    @Override
    public void mute() {
        tvDevice.mute();
    }
}
