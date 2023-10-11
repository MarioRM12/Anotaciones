package org.iesvdm.Util;

import org.iesvdm.Anotaciones.EmpleadoAnot;
import org.iesvdm.Anotaciones.EmpleadosAnot;
import org.iesvdm.Clases.Empleado;
import org.iesvdm.Clases.Empresa;
import org.iesvdm.Clases.Oficial;

public class UtilContexto {

    /*public static void cargadorDeContexto(Empresa empresa) {

        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotHijos = empleadosAnotPadre.value();

        for (EmpleadoAnot empleadoAnotHijo : empleadoAnotHijos) {

            String nombre = empleadoAnotHijo.nombre();
            String apellidos = empleadoAnotHijo.apellidos();
            long dni = empleadoAnotHijo.dni();

            empresa.getEmpleadoSet().add(new Oficial(nombre, apellidos, dni));

        }

    }*/

}
