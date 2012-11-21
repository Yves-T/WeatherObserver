package be.yt.flyweight;

import java.awt.*;

/**
 * User: Yves-T
 * Date: 21/11/12
 * Time: 13:05
 */
public interface MyShape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font);
}
