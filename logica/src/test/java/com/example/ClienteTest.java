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

    Farmacia farmaciaDeConfianza = null;

    @BeforeEach
    public void BeforeEach(){
        if (cliente == null){
            cliente = new Cliente("nombre", 0006666 ,"nombre@gmail.com", direccion , farmacia);
        }
        if (farmaciaDeConfianza == null){
            farmaciaDeConfianza = new Farmacia( 5555 , "FarmaciaEjemplo" , 666666666 , direccion , true);
        }
    }


    @Test
    public void ClienteContructorDefectoTest(){
        cliente = new Cliente();
        assertNotNull(cliente, "El cliente no es nulo");
    }

    @Test
    public void addFarmaciaDeConfianzaTest(){
        String mensaje = cliente.addFarmaciaDeConfianza(farmaciaDeConfianza);
        assertTrue(mensaje.contains("correctamente"), "El mensaje de respuesta no es el esperado");
    }

    @Test
    public void addFarmaciaDeConfianzaElseTest(){
        cliente.addFarmaciaDeConfianza(farmaciaDeConfianza);
        String mensaje = cliente.addFarmaciaDeConfianza(farmaciaDeConfianza);
        assertTrue(mensaje.contains("asignada"), "El mensaje de respuesta no es el esperado");
    }

    @Test
    public void eliminarFarmaciaDeConfianzaTest(){
        cliente.addFarmaciaDeConfianza(farmaciaDeConfianza);
        String mensaje = cliente.eliminarFarmaciaDeConfianza();
        assertTrue(mensaje.contains("correctamente"), "El mensaje de respuesta no es el esperado");
    }

    @Test
    public void eliminarFarmaciaDeConfianzaElseTest(){
        String mensaje = cliente.eliminarFarmaciaDeConfianza();
        assertTrue(mensaje.contains("asignada"), "El mensaje de respuesta no es el esperado");
    }

    @Test
    public void modificaFarmaciaDeConfianzaTest(){
        cliente.addFarmaciaDeConfianza(farmaciaDeConfianza);
        String mensaje = cliente.modificarFarmaciaDeConfianza(new Farmacia());
        assertTrue(mensaje.contains("correctamente"), "El mensaje de respuesta no es el esperado");
    }

    @Test
    public void modificaFarmaciaDeConfianzaElseTest(){
        String mensaje = cliente.modificarFarmaciaDeConfianza(farmaciaDeConfianza);
        assertTrue(mensaje.contains("asignada"), "El mensaje de respuesta no es el esperado");
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
