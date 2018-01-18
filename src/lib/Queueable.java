package lib;

public interface Queueable<T> {

    public void count();

    public void enqueue();

    public void dequeue();
}
