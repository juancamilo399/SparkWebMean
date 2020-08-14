package edu.escuelaing.arep.utilities;


import java.util.Iterator;

/**
 * Class that represent a LinkedList
 * @author Juan Camilo Angel Hernandez
 * @param <T> Type of the elements stored in the LinkedList
 */
public class LinkedList<T> implements Iterable<T> {



    private Node<T> head;
    private Node<T> tail;

    private int size;

    /**
     * Constructor of a empty linkedList
     */
    public LinkedList() {
        this.size = 0;
    }

    /**
     * Return the size of the linkedList
     * @return The size of an linkedList
     */
    public int getSize() {
        return size;
    }


    /**
     * Return the head of the linkedList
     * @return The first node or head of an linkedList
     */
    public Node<T> getHead(){
        return head;
    }

    /**
     * Return the tail of the linkedList
     * @return The last node or tail of an linkedList
     */
    public Node<T> getTail(){
        return tail;
    }



    /**
     * Add a node with the given value to the linkedList
     * @param data The value of the node to be added
     */
    public void add(T data) {
        Node<T> new_node = new Node<T>(data, null, null);
        if (head==null) {
            head= tail=new_node;
        } else {
            new_node.setPrior(tail);
            tail.setNext(new_node);
            tail = new_node;
        }
        size++;

    }

    /**
     * Delete a node with the given value
     * @param value The value of the node to be deleted
     */
    public void delete(double value){
        if(head!=null && head.getValue().equals(value)){
            head=head.getNext();
            size--;
        }
        else {
            Node<T> current = head;
            Node<T> next = null;
            while((next=current.getNext()) != null){
                if(next.getValue().equals(value)){
                    current.setNext(next.getNext());
                    next.getNext().setPrior(current);
                    size--;
                    break;
                }
                current=current.getNext();
            }
        }
    }

    /**
     * Convert a linkedList to a String representation
     * @return A string form of the linkedList
     */
    @Override
    public String toString() {
        StringBuilder string= new StringBuilder();
        Node<T> current = head;
        Node<T> next = null;
        while((next=current.getNext()) != null){
            string.append(current.getValue()).append(" ");
            current=current.getNext();
        }
        string.append(tail.getValue()).append(" ");
        return string.toString();
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
