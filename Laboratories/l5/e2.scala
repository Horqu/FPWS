object Main {

    class StringWrap (val s: String, val llen: Int = 7 ) {

        override def toString() = s
    }

    trait htmlH2 extends StringWrap {
        abstract override def toString() = {print("<H2>"); super.toString + "</H2>"}
    }

    trait htmlI extends StringWrap {
        abstract override def toString() = {print("<I>"); super.toString + "</I>"}
    }

    trait Capitalisation extends StringWrap {
        abstract override def toString() = {super.toString.capitalize}
    }

    trait PageStretch extends StringWrap {
        abstract override def toString() = {super.toString.replaceAll(" ", " " * llen)}
    }

    class Pre( val text: String) extends StringWrap(text) with htmlH2 with htmlI {}

    class X(val text:String, override val llen: Int) extends StringWrap(text) with Capitalisation with PageStretch


    def main(args: Array[String]) = {

    val h = new Pre("Pargraph heading")

    println(h)

    println(new X("abra ka dabra", 50))

    println(new X("abra ka dabra", 30))

    println(new X("abra ka dabra", 20))

    val z = new StringWrap("a tricky text with tricky content") with PageStretch

    println(z)

    }
}