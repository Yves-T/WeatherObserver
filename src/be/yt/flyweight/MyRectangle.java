package be.yt.flyweight;

import java.awt.*;

/**
 * User: Yves-T
 * Date: 21/11/12
 * Time: 13:15
 */
public class MyRectangle implements MyShape {
    private String label;

    public MyRectangle(String label) {
        this.label = label;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
        g.setFont(new Font(font, 12, 12));
        g.drawString(label, x + (width / 2), y);
        if (fill) {
            g.fillRect(x, y, width, height);
        }
    }
}
