package com.criz.androidmasterkotlin

fun main() {
    //getSemester(1)
    //result(true)
    //print(secondSemester(7))
    var name:String ="Cris"

    println(name[0])
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("holiwi")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")  
        7, 8, 9 -> {
            println("Tercer trimestre")
            println("Tercer trimestre")
            println("Tercer trimestre")
        }

        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("No es un mes valido")
    }
}

fun getSemester(month: Int) {
    when (month) {
        in 1..6 -> println("Primer trimestre")
        in 7..12 -> {
            println("Tercer trimestre")
            println("Tercer trimestre")
            println("Tercer trimestre")
        }

        else -> println("No es un mes valido")
    }
}

fun secondSemester(month: Int): String {
    return when (month) {
        in 1..6 -> return "Primer semestre"
        in 7..12 -> return "Segundo semestre"
        !in 1..12 -> return "Semestre no valido"
        else -> return "dado"
    }

}