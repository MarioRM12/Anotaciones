package org.iesvdm;

import org.iesvdm.Clases.Empresa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpresaTest {


    @Test
    public void testProcesadorDeContexto(){
        Empresa empresa = new Empresa();


        String esperado = null;

        Assertions.assertEquals(esperado,empresa.getNombre());
    }


}
