/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller3;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 *
 * @author dhper
 */
public class TestFactorial {

    Funciones test1 = new Funciones();
    Sucesion test2 = new Sucesion();

    public void testFactorialIt() {

        double resultado = test1.factorialRec(5);
        assertEquals(120, resultado);

    }

    public void testFactorialRec() {

        double resultado = test1.factorial(5);
        assertEquals(120, resultado);

    }

}
