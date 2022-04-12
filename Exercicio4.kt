package my.demo

fun main() {

    println("Digite a temperatura em ºC: ")
    val temperatura = readln().toDouble()
    grauCelsius(temperatura)
}

fun grauCelsius(temperatura: Double) {

    when(temperatura){
        in 0.0 .. 18.0 -> println("O clima é frio")
        in 19.0 .. 23.0 -> println("O clima é agradável")
        in 24.0 .. 35.0 -> println("O clima é quente")
        else -> println("O clima é muito quente")
    }
}


//Crie um algoritmo que, dada uma temperatura em graus célsius,
//exiba uma mensagem informando o tipo do clima, de acordo com as seguintes condições:
//a. se a temperatura estiver até 18 graus, o clima é frio;
//b. se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
//c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
//d. se a temperatura estiver acima de 35 graus, o clima é muito quente