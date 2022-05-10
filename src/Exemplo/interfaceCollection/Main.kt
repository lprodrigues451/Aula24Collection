package Exemplo.interfaceCollection

//exemplo de collection
fun mostrarTudo(listaPalavras: Collection<String>) {
    for(palavra in listaPalavras) {
        println(palavra)
    }
}

fun main() {
    val listaPalavras = listOf("bola", "dado", "suco")
    mostrarTudo(listaPalavras)
}