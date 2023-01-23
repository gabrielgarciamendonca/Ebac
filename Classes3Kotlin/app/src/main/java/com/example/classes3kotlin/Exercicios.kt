package com.example.classes3kotlin

class Exercicios {
}

//Atividade 1
    //Crie uma função de extensão para o tipo primitivo String,
    //que transforma a string em uma lista de strings, composta
    //por todas as letras da mesma.
fun String.letters(): List<Char> = this.map{it}

//Atividade 2
    //Crie um enum DayOfWeek que contém todos os dias da semana
enum class DayOfWeek(name: String){

    //Associe cada valor do enum a uma string, que deverá conter o dia da semana
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}

//Atividade 3
    //Crie um singleton chamado UtilityHelper
object UtilityHelper {
    //Crie uma propriedade privada do tipo do enum criado na
    //atividade anterior chamada currentDay

    //Inicialize o valor de currentDay com SUNDAY
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    //Crie um método setCurrentDay, que altera o valor da
    //propriedade currentDay
    fun setCurrentDay(newCurrent: DayOfWeek) {
        this.currentDay = newCurrent
    }

    //Crie um método isWeekend que retorna verdadeiro quando o
    //valor de currentDay é sabado ou domingo
    fun isWeekend(): Boolean  = this.currentDay == DayOfWeek.SATURDAY || this.currentDay == DayOfWeek.SUNDAY
}

fun main() {
    //Crie uma string e utilizando a extensão criada imprima todas
    //as letras da string
    val myString = "Estou começando a adorar Kotlin"
    myString.letters().forEach{
        println(it)
    }

//Atividade 4
    //Pegue uma instancia do Singleton que criamos anteriormente
    val utility1 = UtilityHelper

    //Use o método setCurrentDay e altere o dia da semana para segunda feira
    utility1.setCurrentDay(DayOfWeek.MONDAY)

    //Chame o método isWeekend e confira se ele está retornando false
    println("segunda feira é final de semana: ${utility1.isWeekend()}")

    //Pegue uma nova instancia do Singleton, e usando setCurrentDay altere o dia atual para domingo
    val utility2 = UtilityHelper
    utility2.setCurrentDay(DayOfWeek.SUNDAY)

    //Chame o método isWeekend e confira se ele está retornando true
    println("domingo é final de semana: ${utility2.isWeekend()}")
}