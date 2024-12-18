

Suppose that, like in the lecture, we implement sets as functions 
(a set is then a function that tells if something is in the set or not)


type Set[A] = A => Boolean

Which of the following is an implementation of a 
function that when given an element, 
gives back a set with that element ? 

A: <-
def singleton(x: Int)(y: Int) = x == y

B:
def singleton(x: Int) = Set[Int]().addOne(x)

C:
def singleton : Int => Set[A] =x => y => z => x == y(z)

