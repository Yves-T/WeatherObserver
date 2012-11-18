package be.yt.abstractfactory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 14:57
 */
// concrete factory a1
public class MsWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}
