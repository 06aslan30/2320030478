

public class TurnOnCommand implements Command {
    private RemoteControl remoteControl;

    public TurnOnCommand(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.turnOn();
    }
}