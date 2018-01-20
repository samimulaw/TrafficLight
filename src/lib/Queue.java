package lib;

import java.util.ArrayList;
import java.util.List;

// implement the methods in this class
public class Queue<T> implements Queueable {
	List<T> vehecles= new ArrayList<T>();
    public Queue() {
        // instantiate this queue with a list of items
    	
    	
    }

    @Override
    public int count() {
    return vehecles.size();
    }

    @Override
    public void enqueue(Object c) {
        // Enqueue an item into the queue by creating object of type T
    	vehecles.add((T) c);
    }

    @Override
    public void dequeue() {
    	vehecles.remove(0);
    }

    private class Node {
        private T item;
        private Node next;
    }
}
