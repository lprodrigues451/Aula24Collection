package Exemplo.Map

/*
//Exemplo das chaves declaradas em constantes

const val CHAVE_1 = "chave1"
const val CHAVE_2 = "chave2"
const val CHAVE_3 = "chave3"
const val CHAVE_4 = "chave4"

fun main() {
    val numerosMap = mapOf(
        CHAVE_1 to 1,
        CHAVE_2 to 2,
        CHAVE_3 to 3,
        CHAVE_4 to 4
    )
}
 */

//exemplo de map
fun main() {
    val numerosMap = mapOf(
        "chave1" to 1,
        "chave2" to 2, "chave3" to 3, "chave4" to 4
    )

    println("Todas as chaves: ${numerosMap.keys}")
    println("Todos os valores: ${numerosMap.values}")
    if ("chave2" in numerosMap) {
        println("Valor por chave \"chave2\": ${numerosMap["chave2"]}")
    }

    if (1 in numerosMap.values) {
        println("O valor 1 está no mapa")
    }

    if (numerosMap.containsValue(1)) {
        println("O VALOR 1 ESTA NO MAPA")
    }

    println("------- Exemplo mutableMapOf()------")
    val nomesMap = mutableMapOf<Int, String>()

    nomesMap[1] = "Jessica"
    nomesMap.put(2, "Carol")
    nomesMap.put(3, "Carol")
    nomesMap.put(4, "Charles")
    println(nomesMap)

    nomesMap.remove(3)
    println(nomesMap)

    nomesMap[3]= "Cleber"
    println(nomesMap)

    //código exemplo hashMap

    println("------- Exemplo HashMap ------")

    val estudantes = HashMap<String, Int>()
    estudantes["Thayane"] = 100
    estudantes["Victor"] = 105
    estudantes["Luiz"] = 102
    estudantes["Allan"] = 108
    println("Elementos no mapa de estudantes:")
    println(estudantes)

    val funcionarios = HashMap<String, Int>()
    funcionarios["Carol"] = 110
    funcionarios["Jess"] = 112
    println("Elementos no mapa de Funcionarios:")

    println(funcionarios)

    estudantes.putAll(funcionarios)

    println("Elementos no mapa de estudantes depois do uso do método putAll")
    println(estudantes)

}