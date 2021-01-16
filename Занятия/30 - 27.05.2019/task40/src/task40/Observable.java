package task40;


public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(char c);
}
