import model.Conta
import model.Funcionario
import model.Titular

fun main() {


    var joaozinho = Titular(nome="Small John", cpf="02052554521")
    var maria = Titular(cpf="25252525241", nome="Big Mary")
    var severino = Funcionario(cpf = "123654853652", setor = "Security", salario = 2000.0, nome = "Severino")

    val contaJoao = Conta(titular=joaozinho, saldo=20.0)
    var contaMaria = Conta(titular=maria, saldo=20.0);


    println("${severino.toString()} ${severino.nome} ")

    contaJoao.deposita(1000.0)
    contaMaria.deposita(1000.0)

    println(contaMaria.toString())
    println(contaJoao.toString())

    contaJoao.transfere(28.0, contaMaria)

    println(contaMaria.toString())
    println(contaJoao.toString())



}



























fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo zerado")
        saldo < 0 -> println("saldo negativo")
    }
}


//var c1 = Conta()
//var c2 = Conta()
//var c3 = ContaCorrente()
//
//
//c1.titular = "Onias da Rocha Filho"
//c1.saldo = 8000.0
//
//c2.titular = "Jaguru Dossa"
//c2.saldo = 8000.0
//
//println(c1.toString())
//println(c2.toString())
//println(c3.teste)


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
