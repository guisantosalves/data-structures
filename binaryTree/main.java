package binaryTree;

public class main {

    static class Element<T> {
        private T value;
        private Element<T> left;
        private Element<T> right;

        public Element(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Element<T> getLeft() {
            return this.left;
        }

        public void setLeft(Element<T> newElement) {
            this.left = newElement;
        }

        public Element<T> getRight() {
            return this.right;
        }

        public void setRight(Element<T> newElement) {
            this.right = newElement;
        }
    }

    static class Tree<T extends Comparable> {
        private Element<T> raiz;

        public Tree() {
            this.raiz = null;
        }

        // adding
        public void add(T value) {
            Element<T> newElementToInsert = new Element<T>(value);
            if (raiz == null) {
                // if it has nothing in the tree only insert the element
                this.raiz = newElementToInsert;
            } else {
                // point to the root
                Element<T> current = this.raiz;
                while (true) {
                    // verify if the value is less than current value
                    // -1 -> less than / 1 -> greater than / 0 -> equals
                    if (newElementToInsert.getValue().compareTo(current.getValue()) == -1) {
                        // less than
                        if (current.getLeft() != null) {
                            // go down
                            current = current.getLeft();
                        } else {
                            // set the element
                            current.setLeft(newElementToInsert);
                            break;
                        }
                    } else {
                        // greater or equals
                        if (current.getRight() != null) {
                            current = current.getRight();
                        } else {
                            current.setRight(newElementToInsert);
                            break;
                        }
                    }
                }
            }
        }

        // printing
        public void priting(Element<T> current) {
            // point to the root
            if (current != null) {
                // call time
                priting(current.getLeft());
                System.out.println(current.getValue());
                // return time
                priting(current.getRight());
            }
        }

        // findAnElement and compare if exist
        // pre order
        public boolean findAnElement(Element<T> current, T value) {
            // if the reference is null
            if (current == null) {
                return false;
            }

            // if it is the root
            if (current.value == value) {
                return true;
            }

            // recursively search in left subtrees -> calling time
            boolean responseOne = findAnElement(current.getLeft(), value);
            if (responseOne)
                return true;

            // if its not in lef search in the right
            boolean responseTwo = findAnElement(current.getRight(), value);
            return responseTwo;
        }
    }

    public static void main(String[] args) {
        Tree<Integer> myTree = new Tree<Integer>();
        Integer valueToSearch = 10;
        myTree.add(10);
        myTree.add(8);
        myTree.add(5);
        myTree.add(9);
        myTree.add(7);
        myTree.add(18);
        myTree.priting(myTree.raiz);
        boolean myValue = myTree.findAnElement(myTree.raiz, valueToSearch);
        System.out.println("The value " + valueToSearch + " exist inside tree: " + (myValue == true ? "yeah" : "no"));
    }
}
