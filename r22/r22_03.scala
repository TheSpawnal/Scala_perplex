sealed abstract class Expression {
    def simplify: Expression = 
        this match {
            case Plus(Const(0), r) => r.simplify
            case Plus(l, r) => {
                val res = Plus(l.simplify, r.simplify)
                if (res != this) res.simplify else res
            }
            case Const(n) => Const(n)
        }
}

case class Const(n: Int) extends Expression
case class Plus(l: Expression, r: Expression) extends Expression

val l = Plus(Plus(Plus(Const(0),Const(0)),Const(0)), Const(0)).simplify


 What is the value of l?
 A Plus(Plus(Const(0),Const(0)), Plus(Const(0),Const(0)))
 B Plus(Const(0),Const(0))
 C Const(0)
 D Plus(Const(0), Plus(Const(0),Const(0)))

(C)
