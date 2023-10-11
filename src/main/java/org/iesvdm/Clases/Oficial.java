package org.iesvdm.Clases;

public class Oficial extends Operario {

    public String categoria;

    public Oficial(String categoria) {
        this.categoria = categoria;
    }

    public Oficial(Integer codigoTaller, String categoria) {
        super(codigoTaller);
        this.categoria = categoria;
    }

    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String categoria) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                ", codigoTaller=" + codigoTaller +
                '}';
    }
}
