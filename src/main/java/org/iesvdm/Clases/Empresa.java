package org.iesvdm.Clases;

import org.iesvdm.Anotaciones.EmpleadoAnot;
import org.iesvdm.Anotaciones.EmpleadosAnot;

import java.util.HashSet;
import java.util.Set;

//@EmpleadoAnot(nombre = "Jose M.", apellidos = "Martín", dni = 24779999);
//@EmpleadoAnot(nombre = "Natalia", apellidos = "Díaz", dni = 24776666);
public class Empresa {

    private String nombre;
    private Set<Empleado> empleadoSet = new HashSet<>();

    public Empresa() {}

    public Empresa(String nombre, Set<Empleado> empleadoSet) {
        this.nombre = nombre;
        this.empleadoSet = empleadoSet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(Set<Empleado> empleadoSet) {
        this.empleadoSet = empleadoSet;
    }
}
