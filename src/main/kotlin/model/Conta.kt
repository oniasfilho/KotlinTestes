package model

open class Conta(titular:Titular, saldo:Double) {

    var titular:Titular = titular
    var numero = (Math.random() * 50).toInt();
    var saldo = saldo

    fun deposita(valor:Double){
        saldo += valor
    }

    fun saca(valor:Double){
        saldo-=valor
    }

    fun transfere(valor:Double , contaDestino:Conta){
        saldo -= valor
        contaDestino.deposita(valor)
    }

    override fun toString(): String {
        return "Conta(titular='${titular.nome}', numero=$numero, saldo=$saldo)"
    }




}