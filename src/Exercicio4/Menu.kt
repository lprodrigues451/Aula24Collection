package Exercicio4

import ExercicioTres.GuardaVolumes
import kotlin.system.exitProcess

class Menu {
    val listaFormas = mutableListOf<Geometrica>()

    fun menu() {

        val retangulo = Retangulo()
        val quadrado = Quadrado()
        val circulo = Circulo()
        println("1- retângulo")
        println("2- quadrado")
        println("3- circulo")
        println("4- Sair")
            when (readln().toInt()) {
                1 -> {
                    retangulo.InformacaoDoRetangulo()
                    println(circulo.calculoDaArea())
                    println(circulo.calculoDoPerimetro())
                }
                2 -> {
                    quadrado.informacaoDoQuadrado()
                    println(circulo.calculoDaArea())
                    println(circulo.calculoDoPerimetro())
                }

                3 -> {
                    circulo.informacaoDoCirculo()
                    println(circulo.calculoDaArea())
                    println(circulo.calculoDoPerimetro())
                }

                4 -> {
                    exitProcess(0)
                }

                else -> {
                    println("\n Opção Inválida \n")
                    menu()

                }
            }

    }
}