package lib;

import java.util.ArrayList;
import java.util.List;

// implement the methods in this class
public class Queue<T> implements Queueable<T> {

	private List<T> nodes = new ArrayList<>();

	public Queue() {
        // instantiate this queue with a list of items
    }

    @Override
    public int count() {
    return nodes.size();
    }

    @Override
    public void enqueue(T node) {
        nodes.add(node);
    }

    @Override
    public void dequeue() {
    	nodes.remove(0);
    }
}
