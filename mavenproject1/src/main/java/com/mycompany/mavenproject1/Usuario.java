package com.mycompany.mavenproject1;

public class Usuario {
       private String Nombre;
    private String Apellidos;
    private int Cedula;
    private String Correo;
    private int TelefEmer;
    private int edad;
    private double NumVuelo;

    public Usuario(String Nombre, String Apellidos, int Cedula, String Correo, 
            int TelefEmer, int edad, double NumVuelo) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Correo = Correo;
        this.TelefEmer = TelefEmer;
        this.edad = edad;
        this.NumVuelo = NumVuelo;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefEmer() {
        return TelefEmer;
    }

    public void setTelefEmer(int TelefEmer) {
        this.TelefEmer = TelefEmer;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNumVuelo() {
        return NumVuelo;
    }

    public void setNumVuelo(double NumVuelo) {
        this.NumVuelo = NumVuelo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + 
                ", Cedula=" + Cedula + ", Correo=" + Correo + ", TelefEmer=" + 
                TelefEmer + ", edad=" + edad + ", NumVuelo=" + NumVuelo + '}';
    }
    
    
}
