package assignment03;

public interface MyObservable {

    void registerObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyObserver(int i);

}
