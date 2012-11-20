package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 9:02
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
