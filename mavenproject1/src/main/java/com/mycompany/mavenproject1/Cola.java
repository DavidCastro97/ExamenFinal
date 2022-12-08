/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author jose siles 
 */
public class Cola {
    public int nodo;
    public int cima;
    public int largo;
    
    //Metodo para comprobar el estado de la cima
    public boolean Vacia(){ return cima == null;}
    
    
    //Metodo para eliminar la cima 
  public void pop(){
        if (!Vacia()) {
           
            this.cima = this.cima.getSiguiente();
       
            this.largo--;
            
              else{
            System.out.println("El nodo indicado no existe");
        }
        }
    }
}
