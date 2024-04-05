package com.tienda.clientes.consumidor;
import com.tienda.clientes.Cliente;

public class Consumidor extends Cliente {
private int Dni;
private boolean premium;





public Consumidor(String nombre, String email, int dni, boolean premium) {
    super(nombre, email);
    Dni = dni;
    this.premium = false;
}

public int getDni() {
    return Dni;
}

public void setCuit(int Dni) {
    this.Dni = Dni;
}

public boolean isPremium() {
    return premium;
}

public void setPremium(boolean premium) {
    this.premium = premium;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Dni;
    
    return result;
}
@Override
public String toString() {
    return String.format("%s. premium: %s", super.toString(), (this.premium) ? "sí" : "no");
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Consumidor other = (Consumidor) obj;
    if (Dni != other.Dni)
        return false;
    if (premium != other.premium)
        return false;
    return true;
}


}   

