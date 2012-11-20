package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 8:43
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offComand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWashPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWashPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------- Remote Control  -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            String string = String.format("%-7s%d%s%-35s%s%-10s%s",
                    "slot [",
                    i,
                    "] ",
                    onCommands[i].getClass().getName(),
                    "\t",
                    offCommands[i].getClass().getName(),
                    "\n");
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}
