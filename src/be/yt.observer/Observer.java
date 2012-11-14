package be.yt.observer;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 10:53
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
