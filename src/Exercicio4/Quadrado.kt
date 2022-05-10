package Exercicio4

class Quadrado(var lado : Double = 0.0): Geometrica {
    override fun calculoDoPerimetro(): Double {
        println("O perimetro do Quadrado é :")
        return lado * 4
    }

    override fun calculoDaArea(): Double {
        println("A área do Quadrado é :")
        return lado * 2
    }

    fun informacaoDoQuadrado(){
        println("Informe o lado do quadrado:")
        lado= readln().toDouble()
        Menu().listaFormas.add(Quadrado(lado))
    }

}