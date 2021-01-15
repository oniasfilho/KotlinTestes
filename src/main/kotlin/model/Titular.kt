package model

class Titular {

    var nome = ""
    var saldo = 0.0

    fun deposita(valor:Double){
        saldo += valor
    }

    fun saca(valor:Double){
        saldo-=valor
    }

    override fun toString(): String {
        return "Titular(nome='$nome', saldo=$saldo)"
    }


}