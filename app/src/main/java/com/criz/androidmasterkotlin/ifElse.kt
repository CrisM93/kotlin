package com.criz.androidmasterkotlin

fun main() {
    Basico("Cri")
    Basico("Cris")
    anidadoBasico("cat")
    ifBoolean()
    ifInt(15)
    ifMultiple()
    ifMultipleOr()
}

fun Basico(name: String) {

    if (name == "Cris") {
        println("Soy $name")
    } else {
        println("No es Cristian")
    }

}

fun anidadoBasico(name: String) {
    if (name.equals("dog")) {
        println("Es un perro")
    } else if (name.equals("cat")) {
        println("Es un gato")
    } else if (name.equals("bird")) {
        println("Es un pajaro")
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = true
    if (!soyFeliz) {
        println("Soy feliz $soyFeliz")
    }
}

fun ifInt(age: Int) {
    if (age >= 18) {
        println("Soy mayor de 18")
    } else {
        println("Los siento eres menor que 18")
    }

}

fun ifMultiple(){
    var age=18
    var permission =true
    var imHappy =true

    if (age>=18&&permission==true&&imHappy==true){
        println("Puedo seguir")
    }

}

fun ifMultipleOr(){

}