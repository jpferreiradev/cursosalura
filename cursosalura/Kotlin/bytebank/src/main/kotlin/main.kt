fun main() {

    println("Bem vindo ao bytebank")
    val contaJP = Conta()
    contaJP.titular = "Alex"
    contaJP.numero = 1000
    contaJP.saldo = 200.0


    val contaThay = Conta()
    contaThay.titular = "Thay"
    contaThay.numero = 1001
    contaThay.saldo = 300.0


//    println(contaJP.titular)
//    println(contaJP.numero)
//    println(contaJP.saldo)

//    println(contaThay.titular)
//    println(contaThay.numero)
//    println(contaThay.saldo)

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    // Considerando o numero X

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaThaynara = Conta()
    contaThaynara.titular = "Thay"
    contaJoao.titular = "JP2"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta thay: ${contaThaynara.titular}")

    println(contaJoao)
    println(contaThaynara)

}

fun testaLacos(){

    var i = 0
    while (i < 5) {
        val titular: String = "JP $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1 ) {
        val titular: String = "JP $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println(" Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

