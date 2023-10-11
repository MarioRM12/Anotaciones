package org.iesvdm.Clases;

public class Tecnico extends Operario {

    String perfil;

    public Tecnico(String perfil) {
        this.perfil = perfil;
    }

    public Tecnico(Integer codigoTaller, String perfil) {
        super(codigoTaller);
        this.perfil = perfil;
    }

    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String perfil) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                ", codigoTaller=" + codigoTaller +
                '}';
    }
}
