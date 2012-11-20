package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 8:15
 */
public interface Command {
    public void execute();

    public void undo();
}
