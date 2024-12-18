
abstract class Expression
case class Var(x: String) extends Expression
case class Const(n: Int) extends Expression
case class Op(l: Expression, op: String, r: Expression) extends Expression

def simplify(exp: Expression) : Expression = 
    exp match {
        case Op(l, "+", Const(0)) => simplify(l)
        case Op(Const(0), "*", r) => Const(0)
        case Op(l,op,r) => Op(simplify(l), op, simplify(r))
        case x => x
    }

    val v : Expression = simplify(Op(Var("x"), "+",Op(Const(0), "*", Var("y"))))

 What is the value of v?
 A Var("x")
 B Op(Var("x"), "+", Const(0)) <-
 C Op(Var("x"),"+",Op(Const(0),"*", Var("y"))
 D Op(Const(0),"*",Var(y))