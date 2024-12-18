

def f(l: List[Int]): Int => Int = {
    var s = l
    var i = 0
    x => {
        val res = s(i)
        s = s.updated(i, x)
        i = if(i == l.length - 1) 0 else i + 1
        res
    }
}

def main(args: Array[String]): Unit = {
    var p = f(List(1,2))
    print(p(3) + " ")
    print(p(4) + " ")
    print(p(5) + " ")
    p = f(List(3, 4))
    print(p(3))
}


What does this program print?
 Recall that l.updated(i,x) gives a new list, which is like l, but where the element at index i has been replaced by x.
 A 1 2 3 3 <-
 B 1 1 1 1 
 C 1 2 3 4
 D 1 2 1 1
 E 1 2 1 2