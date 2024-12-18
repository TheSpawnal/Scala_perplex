
sealed abstract class OrString[+B] {
    def flatMap[C](f : B => OrString[C]): OrString[C] = 
        this match {
            case Right(x) => f(x)
            case Left(y) => Left(y)
        }
}

case class Left[A](l: String) extends OrString[Nothing]
case class Right[B](r: B) extends OrString[B]

val x = Right(3).flatMap(x => Right(x+2))
val y = x.flatMap(x => if(x == 10) Right(6) else Left("No"))

 What is the value of y?
 A Right(Left("No"))
 B Right(Right(Left("No")))
 C Right(6)
 D Left("No") <-