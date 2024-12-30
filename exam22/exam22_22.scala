
def zw[A,B,C](f: (A,B) => C) : (List[A], List[B]) => List[C] = {
    def zwl(l: List[A], r : List[B]) : List[C] = {
        (l, r) match{
            case(hl :: tl, hr :: tr) => f(hl, hr) :: zwl(tl, tr)
            case _ => List()
        }
    }
    zwl
}

val m = List[Int] = zw((_: Int) - (_ : Int)) (List(3,2,1), List(1,2,3,4))

 What is the value of m?

 A List(1,2,3,4)
 B List(2,0,-2,-4)
 C List(2,0,-2) 
 D List(3,2,1)
 E List(-2,0,2)
 F List(-2,0,2,4)

(C)
