package com.mycompany.mavenproject1;

public class NodoC {
    private String Usuario;
    private NodoC atras;

    public NodoC(String Usuario, NodoC atras) {
        this.Usuario = Usuario;
        this.atras = atras;
    }

    NodoC(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "NodoC{" + "Usuario=" + Usuario + ", atras=" + atras + '}';
    }
    
}

