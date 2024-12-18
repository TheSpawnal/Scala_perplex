
def v : String = {
    def f(l: List[String]) : Unit = {
        l.updated(2,"zero")
    }
    val l = List("one", "two","three","four")
    f(l)
    f(2)
}

Value of v?

 A "zero"
 B "three" <-
 C ""