

sealed abstract class Maybe[+A] {
    def flatMap[B](f : A => Maybe[B]) : Maybe[B]
    def zipped[B](that : Maybe[B]) : Maybe[(A,B)] = 
        (this, that) match {
            case(Some(x), Some(y)) => Some((x, y))
            case _ => None
        }
}
case object None extends Maybe[Nothing]{
    override def flatMap[B](f: Nothing => Maybe[B]): Maybe[B] = this
}

case class Some[+A](x: A) extends Maybe[A]{
    override def flatMap[B](f: A => Maybe[B]) : Maybe[B] = f(x)
}

object Options{
    def divOption(l : Int, r: Int) : Maybe[Int] =
        if(r == 0) None
        else Some(l/r)
    
    val x = divOption(3,2).flatMap(divOption(_,2)).zipped(divOption(10,5).flatMap(divOption(10,_)))
}

What is the value of x?
 A Some((0,5)) <-
 B Some(Some((0,5))
 C Some((Some(0),Some(5)))
 D None
 E Some(None,Some(5))