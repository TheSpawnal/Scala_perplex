
trait Comparable[A]{
    def compareTo(rhs: A) : Int
    def <(rhs: A) : Boolean = this.compare(rhs) < 0
}

case class Rational(n: Int, d: Int) extends Comparable[Rational]{
    override def compareTo(rhs : Rational) : Int = n * rhs.d - rhs.n * d
}

case class Point(x: Int, y: Int) extends Comparable[Point]{
    override def compareTo(rhs : Point) : Int = if(x == rhs.x) y - rhs.y else x - rhs.x
}

case class ComTuple[A <: Comparable[A], B <: Comparable[B]] (a: A, b: B) extends Comparable[ComTuple[A,B]]{
    override def compareTo(rhs: ComTuple[A,B]): Int = {
        val ac = a.compareTo(rhs.a)
        if(ac != 0) ac else b.compareTo(rhs.b)
    }
}

def v = ComTuple(Rational(2,3), Point(2,3)).compareTo(ComTuple(Rational(1,4), Point(5,1)))


Which of the following is true:
 A v = -5
 B v = 5 <-
 C will give type error: CompTuple does implement trait Comparable[Rational,Point]
 D will give type error: Expected Rational, but got Point
 E v = 0
