sealed abstract class OrString[+B] {
  def flatMap[C](f: B => OrString[C]): OrString[C]
}

case class Left[A](l: A) extends OrString[Nothing] {
  def flatMap[C](f: Nothing => OrString[C]): OrString[C] = this
}

case class Right[B](r: B) extends OrString[B] {
  def flatMap[C](f: B => OrString[C]): OrString[C] = f(r)
}

val x = Right(5).flatMap(x => Right(x * 2)).
        flatMap(x => if(x == 10) Right(3) else Left("No"))


What is the value of x?

 A Right(Right(3))
 B Right(Right(Right(3)))
 C Left("No")
 D Right(3)
 E Right(Right(Left("No")))


(D)
