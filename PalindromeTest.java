package org.generation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    
    // 1. Declarar la instancia de la clase de producción
    Palindrome palindrome;
   
    /**
     * 2. Método que se ejecuta ANTES de CADA prueba (@Test)
     * Inicializa una nueva instancia de Palindrome para cada prueba.
     */
    @BeforeEach
    void setUp() {
    	palindrome = new Palindrome();
    }
   
    // 3. El método de prueba
    @Test
    void isPalindromeTest() {
        // Casos de éxito:
        assertEquals(true, palindrome.isPalindrome("Oso"), "Oso debe ser palindromo");
        assertEquals(true, palindrome.isPalindrome("Anita lava la tina"), "La frase debe ser palindromo");
        
        // Casos de falla:
        assertEquals(false, palindrome.isPalindrome("Ver"), "Ver no debe ser palindromo");
        assertEquals(false, palindrome.isPalindrome("Hola"), "Hola no debe ser palindromo");
        assertEquals(false, palindrome.isPalindrome("Ocho"), "Ocho no debe ser palindromo");
        assertEquals(false, palindrome.isPalindrome("Veronica"), "Veronica no debe ser palindromo");
    }
}