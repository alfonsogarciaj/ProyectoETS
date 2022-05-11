package com.example;

import es.iespuerto.pharmaguardia.Gestion;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestionTest {
    
    Gestion gestion = null;

    @BeforeEach
    public void BeforeEach(){
        if(gestion == null){
            gestion = new Gestion();
        }
    }

    @Test
    public void GestionConstructorPorDefecto(){
        assertNotNull(gestion, "La gestión es nula");
    }


}
