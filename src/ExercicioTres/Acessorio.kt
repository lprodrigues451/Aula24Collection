package ExercicioTres

class Acessorio: Peca() {
    override var peca: String
        get() = "Acessorio"
        set(value) {}

    fun informaOsDados() : MutableList<Acessorio> {
        val listaDeAcessorio = mutableListOf<Acessorio>()

        println("Informe a marca da $peca:")
        marca = readln()

        println("Informe o modelo da $peca")
        modelo = readln()

        val acessorio = Acessorio()
        acessorio.marca = marca
        acessorio.modelo = modelo
        listaDeAcessorio.add(acessorio)
        return listaDeAcessorio

    }
}