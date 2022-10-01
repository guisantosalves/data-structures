import java.util.Arrays;

public class PilhaArray{
    public String[] pilha;
    public int topo;

    // stack -> first in first out -> FIFO
    // queue -> last in first out -> LIFO
    public PilhaArray(int tamanho){
        this.pilha = new String[tamanho];
        this.topo = -1;
    }

    //push
    public void push(String value){

        // soma um no topo
        this.topo = this.topo + 1;
        this.pilha[topo] = value;
    }

    //pop
    public String pop(){
        // pega o topo da pilha
        String valor = pilha[topo];

        // tirando o ultimo elemento da pilha
        topo = topo - 1;
        
        return valor;
    }
    public static void main(String[] args){
        PilhaArray myArr = new PilhaArray(5);

        myArr.push("J");
        myArr.push("K");
        myArr.push("K");

        System.out.println(myArr.pop());

        System.out.println(Arrays.toString(myArr.pilha));
    }
}

