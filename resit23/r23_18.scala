sealed abstract class Exp {
  def simplify: Exp
}

case class Const(n: Int) extends Exp {
  def simplify: Exp = this
}

case class Minus(l: Exp, r: Exp) extends Exp {
  def simplify: Exp = 
    this match {
      case Minus(l, Const(0)) => l.simplify
      case x => x
    }
}

val p = Minus(Const(0), Const(0))
val l = Minus(Const(0), Minus(Const(0),p)).simplify

 Given the above definitions, what the value of l?
 A Const(0)
 B Minus(Const(0), Minus(Const(0),Minus(Const(0),Const(0))))
 C Minus(Const(0), Const(0))
 D Minus(Const(0), Minus(Const(0),Const(0)))

(B)
