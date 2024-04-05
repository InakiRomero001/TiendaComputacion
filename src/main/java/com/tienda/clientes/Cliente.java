package com.tienda.clientes;

public class Cliente {
    private static int autoid = 0;
    private final int id;
    private String nombre;
    private boolean tipo;
    private String email;

    public Cliente(String nombre) {
        this.id = autoid;
        this.nombre = nombre;
    

        autoid++;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Cliente(String nombre,  String email) {
        this.id = autoid;
        this.nombre = nombre;
    
        this.email = email;

        autoid++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %s", this.id, this.nombre);
    }
}
