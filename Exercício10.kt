package my.demo

fun main() {

    println("Digite um número inteiro: ")
    val numero = readln().toInt()

    resultado(numero)

}

fun resultado(numero: Int){
    var numeroSucessor = numero +1

    println("O sucessor do $numero é: $numeroSucessor")

}

//Crie um algoritmo que leia um número inteiro e mostre seu sucessor.