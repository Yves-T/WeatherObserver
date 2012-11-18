package be.yt.abstractfactory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 14:45
 */
// concrete product A1
public class MSWindow implements Window {
    @Override
    public void setTitle(String text) {
        System.out.println("MSWindow is receiving title :" + text);
    }

    @Override
    public void repaint() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("MSWindow is repainting....");
    }
}
