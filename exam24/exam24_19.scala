

sealed class IntList {
    def append(r: IntList): IntList = 
        this match {
            case Cons(h, t) => Cons(h, t.append(r))
            case Nl => r
        }

    def r: IntList = 
        this match {
            case Cons(h, t) => t.r.append(Cons(h, Nl))
            case Nl => Nl
        }
}

case class Cons(h: Int, t: IntList) extends IntList
case object Nl extends IntList

def main(args: Array[String]) = {
    println(Cons(1, Cons(2, Cons(3,Nl))).r)
}

what does main print ? 

Cons(1, Cons(1,Cons(2,Cons(2,Cons(3,Cons(3, Nl))))))
Cons(3, Cons(2, Cons(1, Nl)))
Cons(2, Nl)
Cons(1, Cons(2, Cons(3, Nl)))


(B)
