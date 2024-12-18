
def f(x: Int): (Int, (Int, Int) => Int) => Int = {
    val a = new Array[Int](x)
    var i = 0
    for(i <- a.indices) a(i) = 0
    (y, f) => {
        a(i)=y
        i= (i+1) % a.length
        a.reduce(f)
    }
}

def main(args: Array[String]): Unit = {
    var g = f(3)
    g(1,_+_)
    g(2,_+_)
    g(3,_+_)
    println(g(4, _*_))
    g = f(2)
    g(1,_*_)
    g(2,_*_)
    println(g(4,_+_)
}

What is the output of main?

Recall that a.reduce(f) is like a.fold(i)(f), it combines the 
elements using an associative function, but reduce does not require 
an initial element i (i.e. 0 or 1) like fold. 
The output of reduce and fold is the same except in the
 case of an the empty list (which does not occur in the program above).

48 7

24 6 <-

10 6

12 4
