package my.demo

fun main() {

    println("Digite a base do retângulo: ")
    var base = readln().toDouble()

    println("Digite a altura do retângulo: ")
    var altura = readln().toDouble()

    calculo(base, altura)
}


fun calculo(base: Double, altura: Double) {

    var area = base * altura

    println("A área do retângulo é: $area")
}


//Escreva um algoritmo para ler as dimensões de um retângulo (base
//e altura), calcular e escrever a área do retângulo