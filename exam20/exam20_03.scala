
trait iterator[+A] {
    def hasNext :  Boolean
    def next() : A 
}

trait Iterable[+A] { def iterator: Iterable[A]}

class RangeIterator(var cur:Int, val step:Int, val end:Int) extends Iterator[Int]{
    def hasNext : Boolean = cur < end
    def next() : Int = {
        var res = cur ; cur += step; res
    }
}

case class MyRange(start:Int, step:Int, end:Int) extends Iterable[Int]{
    override def iterator : Iterator[Int] = new RangeIterator(start, step, end)
}

def v : Unit = {
    val r = MyRange(0, 2, 12)
    val it1 = r.iterator
    val it2 = r.iterator
    print(it1.next());print(it2.next());print(it2.next())
    print(it2.next());print(it2.next());print(it1.next())
}

 What does v print?
 A 001231
 B 002462 <- 
 C 000000
 D 0246810