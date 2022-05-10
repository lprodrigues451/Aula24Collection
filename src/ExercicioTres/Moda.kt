package ExercicioTres

class Moda: Peca() {
    override var peca: String
        get() = "Moda"
        set(value) {}
    fun informaOsDados() : MutableList<Moda> {
        val listaDeModa = mutableListOf<Moda>()

        println("Informe a marca da $peca:")
        marca = readln()

        println("Informe o modelo da $peca")
        modelo = readln()

        val moda = Moda()
        moda.marca = marca
        moda.modelo = modelo
        listaDeModa.add(moda)
        return listaDeModa

    }


}