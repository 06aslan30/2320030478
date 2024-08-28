

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommandTests {
    private RemoteControl remoteControl;
    private UndoableCommand turnOnCommand;
    private UndoableCommand turnOffCommand;
    private RemoteControlInvoker invoker;

    @BeforeEach
    public void setUp() {
        remoteControl = new RemoteControl();
        turnOnCommand = new TurnOnCommand(remoteControl);
        turnOffCommand = new TurnOffCommand(remoteControl);
        invoker = new RemoteControlInvoker();
    }

    @Test
    public void testTurnOnCommandExecution() {
        invoker.setCommand(turnOnCommand);
        invoker.pressButton();
        assertTrue(remoteControl.isOn(), "The device should be ON.");
    }

    @Test
    public void testTurnOffCommandExecution() {
        remoteControl.turnOn(); // Ensure device is ON before turning it off
        invoker.setCommand(turnOffCommand);
        invoker.pressButton();
        assertFalse(remoteControl.isOn(), "The device should be OFF.");
    }

    @Test
    public void testUndoTurnOnCommand() {
        invoker.setCommand(turnOnCommand);
        invoker.pressButton(); // Turn ON
        invoker.setCommand(turnOnCommand); // Set command to undo
        invoker.pressButton(); // Undo (Turn OFF)
        assertFalse(remoteControl.isOn(), "The device should be OFF after undo.");
    }

    @Test
    public void testUndoTurnOffCommand() {
        remoteControl.turnOn(); // Ensure device is ON before turning it off
        invoker.setCommand(turnOffCommand);
        invoker.pressButton(); // Turn OFF
        invoker.setCommand(turnOffCommand); // Set command to undo
        invoker.pressButton(); // Undo (Turn ON)
        assertTrue(remoteControl.isOn(), "The device should be ON after undo.");
    }
}
