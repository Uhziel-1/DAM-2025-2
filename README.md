# Tarea S1: Fundamentos de Kotlin
Este proyecto es una colección de ejercicios básicos para demostrar el entendimiento de los conceptos fundamentales de Kotlin, ejecutados en una aplicación de Android. Los resultados de cada ejercicio se imprimen en el Logcat de Android Studio.

## 1. Variables y Constantes
Se declararon constantes con const val, constantes inmutables con val y variables mutables con var, usando tipos explícitos para mayor claridad.

**Reflexión: ¿Por qué no podemos reasignar un val?**
Porque val declara una referencia inmutable. Una vez que se le asigna un valor, no se puede cambiar, lo que promueve la seguridad y la predictibilidad en el código.

**Evidencia:**

![Evidencia de Variables y Constantes](img/Captura%20de%20pantalla%202025-08-15%20230105.png)

## 2. Tipos Numéricos
Se utilizaron los principales tipos de datos numéricos de Kotlin: Int, Long, Float y Double, aplicando los sufijos L y f cuando fue necesario.

**Reflexión: ¿Cuándo usar Float vs. Double?**
Usa Double por defecto para números decimales por su mayor precisión (64 bits). Usa Float (32 bits) solo si tienes restricciones de memoria específicas, como en gráficos por computadora o al manejar grandes arrays de números.

**Evidencia:**

![Evidencia de Tipos Numéricos](img/Captura%20de%20pantalla%202025-08-15%20230118.png)

## 3. if como Expresión
Se implementó una función calificar(nota) donde la estructura if-else se utiliza como una expresión que devuelve directamente un valor (String), haciendo el código más conciso y funcional.

**Evidencia:**

![Evidencia de if como Expresión](img/Captura%20de%20pantalla%202025-08-15%20230136.png)

## 4. when con Rangos
Se creó una función clasificarEdad(edad) que utiliza la expresión when con rangos (in 0..12) para clasificar una edad en diferentes categorías de forma legible y eficiente.

**Evidencia:**

![Evidencia de when con Rangos](img/Captura%20de%20pantalla%202025-08-15%20230147.png)

## 5. Bucles while y for
Se generó la tabla de multiplicar de un número usando tanto un bucle while como un bucle for para mostrar dos enfoques diferentes para la misma tarea de iteración.

**Reflexión: ¿Qué enfoque es más legible?**
El bucle for suele ser más legible y seguro para iterar un número conocido de veces, ya que la inicialización, la condición y el incremento están en una sola línea (for (i in 1..12)), reduciendo el riesgo de errores.

**Evidencia:**

![Evidencia de bucles while y for](img/Captura%20de%20pantalla%202025-08-15%20230223.png)

## 6. Colecciones
Se utilizó una data class para definir un Producto y se manejó una lista inmutable de ellos. Se aplicaron funciones de alto orden como filter, map, sumOf y count para procesar y analizar los datos de la colección.

**Evidencia:**

![Evidencia de Colecciones](img/Captura%20de%20pantalla%202025-08-15%20230332.png)

## 7. Null Safety en Práctica
Se implementó una función segura aEnteroSeguro que convierte un String a Int? usando toIntOrNull(). Se demostró el uso del operador Elvis ?: para proporcionar un valor por defecto en caso de que la conversión falle, evitando así errores NullPointerException.

**Evidencia:**

![Evidencia de Null Safety](img/Captura%20de%20pantalla%202025-08-15%20230240.png)

## 8. Funciones Puras
Se crearon dos funciones puras: esPrimo y fibonacci. Estas funciones dependen únicamente de sus parámetros de entrada y no tienen efectos secundarios, lo que las hace predecibles y fáciles de probar.

**Evidencia:**

![Evidencia de Funciones Puras](img/Captura%20de%20pantalla%202025-08-15%20230258.png)

## 9. Clases vs. data class
Se comparó una class regular Persona con una data class Usuario. Se demostró que las data class proporcionan automáticamente métodos útiles como equals() (permitiendo la comparación estructural con ==) y copy(), simplificando enormemente el manejo de objetos de datos.

**Evidencia:**

![Evidencia de Clases vs data class](img/Captura%20de%20pantalla%202025-08-15%20230315.png)

## 10. Extensiones y operaciones encadenadas
Se implementaron funciones de extensión para las clases List y String, añadiendo nuevas capacidades (media() y capitalizarPrimera()) sin necesidad de heredar de ellas. Esto demuestra cómo Kotlin permite "extender" clases existentes de manera limpia. Además, se aplicaron operaciones encadenadas en colecciones, un patrón que mejora la claridad del código al crear una secuencia de procesamiento de datos legible.

**Reflexión: ¿Cómo mejoran la legibilidad las operaciones encadenadas?**
Al encadenar funciones como filter, map o sum, se crea un flujo de datos que se lee como una receta: "toma esta lista, luego fíltrala, y finalmente súmala". Este estilo declarativo se enfoca en qué quieres lograr, no en cómo hacerlo (bucles, variables temporales), resultando en un código más intuitivo y menos propenso a errores.

**Evidencia:**

![Evidencia de Extensiones y operaciones encadenadas](img/Captura%20de%20pantalla%202025-08-18%20212115.png)

## 11. Mini reporte "declarativo"
Se realizó un pequeño reporte sobre una lista de números del 1 al 20. Utilizando un enfoque puramente declarativo, se encadenaron funciones de colección para obtener tres resultados clave:

1. Una nueva lista conteniendo solo los números pares, obtenida con filter.
2. La suma total de esos números pares, calculada con sum.
3. El promedio de los mismos, obtenido con average.

Este ejercicio resalta la potencia y elegancia del estilo funcional en Kotlin para manipular colecciones de datos de forma eficiente y expresiva.

**Evidencia:**

![Evidencia de Mini reporte declarativo](img/Captura%20de%20pantalla%202025-08-18%20212130.png)
