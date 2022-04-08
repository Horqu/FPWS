object Main {

    def main(args: Array[String]): Unit = {

        val sum1 = sumfrac(1e-3)
        val sum2 = sumfrac(1e-9)

        println(sum1)
        println(sum2)
    }

    def sumfrac(prec: Double): Double = {

        @scala.annotation.tailrec def sum(value: Double, n: Int) : Double = {

            if(1 / Math.pow(2, n) < prec) return value
            
            sum(value + 1 / Math.pow(2, n), n+1)
        }
        sum(0, 0)
    }
}
