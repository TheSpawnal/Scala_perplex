
def f(x: Int) (y : Int) : Int = {
    if( y == 0 )return x
    z += y
    z += f(z)(y-1)
    x + y
}

Which of the following statements about f are true? Select 0 or more.
 A f is curried <-
 B f is recursive <-
 C f is tail recursive
 D f is abstract
 E f is pure <-
 F f(3) is a nested function