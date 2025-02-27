package com.criz.androidmasterkotlin.sintaxis

fun main() {
    var name: String = "AristiDevs"
    var name1: String = "AristiDevs"
    var name2: String = "AristiDevs"
    var name3: String = "AristiDevs"

    //Indice 0-6
    //Tamaño 8
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays[0])
    println(weekDays.size)

    //Tamaños
    if (weekDays.size >= 8) {
//        println(weekDays[7])
    } else {
//        println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz lunes"
//    println(weekDays[0])

//muchas formas de recorrer una array
    //Bucles para Arrays
    for(position in weekDays.indices){ //posicion es el indice
       println("[$position] "+weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
//        println("La posición $position, contiene $value")
    }

    for (item in weekDays){
        println("Ahora es $item")
    }

    weekDays.forEach { it }
}