object Main {

    def constVal = 3.1415

    def constVal(x: Int = 0): Double = 3.1415

    def gt(x: Int)(y: Int): Boolean = x > y

    def mult(x: Int, y: Int): Int = x * y

    def op(function:(Int, Int) => Int, args: (Int, Int)): Int = function(args(0), args(1))

    def main(args: Array[String]): Unit = {

        println(constVal)
        println(constVal())
        println(gt(5)(4))
        println(gt(3)(4))
        println(op(mult, (2, 3)))
    }
}