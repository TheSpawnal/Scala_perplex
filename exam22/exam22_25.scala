def f() : Int => Int = {
    var l : List[Int] = List(1,2)
    (x: Int) => {
        val h = l.head
        l = l.tail :+ x //appends x a the end of l.tail
        h
    }
}

def main(args : Array[String]) : Unit = {
    var v: Int => Int = f()
    print(v(3))
    print(v(4))
    print(v(5))
    v = f()
    print(v(6))
    print(v(7))
    print(v(8))
}

What is the output of main?
 A 123126 
 B 123123
 C 111111
 D 123456
 E 345678

(A)
