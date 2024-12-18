
var x = 2
var y = 6
def show(x: Int, y: Int): Unit = println(x+", "+y)

def m2(x: Int): Int = {
    y += x 
    return x
}

def m1(x: Int, yi: Int): Int = {
    var y = yi + x
    return m2(y)
}

def main(args: Array[String]): Unit = {
    x = m1(y, x)
    x = m1(x, y)
    show(y, x)
}

 What is the output of main?
 A 36,22 <-
 B 6, 14
 C 24, 14
 D 48, 30