package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class ExamenFinalG5 {

    public static void main(String[] args) {

        IngresaUsuario Usa = new IngresaUsuario();
        ListaMaleta maletas = new ListaMaleta();
        Usuario c = new Usuario();
        Maleta m = new Maleta();

        int option = 0;
        while (option != 6) {

            //Menu para mostrar todas las opciones disponibles
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bienvenido a Lafsa escoja una opcion:\n"
                    + "1. Comprar boletos\n"
                    + "2. Observar la cola\n"
                    + "3. Extraer el primero en la cola.\n"
                    + "4. Mostrar lista de finalizados.\n"
                    + "5. Ingresar maletas.\n"
                    + "6. Observar la lista de las maletas\n"));

            switch (option) {
                case 1://Se le pregunta los datos al usuario y los agrega
                    c.setNombre(JOptionPane.showInputDialog
                                            ("Ingrese su Nombre\n"));

                    c.setApellidos(JOptionPane.showInputDialog
                                             ("Ingrese su Apellido\n"));

                    c.setCedula(Integer.parseInt(JOptionPane.showInputDialog
                                                ("Ingrese su Cedula\n")));

                    c.setCorreo(JOptionPane.showInputDialog
                                                    ("Ingrese su Email\n"));

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
                case 3: //Se le pide al usuario los datos de la maleta
                    m.setLargo(Integer.parseInt(JOptionPane.showInputDialog
                                         ("Ingrese el largo de la maleta\n")));
                    m.setAncho(Integer.parseInt(JOptionPane.showInputDialog
                                         ("Ingrese el Ancho de la maleta\n")));
                            
                    m.setPeso(Integer.parseInt(JOptionPane.showInputDialog
                                 ("Ingrese el peso de la maleta en kilos\n")));
                    
                    m.setFondo(Integer.parseInt(JOptionPane.showInputDialog
                                         ("Ingrese el Fondo de la maleta\n")));
                    JOptionPane.showMessageDialog(null,"la suma de los datos de"
                     + "la maleta son"+m.getAncho()+m.getLargo()+m.getFondo());
                    maletas.Listar(m);
                    
                    break;
                case 4:
                    //Se muestra la lista de las maletas ingresadas
                    maletas.mostrar();
                    break;

                case 5:

                    break;

                case 6:

                    break;
            }
        }
    }
}
