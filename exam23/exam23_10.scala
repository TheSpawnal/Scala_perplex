

def scanLeft[A,B](l: List[A], z : B, f : (B,A) => B) : List[B] = {
    var res : ListBuffer[B] = new ListBuffer[B]()
    var acc = z
    for(i <- l){
        acc = f(acc, i)
        res.append(acc)
    }
    return res.toList
}

val l = List(List(0,1,2,3), List(0,1,2)).flatten
val f = scanLeft[Int, Int](l, 0, _+_)

What is the value of f?
A List(0, 1, 3, 6,0,1,3)  
B 33
C List(List(0,1,3,6), List(0,1,3))
D List(0, 1, 3, 6, 6, 7, 9) <-