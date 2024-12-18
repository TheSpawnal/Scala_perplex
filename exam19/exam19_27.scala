
def comp[A,B,C](f: A => B, g : B => C) : A => C = 
    x => g(f(x))
def h(f: Int => Int, g: Int => Int): Int => Int =
    comp(comp(f,g),f)

def v = h(_ + 1, comp[Int, Int, Int](_ * 2, _ -1 ))(2)

value of v ? 
 
 A 6 <-
 B 5
 C 4
 D 7