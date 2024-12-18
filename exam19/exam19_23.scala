

trait Springy

case class JumpBox(c : Springy)
case class GumpBox[A<: Springy](c: A)

class Kangaroo extends Springy

def m = {
    val k = new Kangaroo
    val j = JumpBox(k)
    val g = GumpBox(k)
    (j.c, g.c)
}

Most specific type of m?
 A (Springy,Springy)
 B (Kangaroo,Kangaroo)
 C (Springy, Kangaroo) <-
 D (Any, Springy)