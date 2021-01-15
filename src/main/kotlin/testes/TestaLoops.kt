package testes

class TestaLoops {

    fun increase(numero:Int){
        for(i in 0..numero){
            println(i)
        }
    }

    fun decrease(numero:Int){
        for(i in numero downTo 0){
            println(i)
        }
    }

}