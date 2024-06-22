package com.criz.androidmasterkotlin

val ageCris: Int = 20
fun main() {
    print("Hola mundo desde kotlin \n")
    val names: String = "Yovani \n"
    val i: Int = 5
    print(names)
    val age: Int = 30
    val age2: Int = 50

    var age3 = 34
    age3 = 45
    var nameSpace = "Cristian"
    nameSpace = "Cristian $names"
    //println(nameSpace)

    val exampless: String = age.toString()
    //println(exampless)

    Sumar()
    Sum(3, 4)
    Res(8, 9)
    Nombre("Claudia")
    var substraccion = subtract(500.1, 200.2)
    println("La subs es $substraccion")
}

fun Sumar() {
    var num1 = 40
    var num2 = 50
    println(num1 + num2)
}

fun Sum(num1: Int, num2: Int) {
    var suma = num1 + num2
    println("La suma es $suma")
}

fun Res(num1: Int, num2: Int) {
    var rsta = num1 + num2
    println("La resta es  $rsta")
}

fun Nombre(nombre: String) {
    println(nombre)
}

fun subtract(num1: Double, num2: Double): Double {
    return num1-num2
}