
which of the following function is pure?

A: 
def ipPrint(a: Int) : Int = {
    println(a)
    return a
}

B:
def sum(l: List[Int]) : Int = { 
    var res = 0
    for(e <- l){
        res += e
    }
    res
}

C:
def up(a: Array[Int]) : Int = {a(0) += 1 ; a(0)}

D:
def fy(n: Int) : Seq[Int] =
    for(i <- 0 until n; if i % 3 != 0) yield i