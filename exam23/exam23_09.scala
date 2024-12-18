

consider the following function header:

def b : (Int => Int) => Int => Int = f => x =>

Which of the following function headers is equivalent 
to the one above 
(meaning you can replace one with the other, without any effect)
1or more:

A: 
def b(f : Int => Int, x: Int): Int = 

B:<-
def b(f : Int => Int) : Int => Int = x => 

C:
def b : Int => Int => Int => Int = f => x =>

D:<-
def b(f : Int => Int)(x: Int) : Int =