
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Command turnOn = new TurnOnCommand(remoteControl);
        Command turnOff = new TurnOffCommand(remoteControl);

        RemoteControlInvoker invoker = new RemoteControlInvoker();

        invoker.setCommand(turnOn);
        invoker.pressButton(); // Turn on the device

        invoker.setCommand(turnOff);
        invoker.pressButton(); // Turn off the device
    }
}
