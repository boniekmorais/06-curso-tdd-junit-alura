package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraServiceTest {

    @Test
    void deveSomarDoisNumerosPositivos() {
        CalculadoraService calc = new CalculadoraService();
        int soma = calc.somar(3, 7);
        assertEquals(10, soma);
    }
}
