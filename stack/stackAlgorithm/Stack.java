package stackAlgorithm;

public class Stack {
    public String[] arr;

    public int top;

    public int capacity;

 

    // Construtor para inicializar a Stack

    public Stack(int size)
    {

        arr = new String[size];

        capacity = size;

        top = -1;

    }

    // Função utilitária para adicionar um elemento `x` à Stack

    public void push(String x)

    {

        if (isFull())

        {

            System.out.println("erro");

            System.exit(-1);

        }

 

        System.out.println("Inserting " + x);

        arr[++top] = x;

    }

 

    public String pop()

    {

        // verifica se há underflow da Stack

        if (isEmpty())

        {

            System.out.println("erro");

            System.exit(-1);

        }

 
        // return o que foi retirado
        return arr[top--];

    }

    public boolean isEmpty() {

        return top == -1;               

    }

 

    public boolean isFull() {

        return top == capacity - 1;    

    }
}
