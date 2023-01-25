package com.example.fundamentoskotlin

class Exercicios {
}

//Crie uma variável mutável do tipo inteiro.
//  - Inicialize com o valor 6
//  - Altere o valor dela para 5
//  - Imprima o valor
fun exercicio1() {
    var valor: Int = 6
    valor = 5
    println("Resultado do exercicio 1: $valor")
}

//Crie uma variável imutável do tipo inteiro.
//  - Inicialize com o valor 6
//  - Altere o valor dela para 7
//  - Imprima o valor
//  - O que aconteceu?
fun exercicio2() {
    val valor: Int = 6
    // valor = 5 // Dá erro em tempo de build!
    println("Resultado do exercicio 2: Dá erro em tempo de build")
}

//Crie uma condicional que testa se uma variável é par, se for imprimir na tela "O número
//é par" se não deve imprimir "O número é impar"
//  - Teste primeiro utilizando a variável par e verifique o resultado
//  - Faça o mesmo teste agora usando a variável impar
fun exercicio3() {
    val valor: Int = 1
    if (valor % 2 == 0) {
        println("Resultado do exercicio 3: O número é par")
    } else {
        println("Resultado do exercicio 3: O número é impar")
    }
}

//Refaça o exemplo anterior utilizando o comando when para testar o valor da variável
fun exercicio4() {
    val valor: Int = 2
    when{
        valor % 2 == 0 -> println("Resultado do exercicio 4: O número é par")
        else -> println("Resultado do exercicio 4: O número é impar")
    }
}

//Crie um array de inteiro de tamanho 40
//  -Escreva um código que escreva os números de 1 a 39 neste array utilizando o comando for
fun exercicio5() {
    val valores: Array<Int> = Array(40) {0}
    for(i in 1 until valores.size) {
        valores[i - 1] = i
    }
    println("Resultado do exercicio 5: primeiro valor é ${valores[0]} e o ultimo valor é ${valores.lastIndex}")
}

//Crie uma lista de inteiros
//  -Escreva na lista os números de 1 a 99 utilizando o comando for
//  -Crie uma variável do tipo inteiro de nome soma e inicialize ela com o valor 0
//  -Crie um código que percorre a lista que criamos anteriormente e
//que a cada interação, acrescente o valor da posição atual a variável soma.
fun exercicio6e7() {
    val valores: MutableList<Int> = mutableListOf()
    var soma: Int = 0
    for(i in 1..99) {
        valores.add(i)
        soma+=i
    }
    println("Resultado do exercicio 6: $valores")
    println("Resultado do exercicio 7: $soma")
}

fun main() {
    exercicio1()
    exercicio2()
    exercicio3()
    exercicio4()
    exercicio5()
    exercicio6e7()
}