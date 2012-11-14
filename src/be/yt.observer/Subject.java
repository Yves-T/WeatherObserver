package be.yt.observer;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 10:51
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
