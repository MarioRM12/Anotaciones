package org.iesvdm.Clases;

public abstract class Operario extends Empleado {
    public Integer codigoTaller;

    public Operario() {}

    public Operario(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public Integer getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }
}
