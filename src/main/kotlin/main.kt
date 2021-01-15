import model.Titular
import testes.TestaLoops

fun main() {

    var t1 = Titular()

    t1.nome = "Onias da Rocha Filho"
    t1.saldo = 8000.0

    println(t1.toString())

    println("sacando 200 reais")

    t1.saca(800.00)

    println(t1.toString())

    println("depositando 9000")

    println(t1.toString())


}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo zerado")
        saldo < 0 -> println("saldo negativo")
    }
}

//
//
//
//
//println("Welcome to bytebank!")
//
//val titular: String = "Onias da Rocha"
//val numeroConta: Int = 1000
//var saldo: Double = 50.0
//saldo = 100 + 2.0
//saldo -= 1800
//var conta: Int = 12;
//
//TestaLoops().decrease(conta);
//
