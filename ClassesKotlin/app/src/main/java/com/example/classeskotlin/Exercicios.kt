package com.example.classeskotlin

fun main() {
    val vehicle = Vehicle("carro")

    println("Veiculo está parado: ${vehicle.actualVelocity()} km/h")

    vehicle.accelerate()

    println("Veiculo está em movimento: ${vehicle.actualVelocity()} km/h")

    vehicle.accelerate()

    println("Veiculo acelerando: ${vehicle.actualVelocity()} km/h")

    vehicle.deAccelerate()

    println("Farol vermelho avistado, veiculo reduzindo velocidade: ${vehicle.actualVelocity()} km/h")

    vehicle.deAccelerate()

    println("Farol vermelho avistado, veiculo parado: ${vehicle.actualVelocity()} km/h")

    vehicle.deAccelerate()

    println("Farol vermelho avistado, veiculo aguardando: ${vehicle.actualVelocity()} km/h")

    vehicle.accelerate()

    println("Farol verde, veiculo acelerando: ${vehicle.actualVelocity()} km/h")
}