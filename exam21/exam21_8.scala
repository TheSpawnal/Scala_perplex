

abstract class Base {
    def value : Int
    def increase(y: Int) : Unit
}

class A(var x: Int) extends Base {
    override def value: Int = x
    override def increase(y: Int): Unit = x += y
}
class B(var b: Boolean) extends Base {
    def this() = this(false)
    override def value : Int = if(b) 3 else 5
    override def increase(y: Int) : Unit = b = !b
}

object Identity{
    def main(args : Array[String]) : Unit = {
        var arr = new Array[Base](8)
        val b = new B()
        for( i< <- arr.indices) {
            arr(i) = if(i % 2 == 0) new A(5) else b
        }
        for (a <- arr) a.increase(1)
        println(arr(6).value+arr(7).value)
    }
}

What does Identity.main print?
 A 11 
 B 14
 C 9
 D Compile error: Array[Base] cannot hold values of type A (or B).

