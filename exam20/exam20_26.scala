

sealed class Either[A, B]{
    def combine
        (f: (A,A) =>A)(g: (B, B) => B)(rhs: Either[A, B]) : Option[Either[A,B]]=(this, rhs) match {
            case (Left(x), Left(y)) => Some(Left(f(x, y)))
            case (Right(x), Right(y)) => Some(Right(g(x, y)))
            case _ => None
        }
}

case class Left[A, B] (x: A) extends Either[A, B]
case class Right[A,B](y: B) extends Either[A, B]

val m = Left[Double,Double](9.0).combine(_ + _)(_ * _)(Right(2.0))

 A Some(Left(11.0))
 B Some(Right(18.0))
 C Some(Left(18.0))
 D Some(Right(11.0))
 E None <-