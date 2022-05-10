package ExercicioCinco

class Dicionario {
    var objeto: String = ""
    var cor: String = ""
    val ObjetoECor = mutableMapOf<String, String>()

    fun informar(){
        println("Informe a quantidade de objeto que vai coloca?")
        val qtd = readln().toInt()
        val qtdVetor = arrayOfNulls<Int>(qtd)

        qtdVetor.forEach(){
            println("Informe o objeto:")
            objeto = readln()
            println("Informe a cor $objeto")
            cor = readln()
            ObjetoECor[objeto] = cor
        }


    }

    fun exibir(){
        println(ObjetoECor)
    }

}



