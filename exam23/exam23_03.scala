

var im: Int => Int = null
var p: Int => Int = null

Suppose the function im(x)  is impure, and the function p(x) is pure. 
Further, consider the following function m:

def m(x: Int): Int = {
    val a = im(x)
    val b = p(x)
    val c = im(x)
    val d = p(x)
    a + b + c + d
}

Which of the following functions will always give the same 
output as function m? Select 1 or more

A:
def s: Int => Int = x =>{
    val a = im(x)
    val b = p(x)
    a * 2 + b * 2
}

B:
def q(x: Int): Int = {
    val a = im(x)
    val b = p(x)
    a + b + a + b
}

C:
def n(x: Int): Int = {
    val a = im(x)
    val b = p(x)
    val c = im(x)
    a+b+c+b
}

D: 
def r: Int => Int = x => {
    val a = im(x)
    val c = im(x)
    a + p(x) + c + p(x)
}


(C,D)
