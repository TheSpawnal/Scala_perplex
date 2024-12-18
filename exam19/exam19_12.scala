
def m() : Unit = {
    var x = 1 
    def f(a: Int) : Int = a * x 
    println(f(2))
    x = 2
    println(f(2))
    x = 3 
    println(f(3))
}

 What will m() print?
 A 2 4 9 <-
 B 2 2 3
 C 4 6 9
 D 4 4 4