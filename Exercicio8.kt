package my.demo

fun main() {


    println("Digite o valor de x: ")
    var x = readln().toInt()

    println("Digite o valor de y: ")
    var y = readln().toInt()

    troca(x, y)

}

    fun troca(x: Int, y: Int) {

        var x = x + y
        var y = x - y
        x = x - y

            println("O valor de x é: $x")
            println("O valor de y é: $y")
        }


//Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor
//destas variáveis. Isto é, x deve ficar com o valor de y e y deve ficar
//com o valor os valore de x. Mostres depois da troca.