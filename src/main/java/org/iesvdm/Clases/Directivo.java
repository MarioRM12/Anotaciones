package org.iesvdm.Clases;

public class Directivo extends Empleado {

    public Integer codigoDespacho;

    public Directivo() {}

    public Directivo(Integer codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    public Directivo(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoDespacho) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public Integer getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(Integer codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codigoDespacho=" + codigoDespacho +
                '}';
    }
}
