package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 8:24
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
