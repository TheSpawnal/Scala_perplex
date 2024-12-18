
In the REPLs programming assignment, you saw a multiset, 
which is like a set (no order), but unlike a set, it can contain
duplicates. 
The number of instances of an element is called its multiplicity. 
For example, the multiset [a,b,a,c,d,d,d] has the
following multiplicities: a: 2, d: 3, b : 1 and 
c: 1 (and a multiplicity of 0 for any other element). 
In the assignment, you implemented a multiset using a map 
to represent the multiplicity.
In this exercise, we use first-class functions instead to 
represent the multiset. We represent a multiset in terms of its
multiplicity function.

type MultiSet[A] = A => Int

Given the above definition, which of the answers are correct 
implementations of the sum method with the following signature
(select 0 or more)

def sum[A](a: MultiSet[A], b: MultiSet[A]) : MultiSet[A]


A: 
{
    def s(x:A):Int=a(x)+b(x)
    s
}

B:
a++b

C: <-
a(_) + b(_)

D:
for(x<-a.toSeq ++ b.toSeq)
    yield x -> (a(x) + b(x))

E:
for (x < a ++ b){
    var res = 0
    for(c <- a, b)
    if(c == x) res + 1

    yield(x -> res)
}

F: <-
x => a(x) + b(x)