package Exercicio4

import java.lang.Math.PI

class Circulo(var raio: Double = 0.0):Geometrica {
    override fun calculoDoPerimetro(): Double {
        println("Perimetro do circulo é :")
        return 2 * PI * raio
    }

    override fun calculoDaArea(): Double {
        println("A área do circulo é :")
        return Math.PI * Math.pow(raio, 2.0)
    }

    fun informacaoDoCirculo(){
        println("Informe o raio:")
        raio= readln().toDouble()
        Menu().listaFormas.add(Circulo(raio))
    }
}