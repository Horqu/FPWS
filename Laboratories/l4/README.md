Exercise 1:



The challenge is to write tile recursive function that merges list of lists by picking elements in such order:

elements of the list 1, elements of the list 2, elements of the list 3 ... 

The merging should stop if any list end is reached:

Example:

  val lA = List(1,2,3,4)

  val lB = List(10,9,8,7)

  val lC = List(-1,-2,1) // has only 3 elements

  val lD = List(100,90,80,70,60,50) // has more elements



  val output = flatten( List(lA,lB,lC,lD) )

  println(output.mkString(", "))



// result: 1, 2, 3, 4, 10, 9, 8, 7, -1, -2, 1, 100, 90, 80, 70, 60, 50





6 points if every operation is tail recursive, if only some of the operations are then the number of points is reduced.

The only allowed operations on the list are: isEmpty, head, tail, ::



Exercise 2

The challenge of the second exercise is to write Angle functional class. 

It should describe the angular distance. The allowed range is between -pi and +pi.

That means whenever the angle with the value > +pi is requested the wrapping should happen.

Operations like, +, -, * by Double, / by Double need to be supported.

The class needs a companion object implementing factory method.



  import geo._

  val fi1 = Angle(1.5)

  val fi2 = Angle(2.5)

  val fi3 = fi1+fi2

  println(fi1 + " "+ fi2 +" "+fi3)

  // result: Angle=1.5 Angle=2.5 Angle=-2.2831853071795862