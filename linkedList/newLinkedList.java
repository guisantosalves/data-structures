package linkedList;

public class newLinkedList {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public newLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // create new node and add to end
    public void append(int value) {
    }

    // create new node and add to beginning
    public void prepend(int value) {
    }

    // create node and insert in particular index
    public boolean insert(int index, int value) {
        return false;
    }

    public static void main(String[] args){
        newLinkedList myLK = new newLinkedList(4);
    }

}