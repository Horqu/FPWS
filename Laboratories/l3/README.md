Exercise 1 (solo quest):

The challenge is to write higher-order functions that transform curried into uncurried and vice versa.

You can't use Function.uncurried or curried.  

Say we have two functions:



        def a( x: Int, y: String) {

            println("a " + x + " " + y)

        }



        def b(x:Int)(y:String) {

            println("b " + x + " " + y)

        }

say they have both trivial implementation e.g. print the f name and arguments to the output.





The task is to write: 

val ca = curryIt(a)

ca(0)("Hello")



val ub = uncurryIt(b)

ub(0, "Hello")



Reminder, the function w/o return value (the procedure) is the same as a function returning Unit type.





Exercise 2:

It is about using tail-recursive function to sum fractions 1/(2^n):

1, 1/2, 1/4, 1/8, 1/16 etc...



The summation should stop when the value of the fraction to be added in the next recursion

is less than a precision parameter passed as an argument.



example invocation:

val sum1 = sumfrac( 1e-3 )

val sum2 = sumfrac( 1e-9 )



A technique using default parameters or inner function can be used.