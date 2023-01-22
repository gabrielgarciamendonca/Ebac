package com.example.classes2kotlin

abstract class Vehicle (private val id: Int){
    private var velocity: Long
    abstract var acceleration: Long

    init {
        this.velocity = 0
    }

    fun accelerate() {
        this.velocity += this.acceleration
    }

    fun deAccelerate() {
        var newVelocity = this.velocity - this.acceleration
        if (newVelocity < 0) {
            newVelocity = 0
        }
        this.velocity = newVelocity
    }

    fun actualVelocity () = this.velocity

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

class Carro(id: Int): Vehicle(id) {
    override var acceleration: Long = 10
}

class Moto(id: Int): Vehicle(id) {
    override var acceleration: Long = 5
}

fun main() {
    val carro = Carro(1)
    val moto = Moto(2)
    carro.accelerate()
    carro.accelerate()
    println(carro)
    moto.accelerate()
    moto.accelerate()
    println(moto)
}