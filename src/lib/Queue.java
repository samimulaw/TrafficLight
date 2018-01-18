package lib;

// implement the methods in this class
public class Queue<T> implements Queueable {

    public Queue() {
        // instantiate this queue with a list of items
    }

    @Override
    public void count() {

    }

    @Override
    public void enqueue() {
        // Enqueue an item into the queue by creating object of type T
    }

    @Override
    public void dequeue() {

    }

    private class Node {
        private T item;
        private Node next;
    }
}
