package com.ucer.tarea_s1

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    companion object {
        const val APP_NAME = "TAREA S1"
        const val APP_VERSION = "v1.0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        println("====== TAREA SESIÓN 1 ======")
        variablesYConstantes()
        tiposNumericos()
        ifComoExpresion()
        whenConRangos()
        buclesWhileYFor()
        colecciones()
        nullSafetyEnPractica()
        funcionesPuras()
        clasesYDataClass()
    }

    /**
     * **Variables y constantes**
     *
     * Implementa constantes con const val para APP_NAME y APP_VERSION.
     *
     * Declara 2 variables con var y 2 constantes con val usando tipos
     * explícitos.
     *
     * Reflexiona: ¿Por qué no podemos reasignar un val?
     *
     */
    private fun variablesYConstantes() {
        val nombre: String = "Juan"
        val edad: Int = 15
        var curso_actual = "Desarrollo de Aplicaciones Distribuidas"
        var tiempo_curso_min = 60

        println("==== Variables y Constantes ====")
        println("== 2 Val ==")
        println("Nombre: " + nombre)
        println("Edad: " + edad)
        println("== 2 Var ==")
        println("Curso Actual: " + curso_actual)
        println("Tiempo del Curso en Minutos: " + tiempo_curso_min)

        println("¿Por qué no podemos reasignar un val? Porque val es Inmutable")
    }

    /**
     * **Tipos numéricos**
     *
     * Trabaja con Int, Long, Float y Double.
     *
     * Usa los sufijos L y f cuando corresponda.
     *
     * Compara: ¿Cuándo deberías usar Float vs Double?
     *
     * Respuesta rápida: Usa Double por defecto para números decimales por su
     * mayor precisión (64 bits). Usa Float (32 bits) solo si tienes restricciones
     * de memoria específicas, como en gráficos o grandes arrays de números.
     */
    private fun tiposNumericos() {
        var entero: Int = 50
        var enteroLargo: Long = -520L
        var decimal: Float = 5f
        var decimalLargo: Double = 0.56

        println("==== Tipos Numéricos ====")
        println("Entero: " + entero)
        println("Entero Largo: " + enteroLargo)
        println("Decimal: " + decimal)
        println("Decima Largo: " + decimalLargo)
    }

    /**
     * **if como expresión**
     *
     * Crea fun calificar(nota: Int): String que retorne "Aprobado" o
     * "Desaprobado".
     *
     * Utiliza el if como expresión que devuelve un valor.
     *
     * Prueba con al menos 5 valores diferentes.
     */
    private fun ifComoExpresion() {
        println("==== if como expresión ====")
        println(calificar(-9))
        println(calificar(5))
        println(calificar(13))
        println(calificar(28))
        println(calificar(20))
    }

    fun calificar(nota: Int): String {
        val resultado = if (nota < 0) {
            "La nota no puede ser negativo."
        } else if (nota < 13) {
            "Desaprobado"
        }else if (nota <= 20) {
            "Aprobado"
        } else {
            "La nota maxima es 20."
        }
        return "Nota $nota: $resultado"
    }

    /**
     * **when con rangos**
     *
     * Implementa fun clasificarEdad(edad: Int):
     * String usando rangos:
     *
     * - Niño: 0-12 años
     *
     * - Adolescente: 13-17 años
     *
     * - Adulto: 18-59 años
     *
     * - Mayor: 60+ años
     *
     * Utiliza when con la sintaxis in 0..12 para
     * verificar rangos.
     */
    private fun whenConRangos() {
        println("==== when con rangos ====")
        println(clasificarEdad(9))
    }

    fun clasificarEdad(edad: Int): String {
        return "Edad $edad: " + when (edad) {
            in Int.MIN_VALUE..-1 -> "La edad no puede ser negativa"
            in 0..12 -> "Niño"
            in 13..17 -> "Adolescente"
            in 18..59 -> "Adulto"
            else -> "Mayor"
        }
    }

    /**
     * **Bucles while y for**
     *
     * Genera la tabla de multiplicar de un
     * número:
     *
     * - Una implementación con while
     *
     * - Otra implementación con for
     *
     * Compara: ¿Qué enfoque te parece más
     * legible y por qué?
     *
     * Respuesta rápida: El bucle for suele ser más legible y seguro para
     * iterar un número conocido de veces (como una tabla de multiplicar),
     * ya que la inicialización, la condición y el incremento están en una
     * sola línea (for (i in 1..12)), reduciendo el riesgo de errores como
     * bucles infinitos.
     */
    private fun buclesWhileYFor() {
        var tabla_numero = 5
        var contador = 1
        var cantidad = 12
        println("==== Bucles while y for ====")
        println("== Tabla del $tabla_numero con While ==")
        while (contador <= cantidad) {
            println("Tabla del $tabla_numero: ${tabla_numero*contador}")
            contador++
        }
        println("== Tabla del $tabla_numero con For ==")
        for (i in 1..cantidad) {
            println("Tabla del $tabla_numero: ${tabla_numero*i}")
        }
    }

    /**
     * **Colecciones**
     *
     * Crea data class Producto con campos id,
     * nombre, precio y stock.
     *
     * Genera una lista inmutable con 5
     * productos y aplica:
     *
     * - filter + map para obtener nombres
     *
     * - sumOf para calcular total
     *
     * - count para contar productos sin stock
     */
    private fun colecciones() {
        println("==== Colecciones ====")
        val productos = listOf(
            Producto(1, "Laptop", 1200.0, 5),
            Producto(2, "Mouse", 25.0, 0),
            Producto(3, "Teclado", 75.0, 10),
            Producto(4, "Monitor", 300.0, 2),
            Producto(5, "Webcam", 50.0, 0)
        )
        val nombresDeProductos = productos.filter { it.stock > 0 }.map { it.nombre }
        println("Nombre de los productos con stock: $nombresDeProductos")
        val totalPrecio = productos.sumOf { it.precio * it.stock }
        println("Total precio de los productos en stock: $totalPrecio")
        val productoSinStock = productos.count { it.stock == 0 }
        println("Cantidad de productos sin stock: $productoSinStock")
    }

    data class Producto(val id: Long, var nombre: String, var precio: Double, var stock: Int)

    /**
     * **Null safety en práctica**
     *
     * Implementa fun aEnteroSeguro(s: String): Int?
     *
     * - Usa toIntOrNull() para convertir strings a enteros
     *
     * - Demuestra el uso del operador Elvis (?:) para proporcionar valores por defecto
     *
     * Prueba con valores válidos e inválidos para demostrar la seguridad frente a nulos.
     */
    private fun nullSafetyEnPractica() {
        println("==== Null safety ====")
        val string = "156"
        var valor: Int? = aEnteroSeguro(string) ?: 0
        println("El valor es: $valor")

        val stringInvalido = "hola"
        val valor2: Int = aEnteroSeguro(stringInvalido) ?: -1 // Usamos -1 como default
        println("El valor de '$stringInvalido' es: $valor2")
    }

    fun aEnteroSeguro(s: String): Int? {
        return s.toIntOrNull()
    }

    /**
     * **Funciones puras**
     *
     * Implementa:
     *
     * - fun esPrimo(n: Int): Boolean - iterando del 2 a la raíz cuadrada de n
     *
     * - fun fibonacci(n: Int): List - generando las primeras n posiciones
     *
     * Prueba la secuencia de Fibonacci para n=10 y verifica la primalidad de al menos 3 números.
     */
    private fun funcionesPuras() {
        println("==== Funciones Puras ====")

        println("Finbonacci de 10: ${fibonacci(10)}")

        println("¿5 es primo?: ${esPrimo(5)}")
        println("¿18 es primo?: ${esPrimo(18)}")
        println("¿29 es primo?: ${esPrimo(29)}")
    }

    fun esPrimo(n: Int): Boolean {
        if (n <= 1) {
            return false
        }
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    fun fibonacci(n: Int): List<Int> {
        if (n <= 0) {
            return emptyList()
        }
        if (n == 1) {
            return listOf(0)
        }
        val resultado = MutableList(n) { 0 }
        resultado[1] = 1
        for (i in 2 until n) {
            resultado[i] = resultado[i - 1] + resultado[i - 2]
        }
        return resultado
    }

    /**
     * **Clases vs data class**
     *
     * Crea una clase regular Persona con:
     *
     * - Propiedades: nombre y edad
     *
     * - Métodos: cumplirAnios() y presentacion()
     *
     * Compárala con un data class Usuario demostrando las ventajas de copy() y comparación con ==
     */
    private fun clasesYDataClass() {
        val persona1 = Persona("Carlos", 17)
        val persona2 = Persona("Carlos", 17)
        val usuario1 = Usuario("Frank", 25)
        val usuario2 = Usuario("Frank", 25)

        println("==== Clases vs data class ====")

        persona1.presentacion()
        persona1.cumplirAnios()

        println("Usuario original: $usuario1")

        // Creamos una copia y cambiamos solo la edad
        val usuarioNuevo = usuario1.copy(edad= 20)
        println("Usuario nuevo con copy: $usuarioNuevo")

        // La comparación de personas dará 'false' porque son objetos diferentes en memoria
        println("¿Son iguales las personas (class)? ${persona1 == persona2}")
        // La comparación de usuarios dará 'true' porque sus propiedades son idénticas
        println("¿Son iguales los usuarios (data class)? ${usuario1 == usuario2}")
    }

    class Persona(val nombre: String, var edad: Int) {
        fun presentacion() {
            println("Hola, me llamo $nombre y tengo $edad años.")
        }
        fun cumplirAnios() {
            edad++
            println("$nombre acaba de cumplir $edad años.")
        }
    }

    data class Usuario(val nombre: String, val edad: Int)
}
