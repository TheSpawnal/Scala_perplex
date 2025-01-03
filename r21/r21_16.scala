

sealed class Exp
case class Op(l: Exp, op: String, r: Exp) extends Exp
case class Num(n: Int) extends Exp

object Pattern {
  def simplify(e: Exp): Exp = 
    e match {
      case Op(x, "+", Num(0)) => x
      case Op(x,op,y) => Op(simplify(x), op, simplify(y))
      case x => x
    }

  val z0: Exp = Num(0)
  def plus(l: Exp, r: Exp): Exp = Op(l,"+",r)
  val x: Exp = simplify(plus(z0,plus(z0,plus(z0,z0))))
}


What is the value of x?
 A Op(Num(0),+,Op(Num(0),+,Op(Num(0),+,Num(0))))
 B Op(Num(0),+,Op(Num(0),+,Num(0)))
 C Op(Num(0),+,Num(0))
 D Op(Num(0))
 
 