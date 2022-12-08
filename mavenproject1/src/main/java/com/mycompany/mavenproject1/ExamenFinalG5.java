package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ExamenFinalG5 {

    public static void main(String[] args) {
        
        IngresaUsuario Usa = new IngresaUsuario();
        Usuario c = new Usuario(null,null,0,null,0,0,0);
        
        int option = 0;
        while (option != 6){
            
            //Menu para mostrar todas las opciones disponibles
            option = Integer.parseInt(JOptionPane.showInputDialog(
                                  "Bienvenido a Lafsa escoja una opcion:\n"
                                   + "1. Comprar boletos\n"
                                   + "2. Observar la cola\n"
                                   + "3. Extraer el primero en la cola.\n"
                                   + "4. Mostrar lista de finalizados.\n"
                                   + "3. Ingresar maletas.\n"
                                   + "5. Observar la lista de las maletas\n"));
            
            switch(option) {
                case 1://Se le pregunta los datos al usuario y los agrega
                c.setNombre(JOptionPane.showInputDialog
                                                ("Ingrese su Nombre\n"));
                   
                c.setApellidos(JOptionPane.showInputDialog
                                                ("Ingrese su Apellido\n"));
                   
                c.setCedula(Integer.parseInt(JOptionPane.showInputDialog
                                                ("Ingrese su Cedula\n")));
                   
                c.setCorreo(JOptionPane.showInputDialog("Ingrese su Email\n"));
                   
                   c.setTelefEmer(Integer.parseInt(JOptionPane.showInputDialog
                                                ("Ingrese su Cedula\n")));
                   
                   c.setEdad(Integer.parseInt(JOptionPane.showInputDialog
                                                ("Ingrese su Edad\n")));
                   
                   c.setNumVuelo(Integer.parseInt(JOptionPane.showInputDialog
                                                ("Ingrese su Cedula\n")));
                    break;
                case 2:
                    Usa.MostrarCola();
                        
                    break;
                case 3:
                  
                    break;
                case 4:
                 
                    break;
                    case 5:
                 
                    break;
                    case 6:
                 
                    break;
    }
}
    }
}
