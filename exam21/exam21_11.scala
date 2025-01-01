

def f() : () => Int = {
    var x : Int =  0
    def c() = {
        x = x + 1
        x
    }
    c
}

def m() : Unit = { 
    var g: () => Int = f()
    println(g())
    g = g
    println(g())
    g = f()
    println(g())
    println(g())
}

What does m() print?
 A 1 2 1 2 
 B 1 1 1 2
 C 1 1 1 1
 D 1 2 3 4

(A)
