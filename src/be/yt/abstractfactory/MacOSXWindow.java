package be.yt.abstractfactory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 14:48
 */
// concrete product B1
public class MacOSXWindow implements Window {
    @Override
    public void setTitle(String text) {
        System.out.println("Mac window is receiving a title : " + text);
    }

    @Override
    public void repaint() {
        System.out.println("Mac window is repainting....");
    }
}
