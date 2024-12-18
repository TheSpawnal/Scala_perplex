

def reit[A](f: A => A, i: Int)(a: A): A = {
    var res = a
    for(i <- 0 until i ) res = f(res)
    res
}

def andThen[A, B, C](f: A=> B, g: B => C): A => C = x => g(f(x))

def times2: Int => Int _ * 2
def min1: Int => Int = _ - 1

val x: Int = andThen(reit(time2, 4), reit(andThen(min1, min1), 5))(1)

what is the value x ? 

A 6 <-
B -12
C 0
D 12
E -144