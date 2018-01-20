package lib;

public interface Queueable<T> {

    public int count();

    public void enqueue(T e);

    public void dequeue();
}
