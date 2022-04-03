object Main {

    def longerThan4(list: List[String]): List[String] = {

        val result = for(i <- list if i.length() > 4) yield i
        return result.toList
    }

    def containing_a(list: List[String]): List[String] = {

        val result = for(i <- list if i.contains('a')) yield i
        return result.toList
    }

    def listOfPairs(list: List[String]): List[String] = {

        val result = for(i <- list) yield i + " - length: " + i.length().toString
        return result.toList
    }

    def keywordGenerator(list1: List[String], list2: List[String]): String = {

        val r = scala.util.Random

        val result = "Random keyword: " + list1.apply(r.nextInt(list1.length)) + " " + list2.apply(r.nextInt(list2.length))
        return result
    }

    def main(args: Array[String]): Unit = {

        val list1 = List("assume", "there", "is", "a", "list", "of", "string", "given")
        val list2 = List("the", "goal", "is", "to", "write", "the", "code", "that")

        println(longerThan4(list1))
        println(containing_a(list2))
        println(listOfPairs(list1))
        println(keywordGenerator(list1, list2))
    }
}