Exercise 1

Assume there is a list of string given (e.g. copy this line). The goal is to write the code that:

A) produces the list of words that are longer than 4 characters.

B) list of words containing letter 'a'

C) produce list of pairs containing string and it's length

D) Given two lists of words generate two word keyword by combining two random* words



* To generate a random integer in range use this:

val r = scala.util.Random

r.nextInt(N) <- gives an integer in the range of [0,N)


Exercise 2

Here the idea is to write a few simple functions:

println( constVal ) // gives 3.1415

println( constVal() ) // also gives 3.1415

println( gt(5)(4) ) // gt == greater than - here true

println( gt(3)(4) ) // false

def mult(x: Int, y: Int) = x*y

println( op(mult, (2, 3) ) ) // returns of applicaiton of function passed as the first argument to the second argument