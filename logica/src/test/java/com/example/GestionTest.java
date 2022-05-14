package com.example;

import es.iespuerto.pharmaguardia.Direccion;
import es.iespuerto.pharmaguardia.Farmacia;
import es.iespuerto.pharmaguardia.Gestion;
import es.iespuerto.pharmaguardia.Direccion.Isla;
import es.iespuerto.pharmaguardia.Direccion.Provincia;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestionTest {

    Gestion gestion = null;
    Farmacia farmacia = null;
    Direccion direccion = new Direccion(11111, "Calle", 2, Provincia.LAS_PALMAS_DE_GRAN_CANARIA, Isla.LANZAROTE);

    @BeforeEach
    public void BeforeEach(){
        if(gestion == null){
            gestion = new Gestion();
        }
        if(farmacia == null){
            farmacia = new Farmacia( 5555 , "FarmaciaEjemplo" , 666666666 , direccion , true);
        }
    }

    @Test
    public void GestionConstructorPorDefecto(){
        assertNotNull(gestion, "La gestión es nula");
    }

    @Test
    public void addFarmaciaTest(){
        String mensaje = gestion.addFarmacia(farmacia);
        assertTrue(mensaje.contains("correctamente"), "La farmacia no se ha agregado correctamente");
    }

    @Test
    public void addFarmaciaElseTest(){
        gestion.addFarmacia(farmacia);
        String mensaje = gestion.addFarmacia(farmacia);
        assertTrue(mensaje.contains("duplicado"), "La farmacia se ha agregado cuando no debería");
    }

    @Test
    public void eliminarFarmaciaTest(){
        gestion.addFarmacia(farmacia);
        String mensaje = gestion.eliminarFarmacia(farmacia);
        assertTrue(mensaje.contains("correctamente"), "La farmacia no se ha eliminado");
    }

    @Test 
    public void eliminarFarmaciaElseTest(){
        String mensaje = gestion.eliminarFarmacia(farmacia);
        assertTrue(mensaje.contains("no existe"), "La farmacia se ha eliminado cuando no debería");
    }

    @Test
    public void buscarFarmaciaTest(){
        gestion.addFarmacia(farmacia);
        Farmacia farmaciaBuscar = gestion.buscarFarmacia(farmacia.getCodigo());
        assertTrue(farmaciaBuscar.equals(farmacia), "La farmacia no se ha encontrado correctamente");
    }

    @Test
    public void buscarFarmaciaPorCodigoPostalTest(){
        gestion.addFarmacia(farmacia);
        List<Farmacia> farmacias = gestion.buscarFarmaciaPorCodigoPostal(farmacia.getDireccion().getCodigoPostal());
        assertTrue(farmacias.contains(farmacia), "La farmacia no se ha encontrado correctamente");
    }

}