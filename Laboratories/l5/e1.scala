object Main {

    class MyDate(val year: Int, val month: Int, val day: Int) {

        def nextDay(): MyDate = new MyDate(this.year, this.month, this.day + 1)

        override def toString() : String = {

            return (year.toString + "-" + month.toString + "-" + day.toString)
        }

        def <(d: MyDate): Boolean = {
            if(year < d.year) return true;
            else if(month < d.month) return true;
            else if(day < d.day) return true;
            return false;
        }

        def >(d: MyDate): Boolean = {
            if(year > d.year) return true;
            else if(month > d.month) return true;
            else if(day > d.day) return true;
            return false;
        }

        def -(d: MyDate): Int = {
            val counter = 360 * math.abs(year - d.year) + 30 * math.abs(month - d.month) + math.abs(day - d.day)
            return counter
        }
    }

    object MyDate {

        def apply(y: Int, m: Int, d: Int) = {
            if(d > 30 && m > 12) new MyDate(y + 1, m - 12 + 1, d - 30)
            else if(m > 12) new MyDate(y + 1, m - 12, d)
            else if(d > 30) new MyDate(y, m + 1, d - 30)
            else new MyDate(y, m, d)
        }

    }

    class MyPeriod(begin: MyDate, end: MyDate) {

        override def toString() : String = {

            return ("< " + begin.toString + ":" + end.toString + " >")
        }

        def days(): Int = {
            return begin - end
        }

    }

    object MyPeriod {
        
        def apply(begin: MyDate, end: MyDate) = new MyPeriod(begin, end)
    }

    def main(args: Array[String]) = {

    val d1 = MyDate(2015, 10, 10)

    val d2 = MyDate(2015, 11, 10)

    val d3 = d2.nextDay()

    println( d1 +" "+ d2 +" "+ d3 )

    println( (d1 < d2) + " " + (d2 < d1) )

    val days: Int = d1 - d2

    println("dni " + days + " " +(d2 - d1))

    val period = MyPeriod(begin=d1, end=d2  )

    println( " " + d1 +" "+ d2 + " " + period + " "+period.days)

    }
}