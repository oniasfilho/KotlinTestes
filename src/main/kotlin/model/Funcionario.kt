package model

class Funcionario(nome: String, cpf: String, val setor:String, val salario:Double) : Pessoa(nome, cpf) {

    override fun toString(): String {
        return "Funcionario(setor='$setor', salario=$salario)"
    }
}