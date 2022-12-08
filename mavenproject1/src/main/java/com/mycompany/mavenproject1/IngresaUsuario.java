
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class IngresaUsuario {
    private NodoC frente;
    private NodoC ultimo;
    
     public IngresaUsuario() {
                 
    }
    public void encola(NodoC d){
        if(frente == null){  // significa que la cola esta vacia
            
            frente = d;
            ultimo = d;
        } else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    
    public NodoC MostrarCola(){
        NodoC aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
}
