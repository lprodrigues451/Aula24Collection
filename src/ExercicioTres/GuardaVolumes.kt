package ExercicioTres

class GuardaVolumes {
    val guardar = mutableMapOf<Int, MutableList<Peca>>()
    var contador : Int = 0

    fun guardarPecas(listaDePeca: MutableList<Peca>):Int{
        contador ++
        guardar[contador] = listaDePeca
        return contador
    }

    fun guardarPeca(listadePeca: MutableList<Peca>) {
        guardarPecas(listadePeca.toMutableList())

    }
    fun mostrarPecas(){
        guardar.forEach { chave, value->
            println("A sua chave é : $chave")
            value.forEachIndexed(){ index, valor ->
                println("A peça é: ${valor.peca}")
                println("A marca: ${valor.marca}")
                println("O modelo: ${valor.modelo}")
            }
        }

    }

    fun mostrarPecas(numero:Int){
        guardar[numero]?.forEach(){
            println("A marca: ${it.marca}")
            println("O modelo: ${it.modelo}")
        }
    }

    fun devolverPecas(numero:Int) {
        guardar.remove(numero)
    }


}