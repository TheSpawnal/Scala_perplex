

var a = 0
var b = 1
var c = 2

def f1(a: Int): Int = {
    b += a
    c = 5
    a + 2
}

def f2(b: Int, d: Int): Int = {
    a = f1(b)
    c += d
    b
}

def main(args: Array[String]): Unit = {
    a = f1(b)
    c = f2(c, a)
    b = a + c
    println(b)
}


 What will this program print? (left code goes above right code)
 A 12<-
 B 9
 C 8 
 D 14