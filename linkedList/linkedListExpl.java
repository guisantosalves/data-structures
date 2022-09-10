/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaEncadeada;

/**
 *
 * @author 2021103070022
 */
public class Lista {
    // atributo da classe lista
    public static class No{
        public int valor;
        public No proximo;
        
        public No(int valor) {
            this.valor = valor;
        }
    }
    
    // atributo da classe lista
    public No inicio;
    
    //adiciona um nó no final da lista
    //1 - fazer um novo nó com o valor informado
    //2 - fazer o ultimo nó da lista apontar para o novo nó
    public void add(int valor){
        
        // cria o nó
        No novo = new No(valor);
        
        if(inicio == null){
            System.out.println("inicio aponta para o novo");
            inicio = novo;
        }else{
            No ultimo = inicio;
            
            // ultimo.proximo != null, pois quando ele for null 
            // ele vai adicionar um novo nó logo na linha de baixo
            while(ultimo.proximo != null){
                ultimo = ultimo.proximo;
            }
            // aqui adiciona no final da lista
            // depois de percorrer ela e verificar se o proximo é null
            // quando é ele adiciona aqui
            ultimo.proximo = novo;
        }
        
    }
    
    public void exibeLista(){
        No atual = inicio;
        
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
    
    public static void main(String[] args){
       Lista list = new Lista();
       list.add(0);
       list.add(2);
       list.add(4);
       
       list.exibeLista();
              
    }
}
