package com.example;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuerto.pharmaguardia.Cliente;
import es.iespuerto.pharmaguardia.Direccion;
import es.iespuerto.pharmaguardia.Farmacia;

/**
 * Unit test for simple App.
 */
public class DireccionTest
{
    Direccion direccion = null;


    @BeforeEach
    public void BeforeEach(){
        if (direccion == null){
            direccion = new Direccion(99, "Calle", 8, Direccion.Provincia.SANTA_CRUZ_DE_TENERIFE, Direccion.Isla.EL_HIERRO);
        }

    }

    @Test
    public void ClienteContructorDefecto(){
        direccion = new Direccion();
        assertNotNull(direccion, "La direccion no es nulo");
    }







    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
