/**
 * Clase que representa un rectángulo con propiedades como base, altura, área y perímetro.
 *
 * @property base La longitud de la base del rectángulo.
 * @property altura La altura del rectángulo.
 * @property area El área del rectángulo.
 * @property perimetro El perímetro del rectángulo.
 *
 * @constructor Crea un objeto [Rectangulo] con la base y la altura especificadas.
 * @param base La longitud de la base del rectángulo.
 * @param altura La altura del rectángulo.
 */
class Rectangulo(
    private val base : Int,
    private val altura:Int
){
    /**
     * El área del rectángulo.
     */
    private val area = base * altura

    /**
     * El perímetro del rectángulo.
     */
    private val perimetro = (base * 2) + (altura * 2)

    /**
     * Inicializa la clase [Rectangulo] y verifica que la base y la altura sean mayores a 0.
     */
    init {
        require(this.base > 0) {"base necesita ser mayor a 0"}
        require(this.altura > 0){"La altura tiene que ser mayor a 0"}
    }

    /**
     * Representación en cadena del objeto [Rectangulo].
     *
     * @return Una cadena que muestra el área y el perímetro del rectángulo.
     */
    override fun toString(): String {
        return "El area es ${this.area} y el perimetro es ${this.perimetro}"
    }
}

/**
 * Función principal que crea varios objetos [Rectangulo] y los imprime.
 */
fun main() {
    try {
        val rectangulo1 = Rectangulo(0, 20)
        println(rectangulo1.toString())

        val rectangulo2 = Rectangulo(15, 2230)
        println(rectangulo2.toString())

    }catch (e: IllegalArgumentException){
        println(e.message)
    }
}