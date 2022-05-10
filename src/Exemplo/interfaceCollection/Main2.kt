package Exemplo.interfaceCollection

//exemplo do código

//Exemplo de uso de interface de leitura
fun mostrarTudo1(listaPalavras: Collection<String>) {
    for(palavra in listaPalavras) {
        println(palavra)
    }
}

fun main() {
    //Exemplo de uso de interface de leitura
    val listaPalavras = listOf("bola", "dado", "suco")
    mostrarTudo1(listaPalavras)

    //Exemplo de uso de interface mutavel
    val listaBandas = mutableListOf<String>()

    listaBandas.add("Aerosmith")
    listaBandas.add("Metallica")
    listaBandas.add("Skank")
    listaBandas.add("RHCP")
    listaBandas.add("CBJR")

    mostrarTudo1(listaBandas)
}