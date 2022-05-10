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
public class ClienteTest 
{
    Cliente cliente = null;
    Direccion direccion = null;
    Farmacia farmacia = null;

    @BeforeEach
    public void BeforeEach(){
        if (cliente == null){
            cliente = new Cliente("nombre", 0006666 ,"nombre@gmail.com", direccion , farmacia);
        }
    }

    @Test
    public void ClienteContructorDefecto(){
        cliente = new Cliente();
        assertNotNull(cliente, "El cliente no es nulo");
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
