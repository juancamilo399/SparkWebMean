package edu.escuelaing.arep.utilities;

/**
 * Class that represent a node of the linkedList
 * @author Juan Camilo Angel Hernandez
 * @param <T> Type of the value of the node
 */
public class Node<T> {

    private Node<T> next, prior;
    private T value;

    /**
     * Construct a node
     * @param value Values asigned to the node
     * @param prior The prior node of the current node
     * @param next The next node of the current node
     */
    public Node(T value, Node<T> prior, Node<T> next) {
        this.value = value;
        this.next = next;
        this.prior = prior;
    }

    /**
     * Return the value of the node
     * @return The value of the node
     */
    public T getValue() {
        return value;
    }

    /**
     * Set the value of the node
     * @param value The value to be assingned to the node
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Return the next node to the current node
     * @return The next node to the current node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Set the next node of the current node
     * @param next The next node of the current node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Return the prior node to the current node
     * @return The prior node to the current node
     */
    public Node<T> getPrior() {
        return prior;
    }

    /**
     * Set the prior node of the current node
     * @param prior The prior node of the current node
     */
    public void setPrior(Node<T> prior) {
        this.prior = prior;
    }

}
