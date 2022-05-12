Exercise 1:

The goal is to write a simple class MyDate and MyPeriod - the later representing two dates in fact. 

IMPORTANT: Please ignore all the details like number the days per monts etc. i.e. assume we have 12 months, each has 30 days.

The representation of the data can be anyhting except the system date object.



You need to make choice whether to make the class functional or not. The rigth choice. 



object test extends App {

  val d1 = MyDate(2015, 10, 10)

  val d2 = MyDate(2015, 11, 10)

  val d3 = d2.nextDay()



  println( d1 +" "+ d2 +" "+ d3 )



  println( (d1 < d2) + " " + (d2 < d1) )



  val days: Int = d1 - d2

  println("dni " + days + " " +(d2 - d1))



  val period = MyPeriod(begin=d1, end=d2  )

  println( " " + d1 +" "+ d2 + " " + period + " "+period.days)



  /* expected result

   2015-10-10 2015-11-10 2015-11-11

   true false

   dni 32 32

    2015-10-10 2015-11-10 < 2015-10-10 : 2015-11-10 > 32

   */



}



Exercise 2

The idea is to provide traits that can be used to decorate strings that, when printed, show additional HTML tags or modified in some other way. 



  // example code

  class StringWrap (val s: String ) {

    override def toString() = s

  }





  class Pre( val text: String)  extends StringWrap(text) with htmlH2 with htmlI {}

  val h = new Pre("Pargraph heading")

  println(h)



  class X(val text:String, override val llen: Int) extends StringWrap(text) with Capitalisation with PageStretch

  println(new X("abra ka dabra", 50))

  println(new X("abra ka dabra", 30))

  println(new X("abra ka dabra", 20))



  val z = new StringWrap("a tricky text with tricky content") with PageStretch

  println(z)



  /* spodziewany wynik

<\I><\H2>Paragraph heading</\H2></\I>

Abra            ka            dabra

Abra     ka     dabra

Abra  ka  dabra

a       tricky       text       with       tricky       content

   */

