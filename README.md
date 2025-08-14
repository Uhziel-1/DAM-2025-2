# Tarea S1: Fundamentos de Kotlin
Este proyecto es una colección de ejercicios básicos para demostrar el entendimiento de los conceptos fundamentales de Kotlin, ejecutados en una aplicación de Android. Los resultados de cada ejercicio se imprimen en el Logcat de Android Studio.

## 1. Variables y Constantes
Se declararon constantes con const val, constantes inmutables con val y variables mutables con var, usando tipos explícitos para mayor claridad.

**Reflexión: ¿Por qué no podemos reasignar un val?**
Porque val declara una referencia inmutable. Una vez que se le asigna un valor, no se puede cambiar, lo que promueve la seguridad y la predictibilidad en el código.

**Evidencia:**

## 2. Tipos Numéricos
Se utilizaron los principales tipos de datos numéricos de Kotlin: Int, Long, Float y Double, aplicando los sufijos L y f cuando fue necesario.

**Reflexión: ¿Cuándo usar Float vs. Double?**
Usa Double por defecto para números decimales por su mayor precisión (64 bits). Usa Float (32 bits) solo si tienes restricciones de memoria específicas, como en gráficos por computadora o al manejar grandes arrays de números.

**Evidencia:**

## 3. if como Expresión
Se implementó una función calificar(nota) donde la estructura if-else se utiliza como una expresión que devuelve directamente un valor (String), haciendo el código más conciso y funcional.

**Evidencia:**

## 4. when con Rangos
Se creó una función clasificarEdad(edad) que utiliza la expresión when con rangos (in 0..12) para clasificar una edad en diferentes categorías de forma legible y eficiente.

**Evidencia:**

## 5. Bucles while y for
Se generó la tabla de multiplicar de un número usando tanto un bucle while como un bucle for para mostrar dos enfoques diferentes para la misma tarea de iteración.

**Reflexión: ¿Qué enfoque es más legible?**
El bucle for suele ser más legible y seguro para iterar un número conocido de veces, ya que la inicialización, la condición y el incremento están en una sola línea (for (i in 1..12)), reduciendo el riesgo de errores.

**Evidencia:**

## 6. Colecciones
Se utilizó una data class para definir un Producto y se manejó una lista inmutable de ellos. Se aplicaron funciones de alto orden como filter, map, sumOf y count para procesar y analizar los datos de la colección.

**Evidencia:**

## 7. Null Safety en Práctica
Se implementó una función segura aEnteroSeguro que convierte un String a Int? usando toIntOrNull(). Se demostró el uso del operador Elvis (?:) para proporcionar un valor por defecto en caso de que la conversión falle, evitando así errores NullPointerException.

**Evidencia:**

## 8. Funciones Puras
Se crearon dos funciones puras: esPrimo y fibonacci. Estas funciones dependen únicamente de sus parámetros de entrada y no tienen efectos secundarios, lo que las hace predecibles y fáciles de probar.

**Evidencia:**

## 9. Clases vs. data class
Se comparó una class regular Persona con una data class Usuario. Se demostró que las data class proporcionan automáticamente métodos útiles como equals() (permitiendo la comparación estructural con ==) y copy(), simplificando enormemente el manejo de objetos de datos.

**Evidencia:**
