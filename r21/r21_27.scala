

sealed abstract class Maybe[+A] {
  def map[B](f: A => B): Maybe[B] = this match {
    case Some(x) => Some(f(x))
    case None => None
  }
  def zp[B](that: Maybe[B]): Maybe[(A,B)]
}

case object None extends Maybe[Nothing] {
  override def zp[B](that: Maybe[B]): Maybe[(Nothing, B)] = None
}

case class Some[+A](x: A) extends Maybe[A] {
  override def zp[B](that: Maybe[B]): Maybe[(A, B)] = that match {
    case Some(y) => Some(x,y)
    case None => None
  }
}

object Options {
  def divOption(l: Int, r: Int): Maybe[Int] = 
    if(r == 0) None
    else Some(l / r)

  val x = divOption(3,2).map(divOption(_,2))
           .zp(divOption(10,5).map(divOption(10,_)))
}


 What is the value of x?
 A Some((0,5))
 B Some(Some((0,5))
 C Some((Some(0),Some(5)))
 D None
 E Some(None,Some(5))

 (C)