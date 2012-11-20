package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 8:20
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
