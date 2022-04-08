object Main {

    def a( x: Int, y: String) = {

        println("a " + x + " " + y)

    }

    def b(x:Int)(y:String) = {

        println("b " + x + " " + y)
    }

    def curryIt(func: (Int, String) => Unit): Int => String => Unit = x => y => func(x, y)

    def uncurryIt(func: Int => String => Unit): (Int, String) => Unit = (x, y) => func(x)(y)

    def main(args: Array[String]): Unit = {

        val ca = curryIt(a)
        ca(0)("Hello")
        
        val ub = uncurryIt(b)
        ub(0, "Hello")
    }
}