package com.dicoding.kotlin.KotlinGenerics



abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)


//fun main() {
//    val car = Car(200)
//    val motorCycle = MotorCycle(100)
//    var vehicle: Vehicle = car
//    vehicle = motorCycle
//}

fun main() {
    val carList = listOf(Car(100) , Car(120))
    val vehicleList = carList

    println(vehicleList)
}