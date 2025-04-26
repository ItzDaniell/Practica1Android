package com.rodriguez.juan.laboratoriocalificado01

import org.junit.Test

class Ejercicio02Kotlin(){
    /* Función Main Test */
    @Test
    fun main(){
        val result = VowelCount("a") /* Se llama a la función VowelCount de 1 parametro de texto y el resultado se guarda en la variable result */
        println("Cantidad de vocales que tiene el texto: $result") /* Imprime el valor en consola */
    }

    /* Funcion privada VowelCount de 1 parametro para el conteo de vocales y devuelve un valor entero */
    private fun VowelCount(text1: String):Int {
        val arrayText1 = text1.lowercase().toCharArray() /* Convierte el texto en minuscula y en un array de caracteres */
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u') /* Array de vocales en minuscula */
        var count = 0 /* Variable que almacena la cantidad de vocales */

        /* Se inicia un bucle para que un caracter recorra el array de caracteres "arrayText1" */
        for (char in arrayText1){
            if (char in vowels) ++count /* Si el caracter es una vocal, incrementa el contador */
        }
        return count /* Retorna el contador */
    }
}