
sealed abstract class Exp{def simplify: Exp}
case class Const(n: Int) extends Exp { def simplify: Exp = this}

case class Mul(l: Exp, r: Exp) extends Exp {
    def simplify: Exp = {
        val s = this match {
            case Mul(l, Const(1)) => l.simplify
            case Mul(l, r) => Mul(l.simplify, r.simplify)
        }
        if(s == this) this else s.simplify
    }
}
val l = Mul(Const(1), Mul(Const(1), Mul(Const(1), Const(1)))).simplify

 What is the value of l?
 A Mul(Const(1), Mul(Const(1),Mul(Const(1),Const(1))))
 B Const(1) 
 C Mul(Const(1), Mul(Const(1),Const(1)))
 D Mul(Const(1), Const(1))


(B)
