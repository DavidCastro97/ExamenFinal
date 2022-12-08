
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class IngresaUsuario {
    private NodoC frente;
    private NodoC ultimo;
    private int largo;
    Usuario Usa2 = new Usuario();
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
    public boolean Vacia(){ return frente == null;}

    //Metodo para siguiente
    public void pop(){
        if (!Vacia()) {
           
            this.frente = this.frente.getAtras();
       
            this.largo--;
        }
    }
    
    public NodoC MostrarCola(){
        //Creamos una variable auxiliar que nos irá recorriendo la cola
        NodoC aux = frente; 
        //Creamos una variable auxiliar que nos guarda la cima 
        NodoC aux2 = frente; 
        JOptionPane.showMessageDialog(null,"Lista de los usuarios");
        while(aux != null){
           JOptionPane.showInputDialog( //Muestra los datos en la cola
                                  "Datos del usuario registrado\n"
                             + "Nombre y apellidos: \n"+Usa2.getNombre()
                                          +Usa2.getApellidos()
                             + "Cedula: \n"+Usa2.getCedula()
                             + "Correo: \n"+Usa2.getCorreo()
                             + "Telefono de emergencia: \n"+Usa2.getTelefEmer()
                             + "Edad: \n"+Usa2.getEdad()
                             + "Numero de vuelo: \n"+Usa2.getNumVuelo());
           
            if(aux.getAtras()!= null){ 
                aux = aux.getAtras();
            }
            else{
            aux = null;
            }
            }
        return null;
}
     @Override
    public String toString(){
        String s="";
        NodoC aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}




        
    

