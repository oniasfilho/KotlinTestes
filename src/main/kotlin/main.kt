fun main() {

    println("Welcome to bytebank!")

    val titular: String = "Onias da Rocha"
    val numeroConta: Int = 1000
    var saldo: Double = 50.0
    saldo = 100 + 2.0
    saldo -= 1800
    var conta: Int = 12;

    TestaLoops().decrease(conta);


}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo zerado")
        saldo < 0 -> println("saldo negativo")
    }
}





