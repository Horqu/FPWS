Ex 1:



Reminder:  6 points, time ~1h, no other help except the scala console

Write the program that:

 1 takes the aruments from command line and threat them as boolans

 2 calculate the result of basic logical operations on them, and, or, xor

 3 print the table of operations for logical operation provided in the argument with an indicator of what the arguments were i.e.:

> scala booltester AND false true

AND

A  B  RESULT

false  false false

false  true  false  <- arguments

true   false false

true   true  true



> scala booltester OR true false

OR

A  B  RESULT

false  false  false

...





Ex 2:

Reminder:  4 points, time can/should check the lecture slides scala doc (no StackOverflow or similar copy paste)

Write encoder/decoder.

Assume the program gets the text string. It then does substitutaion of the charactes according to a fixed array.

The program should be able to convert the encoded string back using an inverted transformation.

Example encoding/decoding array:

a1 = " qwertyuiopasdfghjklzxcvbnm"

a2 = " qazwsxedcrfvtgbyhnujmikolp"

The encoding algorithm should work as follows:

 * read the string from the command line

 * loop over all characters in it and for each find the index in string a1

 * take the character from string a2 that is under the same index and print it

The decoding algorithm whould be exactly the same except it would use first the string a2.



Example functionality:

> scala coder encode "my name is bond"

.....

> scala coder decode "gi bbbb er ishh"

.....