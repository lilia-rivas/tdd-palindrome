package org.generation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.generacion.Calculator;
import org.junit.jupiter.api.*;

// La clase debe ser pública para que JUnit la pueda encontrar
public class CalculatorBeforeEachTest {
	
	// 1. Declarar la instancia de la calculadora como un atributo de la clase.
	private Calculator cal; 

	/**
	 * 2. Método @BeforeEach
	 * Este método se ejecuta antes de CADA método de prueba (@Test).
	 * Su propósito es inicializar el objeto 'cal' antes de que se use en la prueba.
	 */
	@BeforeEach
	void setUp() {
		// ¡Aquí inicializamos la calculadora UNA SOLA VEZ!
		cal = new Calculator(); 
		System.out.println("-> Inicializando nueva calculadora para la prueba.");
	}
	
	@Test
	@DisplayName("Sumatoria de números")
	void addTest() {
		// Ya no se necesita: Calculator cal = new Calculator();
		assertEquals(5, cal.add(3, 2), "Suma 3 y 2 debe ser 5");
		assertEquals( 100, cal.add(30, 70), "Suma 30 y 70 debe ser 100");
		assertEquals( 1_000_000, cal.add(500_000, 500_000), "Suma 500k y 500k debe ser 1 millón");
	}
	
	@Test
	@DisplayName("Resta de números")
	void substractTest() {
		// Ya no se necesita: Calculator cal = new Calculator();
		// Resta normal
		assertEquals(5, cal.substract(10, 5), "10 menos 5 debe ser 5");
		// Resta con resultado negativo
		assertEquals(-2, cal.substract(3, 5), "3 menos 5 debe ser -2");
		// Resta de un negativo
		assertEquals(15, cal.substract(10, -5), "10 menos -5 debe ser 15");
	}
	
	@Test
	@DisplayName("División de números")
	void divideTest() {
		// Ya no se necesita: Calculator cal = new Calculator();
		// División exacta (Nota: 4 y 2 deben ser double si el método devuelve double)
        // Usaremos el tipo double para la aserción
		assertEquals(2.0, cal.divide(4.0, 2.0), "4 entre 2 debe ser 2.0"); 
		// División con decimales
		assertEquals(0.5, cal.divide(1.0, 2.0), "1 entre 2 debe ser 0.5");
	}
	
	@Test
	@DisplayName("División por cero")
	void divideByZeroTest() {
		// Ya no se necesita: Calculator cal = new Calculator();
		// Usamos assertThrows para verificar la excepción
		assertThrows(IllegalArgumentException.class, () -> cal.divide(5.0, 0.0),
				"Dividir por cero debe lanzar una IllegalArgumentException");
	}

}