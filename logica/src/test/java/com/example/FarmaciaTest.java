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
public class FarmaciaTest
{
    Direccion direccion = null;
    Farmacia farmacia = null;

    @BeforeEach
    public void BeforeEach(){
        if (farmacia == null){
            farmacia = new Farmacia( 5555 , "FarmaciaEjemplo" , 666666666 , direccion , true);
        }
    }

    @Test
    public void FarmaciaContructorDefecto(){
        farmacia = new Farmacia();
        assertNotNull(farmacia, "El cliente no es nulo");
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
