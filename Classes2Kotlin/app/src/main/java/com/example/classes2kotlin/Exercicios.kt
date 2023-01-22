package com.example.classes2kotlin

interface Vehicle {
    var velocity: Long
    var acceleration: Long


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
}

class Carro(val id: Int): Vehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 10

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

class Moto(val id: Int): Vehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 5

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
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