
var x: Int = 0
var z: Int = 1

def m1(y: Int) : Int = {
    var x = y
    def m2(z: Int): Int = {
        x-=z
        z+1
    }
    z+=m2(z)
    z+=m2(z)
    x
}

def main(args: Array[String]) : Unit = {
    var p = m1(2)
    p += x + z
    println(p)
}

what is the output of main:

6
4
3
5 <-
