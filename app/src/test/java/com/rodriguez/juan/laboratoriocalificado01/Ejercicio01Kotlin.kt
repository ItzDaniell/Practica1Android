package com.rodriguez.juan.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin{
    /* Función Main Test */
    @Test
    fun main(){
        val result = Anagrama("a", "silent") /* Se llama a la función Anagrama con 2 parametros de texto y el resultado se guarda en la variable result */
        println(result) /* Imprime el valor en consola */
    }
    private fun Anagrama(text1: String, text2:String): Boolean{
        val arrayText1 = text1.lowercase().toCharArray().sorted() /* Convierte el texto 1 en minuscula, en array de caracteres y ordeanado alfabeticamente */
        val arrayText2 = text2.lowercase().toCharArray().sorted() /* Convierte el texto 2 en minuscula, en array de caracteres y ordeanado alfabeticamente */
        return arrayText1 == arrayText2 /* Compara los dos arrays, si son iguales en caracteres entonces retornara "true" y si no "false" */
    }
}
