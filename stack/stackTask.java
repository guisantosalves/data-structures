/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author guilh
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    public String[] arr;
    private int top;
    private int capacity;
 
    // Construtor para inicializar a Stack
    Stack(int size)
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
 
        return arr[top--];
    }
    public boolean isEmpty() {
        return top == -1;               
    }
 
    public boolean isFull() {
        return top == capacity - 1;    
    }
    
    public static void main(String[] args) {
        Stack myFirstStack = new Stack(6);
        boolean valone = false;
        boolean valotwo = false;
        boolean valothree = false;
        
        myFirstStack.push("(");
        myFirstStack.push("{");
        myFirstStack.push("(");
        myFirstStack.push(")");
        myFirstStack.push("}");
        myFirstStack.push(")");
        
        for(int i = 0; i < myFirstStack.arr.length; i++){
            if(myFirstStack.arr[i].contains("}")){
                valone = true;
            }
            if(myFirstStack.arr[i].contains("]")){
                valotwo = true;
            }
            if(myFirstStack.arr[i].contains(")")){
                valothree = true;
            }
        }
        
        if (valone && valotwo && valothree){
            System.out.println("INCORRETA");
        }else{
            System.out.println("CORRETA");
        }
        System.out.println(Arrays.toString(myFirstStack.arr));
    }
}
