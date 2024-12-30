

var x = 0

def filter[A](l: List[A], f : A => Boolean) : List[A] = {
    val res = new ListBuffer[A]()
    for(e <- l) { if(f(e)) res.addOne(e)}
    return res.toList
}

def f(a: Int) : Boolean = { x +=1 ; x > 2}
def g(a: Int) : Boolean = { x -= 1; x > 2}
val l : List[Int] = List(1,2,3,4,5)

val v = (filter(filter(l,f),g).length,filter(l,(x:Int)=>f(x) && g(x)).length)

What is the value of v?
 A (2,0) 
 B (2,2)
 C (0,0)
 D (0,2)
 E (5,5)

(A)

