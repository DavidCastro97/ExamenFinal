
package com.mycompany.mavenproject1;

public class ListaMaleta {
    Maleta m = new Maleta();
    private NodoM cabeza;
    
    
    public void Listar(Maleta maleta) {
        m.setSuma(m.getFondo()+m.getAncho()+m.getLargo());
        
        if (cabeza == null) {

            //si la lista esta vacia, se inserta como la cabeza
            cabeza = new NodoM(maleta);

        } else if (maleta.getSuma()% 2 == 0) {
            //Si es mayor que la cabeza, se reemplaza por la cabeza

            NodoM aux = new NodoM(maleta);
            aux.setNext2(cabeza.getNext2());
            cabeza = aux;
        } else if (cabeza.getNext2() == null) {

            //Si siguiente es nulo, se agrega despues de la cabeza
            cabeza.getNext2(new NodoM(maleta));
        } else {
            //si no cumple las anteriores, pasa al final 

            NodoM aux = cabeza;
            boolean flag = false;
            while (flag == false) {

                //mientras flag sea falsa, recorre la lista hasta encontrar 
                // el nodo que conecta con nulo
                //Luego agrega la maleta al final de la lista
                if (aux.getNext2() == null) {
                    NodoM temp = new NodoM(maleta);
                    aux.getNext2(temp);
                    flag = true;
                }
                aux = aux.getNext2();//se avanza en la lista
            }
        }
    }
    public String mostrar() {
        //Metodo para mostrar la lista actual
        NodoM aux = cabeza; //Se usa para recorrer la lista
        String C = "";//se inicializa la variable
        while (aux != null) {
            //mientras el aux no sea nulo, se almacena la informacion 
            C += "Peso: " +aux.getMaleta().getPeso() +
                    "Largo: " + aux.getMaleta().getLargo()+ ", ancho "
                    + aux.getMaleta().getAncho() + " | ";
            aux = aux.getNext2();//se avanza en la lista
        }
        return C;
    }
}
