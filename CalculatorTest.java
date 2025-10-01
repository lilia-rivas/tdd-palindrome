package org.generation;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.generacion.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	@Test
	@DisplayName("Sumatoria de números positivos")
	void addTest() {
		Calculator cal = new Calculator();
		assertEquals(5, cal.add(3, 2), "Suma 3 y 2 debe ser 5");
		assertEquals( 100, cal.add(30, 70), "Suma 30 y 70 debe ser 100");
		assertEquals( 1_000_000, cal.add(500_000, 500_000), "Suma 500k y 500k  debe ser 1 millón");
			
		}
	
	//Probar el método de resta
	@Test
	@DisplayName("Resta de números")
	void substractTest() {
		Calculator cal = new Calculator();
		// Resta normal
		assertEquals(5, cal.substract(10, 5), "10 menos 5 debe ser 5");
		// Resta con resultado negativo
		assertEquals(-2, cal.substract(3, 5), "3 menos 5 debe ser -2");
		// Resta de un negativo
		assertEquals(15, cal.substract(10, -5), "10 menos -5 debe ser 15");
	}
	
	
	
	//Probar el método de división
	@Test
	@DisplayName("División de números")
	void divideTest() {
		Calculator cal = new Calculator();
		// División exacta
		assertEquals(2, cal.divide(4, 2), "4 entre 2 debe ser 2");
		// División con decimales
		assertEquals(0.5, cal.divide(1.0, 2.0), "1 entre 2 debe ser 0.5");
	}
	
	@Test
	@DisplayName("División por cero")
	void divideByZeroTest() {
		Calculator cal = new Calculator();
		// Prueba para la excepción (caso límite)
		// Esperamos que se lance una excepción cuando se intenta dividir 5.0 entre 0.0
		assertThrows(IllegalArgumentException.class, () -> cal.divide(5.0, 0.0), 
				"Dividir por cero debe lanzar una IllegalArgumentException");
	}

	
	
	}


