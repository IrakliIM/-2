fun main() {

    val cord1 = Point(abscissa = 4F, ordinate = 5F)
    val cord2 = Point(abscissa = 3F, ordinate = 4F)

    println(cord1.toString())
    println(cord2.toString())

    println(cord1 == cord2)
}


class Point(var abscissa:Float, var ordinate:Float){

    private var coordinateX: Float = abscissa
    private var coordinateY: Float = ordinate

    override fun equals(other: Any?): Boolean {
        if(other is Point){
            if (coordinateX == coordinateY){
                return true
            }

        }
        return false
    }


    override fun toString(): String {
        return "x=${this.abscissa}, y=${this.ordinate}"
    }
}


