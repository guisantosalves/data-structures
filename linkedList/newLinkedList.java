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

    public newLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // create new node and add to end
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            // current node
            tail.next = newNode;
            // tail receive the new node
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = head;
        Node pre = head; // penultimo
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        // nesse ponto pre será o penultimo nó
        tail = pre;
        tail.next = null;
        length--;
        // if it has only one node
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }else{
            // get the first reference
            Node temp = head;
            
            // head goes to the next node
            head = head.next;
            
            // temp removes the first from liked list
            temp.next = null;
            length--;
            if(length == 0){
                // because if the LL has only one item
                tail = null;
            }
            return temp;
        }
    }

    // create new node and add to beginning
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            // new node receive the node that head is pointing
            newNode.next = head;
            // head is now pointing to the node created
            head = newNode;
        }
        length++;
    }

    // create node and insert in particular index
    public boolean insert(int index, int value) {
        return false;
    }

    public static void main(String[] args) {
        newLinkedList myLK = new newLinkedList(4);
        myLK.printList();
        System.out.println("\n-----------\n");
        myLK.append(6);
        myLK.printList();
        myLK.removeLast();
        myLK.prepend(8);
        System.out.println("\n-----------\n");
        myLK.printList();
        myLK.removeFirst();
        System.out.println("\n-----------\n");
        myLK.printList();
    }

}