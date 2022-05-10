package Exercicio4

class Retangulo(
    var base: Double = 0.0,
    var altura: Double = 0.0): Quadrilateros() {
    override fun calculoDaArea(): Double {
        println("A área do retângulo é: ")
        return base * altura
    }
    fun InformacaoDoRetangulo() {
        println("Informe o valor da base:")
        base = readln().toDouble()
        println("Informe o valor da altura:")
        altura = readln().toDouble()
        Menu().listaFormas.add(Retangulo(base, altura))
    }
}