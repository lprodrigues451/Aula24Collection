package Exemplo.Set

fun main() {
    val conjuntoNumerosA = setOf(2, 4, 6, 8)
    println("O conjuntoNumerosA possui o tamanho de : ${conjuntoNumerosA.size}")

    if (conjuntoNumerosA.contains(6)) {
        println("O valor 6 está contido no conjutosNumerosA")
    } else {
        println("Elemento não encotrado!")
    }

    val conjuntoNumerosB = setOf(8, 4, 6, 2)
    println("O conjuntoNumerosB possui o tamanho de : ${conjuntoNumerosA.size}")
    if (conjuntoNumerosA == conjuntoNumerosB) {
        println(
            "Os conjuntos são iguais!" +
                    "\"$conjuntoNumerosA =  $conjuntoNumerosB \")"
        )
    } else {
        println(
            "Os conjuntos são diferentes = " +
                    "$conjuntoNumerosA !=  $conjuntoNumerosB "
        )
    }

    //exemplo mutableSetOf

        println("----------- Exemplo mutable mutableSetOf()-----------")

        val conjuntoNumerosReais = mutableSetOf<Double>()

        conjuntoNumerosReais.add(3.5)
        conjuntoNumerosReais.add(2.5)
        conjuntoNumerosReais.add(0.2)
        conjuntoNumerosReais.add(2.5)
        conjuntoNumerosReais.add(10.7)

        println(conjuntoNumerosReais)

        conjuntoNumerosReais.remove(10.7)


        println(conjuntoNumerosReais.first())
        println(conjuntoNumerosReais.last())

    println("----------- Exemplo HashSet -----------")

    val colecaoSet = HashSet<String>()
    colecaoSet.add("Site")
    colecaoSet.add("Aplicativo")
    colecaoSet.add("Fóruns")

    //dados duplicados não são inseridos no Set
    colecaoSet.add("Aplicativo")
    colecaoSet.add("Site")

    println("Tamanho coleção Set: ${colecaoSet.size} ")

    colecaoSet.forEachIndexed { index, valor ->
        println("$index -----> $valor")
    }
}

