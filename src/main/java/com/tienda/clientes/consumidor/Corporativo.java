package com.tienda.clientes.consumidor;
import com.tienda.clientes.Cliente;

public class Corporativo extends Cliente {
    private int cuit;

    

    public Corporativo(String nombre, String email, int cuit) {
        super(nombre, email);
        this.cuit = cuit;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cuit;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Corporativo other = (Corporativo) obj;
        if (cuit != other.cuit)
            return false;
        return true;
    }
}
