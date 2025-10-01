package org.generation; 

public class Palindrome {
	
	public boolean isPalindrome(String text) {
		// 1. Convertir a minúsculas y eliminar espacios para la comparación (ej: "Anita lava la tina")
		String cleanedText = text.toLowerCase().replaceAll("\\s", "");
		
		// 2. Crear un StringBuilder para invertir el texto
		StringBuilder reversedText = new StringBuilder(cleanedText).reverse();
		
		// 3. Comparar el texto original (limpio) con el texto invertido
		return cleanedText.equals(reversedText.toString());
	}
	
}