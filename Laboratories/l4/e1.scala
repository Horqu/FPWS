object Main {

    def flatten(lists: List[List[Int]]): List[Int] = {

        var result = List[Int]()
        val n_of_lists = lists.length

        @scala.annotation.tailrec def fr(li: List[List[Int]], l_t: List[Int]): List[Int] = {

            if(li.isEmpty == true) return result
            else if((l_t.isEmpty == true) && (li.tail.isEmpty == true)) return result
            else if(l_t.isEmpty == true) fr(li.tail, li.tail.head)
            else {
                result = result :+ l_t.head
                fr(li, l_t.tail)
            }
        }
        fr(lists, lists.head)

    }

    def main(args: Array[String]) = {

    val lA = List(1,2,3,4)

    val lB = List(10,9,8,7)

    val lC = List(-1,-2,1) // has only 3 elements

    val lD = List(100,90,80,70,60,50) // has more elements

    val output = flatten(List(lA, lB, lC, lD))
    println(output.mkString(", "))
    }
}