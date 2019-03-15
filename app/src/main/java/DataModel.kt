inline fun<reified Celda> matrix2D(ancho: Int, alto: Int, noinline param: (Int) -> Celda): Array<Array<Celda>> = Array(ancho){Array<Celda>(alto, param)}

enum class Ficha{
    CRUZ,
    BOLA,
    VACIO
}

enum class EstadoJuego{
    GANA_CRUZ,
    GANA_BOLA,
    EMPATE,
    JUGANDO
}

class Celda(val renglon: Int, val columna: Int){
    var estadoCelda: Ficha = Ficha.VACIO
    fun limpiaCelda(){
        estadoCelda = Ficha.VACIO
    }

    override fun toString(): String {
        return estadoCelda.toString()
    }
}

class Tablero{
    val ancho = 3
    val alto = 3
    val renglonActual = 0
    var columnaActual = 0
    var celdas = matrix2D<Celda?>(ancho, alto){null}

    init{
        for(r in 0 until ancho){
            for (c in 0 until alto){
                celdas[r][c] = Celda(r,c)
            }
        }
    }

    fun print(){
        for(r in 0 until ancho){
            for (c in 0 until alto){
                print("")
            }
        }
    }
}



fun main(args: Array<String>){
    println(Ficha.BOLA)
    println(EstadoJuego.EMPATE)
    val c = Celda(0,0)
    c.estadoCelda = Ficha.BOLA
    println(c)
}