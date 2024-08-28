

public class RemoteControl {
    private boolean isOn;

    public RemoteControl() {
        this.isOn = false; // Initially, the device is off
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("The device is now ON.");
        } else {
            System.out.println("The device is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("The device is now OFF.");
        } else {
            System.out.println("The device is already OFF.");
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
