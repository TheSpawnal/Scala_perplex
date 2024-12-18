
def fors(l: List[Int]) = {
    val s = 10
    for (e <- l; if e > 10) yield(s + e)
}

val x = fors(List(5,10,54,42,5))

value of x ?
A 136
B 166
C List(64,52) <-
D 116
E List(15,20,64,52,15)