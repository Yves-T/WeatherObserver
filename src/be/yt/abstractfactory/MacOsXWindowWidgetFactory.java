package be.yt.abstractfactory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 14:59
 */
// concrete factory b1
public class MacOsXWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSXWindow();
    }
}
