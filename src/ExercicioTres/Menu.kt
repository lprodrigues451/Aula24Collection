package ExercicioTres

import kotlin.system.exitProcess

class Menu {

    fun menu(guarda: GuardaVolumes = GuardaVolumes()) {

        println("1- Guarda")
        println("2- Consulta")
        println("3- Retirar")
        println("4- Sair")
    try {
        when (readln().toInt()) {
            1 -> {
                menuPeca(guarda)
            }
            2 -> {
                guarda.mostrarPecas()
                menu(guarda)
            }
            3 -> {
                println("Informe o numero do seu guarda peça:")
                val numero = readln().toInt()
                guarda.devolverPecas(numero)
                menu(guarda)
            }

            4 -> {
                exitProcess(0)
            }

            else -> {
                println("\n Opção Inválida \n")
                menu(guarda)

            }
        }
    } catch (exception: Exception){
        exception.message
    } finally {
        println("Opção invalida")
        menu(guarda)
    }

    }
    fun menuPeca(guarda: GuardaVolumes = GuardaVolumes()) {
        try {
            println("1- Moda")
            println("2- Acessorio")
            println("3- Sair")

            when (readln().toInt()) {
                1 -> {
                    val moda = Moda()
                    val listaModa = moda.informaOsDados()
                    guarda.guardarPeca(listaModa.toMutableList())
                    menu(guarda as GuardaVolumes)
                }
                2 -> {
                    val acessorio = Acessorio()
                    val listaAcessorio = acessorio.informaOsDados()
                    guarda.guardarPeca(listaAcessorio.toMutableList())
                    menu(guarda )

                }
                3 -> exitProcess(0)
                else -> {
                    println("\n Opção Inválida \n")
                    menu(guarda)

                }
            }
        }catch (exception: Exception){
            exception.message
        } finally {
            println("Opção invalida")
            menuPeca(guarda)
        }
    }
}





