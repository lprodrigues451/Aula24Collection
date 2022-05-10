package Exercicio4

abstract class Quadrilateros(
    var lado1: Double = 0.0,
    var lado2: Double = 0.0,
    var lado3: Double = 0.0,
    var lado4: Double = 0.0): Geometrica {

    override fun calculoDoPerimetro(): Double {
        println("Os valores dos perimetro do quadrilateros é : ")
        return lado1+ lado2 + lado3 + lado4
    }
}