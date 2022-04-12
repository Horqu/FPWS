object Main {

    def defined_pi = 3.141592653589793

    class Angle(a: Double) {

        val an = Angle.checker(a)

        def +(a1: Angle): Angle = new Angle(this.an + a1.an)

        def -(a1: Angle): Angle = new Angle(this.an - a1.an)

        def *(a1: Double): Angle = Angle(this.an * a1)

        def /(a1: Double): Angle = Angle(this.an / a1)

        override def toString() : String = {

            return "Angle=" + an.toString
        }
    }

    object Angle {

        def apply(x: Double) = new Angle(x)

        private def checker(x: Double): Double = {

            if(x > defined_pi) return -defined_pi + x % defined_pi
            else if(x < -defined_pi) return defined_pi - x % defined_pi
            return x
        }

    }

    def main(args: Array[String]) = {

        val fi1 = Angle(1.5)

        val fi2 = Angle(2.5)

        val fi3 = fi1+fi2

        println(fi1 + " " + fi2 + " " + fi3)
    }
}