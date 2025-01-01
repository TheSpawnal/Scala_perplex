sealed class OpTree[+A] {
  def eval: A = 
    this match {
      case Leaf(x) => x 
      case Op(l,op,r) => op(l.eval,r.eval)
    }

  def rightAssoc: OpTree[A] = 
    this match {
      case Op(Op(x,op,y),op2,z) => Op(x,op,Op(y,op2,z))
      case x => x
    }
}

case class Leaf[A](x: A) extends OpTree[A]
case class Op[A](l: OpTree[A], op: (A,A) => A, r: OpTree[A]) 
  extends OpTree[A]

object Pattern {
  def min(a: Int, b: Int): Int = a - b
  val v: OpTree[Int] = 
    Op(Op(Op(Leaf(15),min,Leaf(9)),min,Leaf(7)),min,Leaf(5))
  val x = v.rightAssoc.eval
}

 What is the value Pattern.x?
 A-6
 B 18
 C 8
 D 4

(D)
