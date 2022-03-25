object Main {

    def printer(op: String, a: Boolean, b: Boolean): Unit = {

      println(op)
      println("A     B    Result")

      if(op == "AND"){
          print("false false " + (false && false))
          if (a == false && b == false) print(" <- arguments")
          println()
          print("false true " + (false && true))
            if (a == false && b == true) print(" <- arguments")
            println()          
            print("true false " + (true && false))
            if (a == true && b == false) print(" <- arguments")
            println()
            print("true true " + (true && true))
            if (a == true && b == true) print(" <- arguments")
            println()          
        }
        else if(op == "OR"){
            print("false false " + (false || false))
            if (a == false && b == false) print(" <- arguments")
            println()
            print("false true " + (false || true))
            if (a == false && b == true) print(" <- arguments")
            println()          
            print("true false " + (true || false))
            if (a == true && b == false) print(" <- arguments")
            println()
            print("true true " + (true || true))
            if (a == true && b == true) print(" <- arguments")
            println()
        }
        else{
            print("false false " + (false ^ false))
            if (a == false && b == false) print(" <- arguments")
            println()
            print("false true " + (false ^ true))
            if (a == false && b == true) print(" <- arguments")
            println()          
            print("true false " + (true ^ false))
            if (a == true && b == false) print(" <- arguments")
            println()
            print("true true " + (true ^ true))
            if (a == true && b == true) print(" <- arguments")
            println()
        }
        println()
    }

    def main(args: Array[String]) = {

        val A = args(1)
        val B = args(2)
    
        printer(args(0), A.toBoolean, B.toBoolean)  
    }


  
}