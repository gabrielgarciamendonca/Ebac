package com.example.classeskotlin

class Vehicle (model: String){
    private var velocity: Long
    private var acceleration: Long
    private var model: String

    init {
        this.velocity = 0
        this.acceleration = 10
        this.model = model
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
}