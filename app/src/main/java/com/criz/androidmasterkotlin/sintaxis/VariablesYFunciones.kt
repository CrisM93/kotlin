package com.criz.androidmasterkotlin.sintaxis

val age: Int = 30 //variable de clase

fun main() {
    showMyName()
    showMyAge(40)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyName() {
    println("Me llamo CrisDevs")
}

fun showMyAge(currentAge: Int = 30) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber



fun variablesAlfaNumericas() {
    /**
     * Variables Alfanuméricas
     */

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "Cris suscribete"
    val stringExample2 = "Cris"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example123: String = age.toString()
}

fun variablesBoolean() {
    /**
     * Variables booleanas
     */

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
}

fun variablesNumericas() {
    /**
     * Variables Numéricas
     * los val no pueden ser reasignados
     */

    //Int -2,147,483,647 a 2,147,483,647
    var age2: Int = 30 //ocupamos var para reasiganar o ser cambainte el valor
    age2 = 29

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30
    val example2: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.3123123

    println("Sumar:")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("División")
    println(age / age2)

    println("Módulo")
    println(age % age2)

    var exampleSuma = age + floatExample
}