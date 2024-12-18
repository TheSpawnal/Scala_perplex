


In this question, we simulate infinite lists using first class functions, 
similarly to how sets were simulated in the lecture using 
first class functions.

An infinite list is a function from a (non-negative) integer 
index to an element

type InfList[A]=Int =>A


Suppose we have two infinite lists a and b, with the the elements
a0,a1,a2,a3,...
and
b0,b1,b2,b3,....
and we want to merge them to get a new infinite list
merge(a,b) = a0,b0,a1,b1,a2,b2,a3,b3,...

Which of the following functions would do that?

def merge[A](a: InfList[A], b : InfList[A]) : InfList[A] = 
    i => 
        yield a(i)
        yield b(i)

def merge[A](a: InfList[A], b: InfList[A]) : InfList[A] = 
    i => b(a(i))

def merge[A](a: InfList[A], b : InfList[A]) : InfList[(A,A)] = 
    i => (a(i/2), b(i/2))

def merge[A](a: InfList[A], b: InfList[A])(i: Int) : A = {
    if(i % 2 == 0) a(i/2)
    else b(i/2)
}<-



