package com.example.funcoeskotlin

class Exercicios {
}

//EXERCICIO 1
//Crie uma função que receba dois números inteiros de parametro e
//retorne o resultado da soma.
fun soma (parcela1: Int, parcela2: Int): Int {
    return parcela1 + parcela2
}

//EXERCICIO 2
//Crie uma função compacta que receba dois números inteiros de parametro e
//retorne o resultado da soma.
fun somaCompacta (parcela1: Int, parcela2: Int): Int = parcela1 + parcela2

//EXERCICIO 3
//Crie uma função calculadora que recebe
//dois inteiros de parametro e um terceiro parametro do tipo função.
//Esta função de parametro deve receber dois inteiros de parametro
// e retornar um inteiro
fun calculadora(parcela1: Int, parcela2: Int, operador: (Int, Int) -> Int): Int {
    return operador(parcela1, parcela2)
}

val produto = {fator1:Int, fator2:Int -> fator1*fator2}

//EXERCICIO 4
//Crie uma lista com os números inteiros de 1 a 99
fun operandoLista() {
    val lista: MutableList<Int> = mutableListOf()
    for (i in 1 until 100) {
        lista.add(i)
    }
    val listaPares = lista.filter{
        it % 2 == 0
    }
    println("resultadoExercicio4: $listaPares")
}

//EXERCICIO 5
//Crie uma lista de string com 4 nomes
fun operandoLista2() {
    val listaNomes: List<String> = listOf("Gabriel", "Eduardo", "Paulo", "Paula")
    val olaNomes = listaNomes.map{
        "Olá $it!"
    }
    println("resultadoExercicio5parte1: $olaNomes")
    println("resultadoExercicio5parte2")
    olaNomes.forEach{
        println("\t$it")
    }
}

fun main() {
    val resultadoExercicio1 = soma(2, 5)
    println("resultadoExercicio1: $resultadoExercicio1")
    val resultadoExercicio2 = somaCompacta(7, 5)
    println("resultadoExercicio2: $resultadoExercicio2")
    val resultadoExercicio3parte1 = calculadora(7, 5, ::soma)
    println("resultadoExercicio3parte1: $resultadoExercicio3parte1")
    val resultadoExercicio3parte2 = calculadora(5, 5, produto)
    println("resultadoExercicio3parte2: $resultadoExercicio3parte2")
    operandoLista()
    operandoLista2()
}