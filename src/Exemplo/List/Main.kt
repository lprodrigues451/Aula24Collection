package Exemplo.List

fun main() {
    val listaNumeroEscritos = listOf("um", "dois", "três")
    println("O tamanho da lista é : ${listaNumeroEscritos.size}")
    println("O elemento na posição 0 é : ${listaNumeroEscritos.get(0)} ")
    println("O elemento na posição 2 é : ${listaNumeroEscritos[2]} ")
    println("O index do elemento \"dois\" ${listaNumeroEscritos.indexOf("dois:")}")

    println("----------- Exemplo de mutableListOf() --------------")
    val listaNumeroMutaveis = mutableListOf(10,30,40)
    println(listaNumeroMutaveis)

    listaNumeroMutaveis.add(50)
    listaNumeroMutaveis.add(100)
    listaNumeroMutaveis.add(300)
    println(listaNumeroMutaveis)

    listaNumeroMutaveis.removeAt(0)
    listaNumeroMutaveis.remove(40)
    println(listaNumeroMutaveis)
    // Embaralha
    listaNumeroMutaveis.shuffle()
    println(listaNumeroMutaveis)
    // Ordem crescente
    listaNumeroMutaveis.sort()
    println(listaNumeroMutaveis)

    println("----------- Exemplo de ArrayList --------------")
    val listaSalarios = ArrayList<Double>()
    listaSalarios.add(3500.00)
    listaSalarios.add(500.00)
    listaSalarios.add(4560.00)

    listaSalarios.remove(3500.00)
    listaSalarios.removeAt(1)
    listaSalarios.clone()
    println(listaSalarios)


}

