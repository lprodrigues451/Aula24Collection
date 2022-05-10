package Exemplo

fun main() {
    val numeros = mutableListOf( "um", "dois", "tres")
    numeros.add("Cinco")
    println(numeros)
    numeros.remove("um")
    println(numeros)
    println("Lendo o valor do elemento na posição 1 ${numeros[1]}")
    numeros[2] = "dez"
    println(numeros)

    val nomes = listOf("Jessica", "Carol", "Natalia")
    println(nomes)
    println("Elementos na posição 1: ${nomes[1]}")
}