package com.criz.androidmasterkotlin.sintaxis

fun main(){
    var name:String? = "Cristian"

    println(name?.get(3) ?:  "Es nullo wey")// ? si no es nulo dame el valor e
}