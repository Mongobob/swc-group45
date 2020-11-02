package assignment03;

public interface MyObservable {

    void registerObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyObserver(Location a, int i, boolean wasDestroyed);

}
