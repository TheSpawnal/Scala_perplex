
trait Comparable[A]{
    def compareTo(rhs: A) : Int
    def <(rhs: A) = compareTo(rhs)<0 
}
case class Point(x: Int, y: Int) extends Comparable[Point]{
    override def compareTo(rhs: Point): Int =if(x==rhs.x) y-rhs.y else x-rhs.x
}
case class CompBox[A<:Comparable[A]](c: A) extends Comparable[CompBox[A]]{
    override def compareTo(rhs: CompBox[A]): Int = c.compareTo(rhs.c)
}
def comp = {
    val b1 = CompBox(Point(2,3))
    val b2 = CompBox(Point(1,5))
    if(b1<b2) b1.compareTo(b2)
    else b2.compareTo(b1)
}

Value of comp?
 A-1 <-
 B 1
 C 2
 D-2