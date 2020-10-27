fun main() {

    val f1 = Fraction1()
    f1.numerator = 15F
    f1.denominator = 20F
    val f2 = Fraction1()
    f2.numerator = 9F
    f2.denominator = 12F


    println(f1 == f2)
    println(f1)
    println(f2)



}
class Fraction1() {

    var numerator: Float = 0F
    var denominator: Float = 1F


    override fun equals(other: Any?): Boolean {
        if(other is Fraction){
            if(numerator*other.denominator/denominator==other.numerator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
        while (numerator!=denominator)
            if(numerator > denominator)
                numerator-=denominator
            else
                denominator-=numerator
        return "$numerator"

    }





}