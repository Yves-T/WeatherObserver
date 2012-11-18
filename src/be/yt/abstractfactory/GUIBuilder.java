package be.yt.abstractfactory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 15:02
 */
// client
public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        window.setTitle("Hello window!");
    }
}
