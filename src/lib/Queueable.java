package lib;

public interface Queueable<T> {

    public int count();

    public void enqueue(T node);

    public void dequeue();
}
