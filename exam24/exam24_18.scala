

sealed abstract class Exp {
    def simplify : Exp = this
}

case class Const(n: Int) extends Exp
case class Var(s: String) extends Exp
case class Plus(l: Exp, r : Exp) extends Exp {
    override def simplify: Exp = 
        (l.simplify, r.simplify) match{
            case(Const(0), rs) => rs
            case(ls, rs) => Plus(ls, rs)
        }
}
//(0+ (0+x)) + (y + 0)
val p = Plus(Plus(Const(0), Plus(Const(0), Var("x"))), Plus(Var("y"), Const(0)))

def main(args: Array[String]): Unit= {
    println(p.simplify)
}


what does main print?

Plus(Plus(Const(0), Var("x")), Plus(Var("y"), Const(0)))

Plus(Var("x"), Plus(Var("y"), Const(0))

Plus(Var("x"), Var("y"))

Plus(Plus(Const(0), Plus(Const(0), Var("x"))), Plus(Var("y"), Const(0)))

    (B)

