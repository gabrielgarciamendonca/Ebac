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

class Carro(val id: Int): IVehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 10

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

class Moto(val id: Int): IVehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 5

    override fun toString() = "id: $id, Velocidade: $velocity, Aceleração: $acceleration"
}

class VehicleFactory {
    fun createVehicle(type: Int, id: Int): IVehicle {
        return when(type) {
            1 -> Carro(id)
            else -> Moto(id)
        }
    }
}

fun main() {
    val vehicleFactory = VehicleFactory()
    val vehicles: MutableList<IVehicle> = mutableListOf()

    //Criando o carro
    vehicles.add(vehicleFactory.createVehicle(1, 10))

    //Criando a moto
    vehicles.add(vehicleFactory.createVehicle(0, 11))

    vehicles.forEach{
        it.accelerate()
        it.accelerate()
        it.accelerate()
        println(it)
    }
}