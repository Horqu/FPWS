object Main {

    def letterChangerEncode(letter: Char): Char ={
      val a1 = " qwertyuiopasdfghjklzxcvbnm"
      val a2 = " qazwsxedcrfvtgbyhnujmikolp"

      return a2(a1.indexOf(letter))
      
    }

    def letterChangerDecode(letter: Char): Char ={
      val a1 = " qwertyuiopasdfghjklzxcvbnm"
      val a2 = " qazwsxedcrfvtgbyhnujmikolp"

      return a1(a2.indexOf(letter))
    }

    def recode(coding: String, text: String): String ={

      var result = ""

      if(coding == "encode"){
        for(i <- 0 until (text.length)){
          result = result.concat(letterChangerEncode(text(i)).toString)
        }
      }
      else{
        for(i <- 0 until (text.length - 1)){
          result = result.concat(letterChangerDecode(text(i)).toString)
        }
      }

      return result
    }

    def main(args: Array[String]) = {

        val coding = args(0)
        val text = args(1)
      
        println("Recoded text: " + recode(coding, text));
        
    }
  
}