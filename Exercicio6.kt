package my.demo

fun main() {
    println("Digite o valor em Dólar: ")
    val dolar = readln().toDouble()
    var real: Double = dolar * 4.69
    println("A conversão de US$ $dolar para real é de: R$ $real")
}



//Crie um algoritmo que lê um valor real em dólar, e converte o valor
//para reais. Considere a cotação do dolar atual