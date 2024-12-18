
def after[A,B,C](f: B => C, g : A => B)(x: A) : C = f(g(x))

def repeats[A](f: A => A, i : Int): A => A = a => {
    var x = a
    for(i <- 0 until i) x = f(x)
    x
}

def times3(x: Int): Int = x * 3
def min 1: Int => Int = _ - 1
def plus4: Int => Int = _ + 4

val x : Int = after(plus4, repeats(after(min1,times3),3))(4)

Value of x?
 A 99<-
 B 177
 C 21
 D 36
 E 76