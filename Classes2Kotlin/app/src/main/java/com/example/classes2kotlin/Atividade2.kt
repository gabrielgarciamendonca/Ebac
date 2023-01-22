package com.example.classes2kotlin

interface IVehicle {
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

class Carro1(val id: Int): IVehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 10

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

class Moto1(val id: Int): IVehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 5

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

fun main() {
    val carro = Carro1(1)
    val moto = Moto1(2)
    carro.accelerate()
    carro.accelerate()
    println(carro)
    moto.accelerate()
    moto.accelerate()
    println(moto)
}