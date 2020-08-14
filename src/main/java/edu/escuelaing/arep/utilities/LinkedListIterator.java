package edu.escuelaing.arep.utilities;

import java.util.Iterator;

/**
 * Iterator for the LinkedList
 * @author Juan Camilo Angel Hernandez
 * @param <T> Type of elements returned by the iterator object
 */
public class LinkedListIterator<T> implements Iterator<T> {

    Node<T> current;

    /**
     * Construct a iterator for an LinkedList
     * @param linkedList the linkedList which is assigned the iterator
     */
    public LinkedListIterator(LinkedList<T> linkedList) {
        current = linkedList.getHead();
    }

    /**
     * Returns true if the iteration has more elements
     * @return True if the iteration has more elements
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Returns the next element in the iteration.
     * @return The next element in the iteration
     */
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }

    public void remove() {
    }
}
