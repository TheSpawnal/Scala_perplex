

def iterate[A](f: A=>A , i: Int)(a : A): A =
    if(i == 0) a
    else iterate(f, i -1)(f(a))

def andThen[A,B,C](f: A => B, g : B => C) : A => C =
    x => g(f(x))

def times2 : Int => Int = _ * 2
def plus1 : Int => Int = _ + 1
def min7 : Int => Int = _ - 7

val x : Int = andThen(iterate(andThen(times2, plus1),3), min7)(v1 = 1)

 What is the value of x?
 A 8 <-
 B-34
 C-10
 D-4
 E 4