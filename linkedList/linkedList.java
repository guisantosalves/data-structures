package linkedList;
import java.util.LinkedList;

import javax.naming.LimitExceededException;
import javax.naming.LinkException;

public class linkedList {
    public int valor;
    public linkedList prox;

    public linkedList(int valor){
        this.valor = valor;
    }

    public linkedList insertItemInList(int valor){
        linkedList novo = new linkedList(valor);

        //THIS is the current object that execute this function
        novo.prox = this;
        
        return novo;
    }

    public static void main(String[] args){
        // System.out.println("opa bao");
        linkedList list = new linkedList(30);
       
        list = list.insertItemInList(22);
        list = list.insertItemInList(33);

        while(list != null){

            System.out.println(list.valor);

            list = list.prox;
        }
        
    }
}