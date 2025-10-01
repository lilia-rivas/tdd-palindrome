Java Palindrome Validator (Aplicación TDD)
Este repositorio contiene la solución implementada para determinar si una cadena de texto es un palíndromo (una frase que se lee igual de izquierda a derecha que de derecha a izquierda). El proyecto sigue la metodología de Desarrollo Guiado por Pruebas (TDD) como práctica de desarrollo.

🛠️ Tecnologías y Conceptos Clave
El código fue diseñado para demostrar los siguientes conceptos de ingeniería de software:

Test Driven Development (TDD): Se aplicó el ciclo completo Red → Green → Refactor, escribiendo primero los casos de prueba para impulsar la lógica del código.

JUnit 5: Utilizado como framework estándar para la ejecución y validación de las pruebas unitarias.

Programación Orientada a Objetos (POO): Diseño modular con la separación clara de responsabilidades entre la clase de producción (Palindrome) y la clase de prueba (PalindromeTest).

Manejo de Cadenas: La lógica del método isPalindrome gestiona la limpieza de la cadena (ignorando espacios, mayúsculas y minúsculas) antes de la verificación.

📦 Estructura del Entregable
Palindrome.java: Contiene el código fuente de la función public boolean isPalindrome(String text).

PalindromeTest.java: Contiene las pruebas unitarias que validan la funcionalidad y cumplen con el ciclo de TDD.
