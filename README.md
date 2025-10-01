🔎 Palindrome Validator en Java
Este proyecto es una implementación funcional de una clase para validar palíndromos, diseñada específicamente bajo la metodología Test Driven Development (TDD) como práctica de desarrollo profesional.

🎯 Objetivo del Proyecto
El objetivo principal fue aplicar el ciclo de TDD (Red, Green, Refactor) para crear una función robusta en Java que determine si una palabra o frase se lee igual de izquierda a derecha que de derecha a izquierda.

La función maneja las siguientes reglas de validación:

✅ Ignora espacios ("Anita lava la tina").

✅ Ignora mayúsculas y minúsculas ("Oso" es igual a "oso").

🛠️ Stack y Metodología
Componente	Uso
Java	Lenguaje principal para la lógica de la función.
JUnit 5	Framework de pruebas utilizado para escribir los casos de validación.
TDD	Se aplicó el ciclo Red → Green → Refactor para guiar la implementación.
Manejo de Cadenas	Se utilizan métodos de String y StringBuilder para limpiar e invertir la cadena de forma eficiente.

📂 Estructura del Entregable
El proyecto está dividido en dos clases que cumplen con los principios de POO (Separación de Responsabilidades):

1. Palindrome.java (El Código Fuente)
Contiene el método public boolean isPalindrome(String text), que es el código de producción que contiene la lógica de limpieza y comparación.

2. PalindromeTest.java (El Archivo de Pruebas)
Contiene los métodos de prueba de JUnit, utilizando:

@BeforeEach: Para asegurar que una nueva instancia de la clase Palindrome se cree antes de cada prueba.

assertEquals: Para validar los casos de éxito (true) y los casos de falla (false).

🧑‍💻 Instalación y Ejecución de Pruebas
Para validar el código, simplemente ejecute la clase PalindromeTest con su plugin de JUnit dentro de su IDE (como Eclipse o IntelliJ).

La ejecución de PalindromeTest debe mostrar que todos los casos de prueba son VERDES, confirmando que la función es robusta y cumple con los requisitos del TDD.
