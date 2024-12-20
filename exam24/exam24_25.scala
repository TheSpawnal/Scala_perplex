

def unfold[A,B](i : A)(f: A=> Option[(A,B)]): List[B]=
    f(i) match{
        case SOme((iz, h)) => h :: unfold(iz)(f)
        case None => Nil
    }

case class State(pprev: Int, prev: Int, count: Int)

def nxt(s: State): Option[(State, Int)]={
    if(s.count == 0) None
    else {
        val cur = s.prev + s.pprev
        val ns = State(s.pre, cur, s.count -1)
        Some(ns, cur)
    }
}
val p = unfold(State(0,1,5))(nxt)

what is the value of p?
Recall that h :: t means make a list where h is the head (first element) 
and t is the tail (the rest of the list). Nil is the empty ​list

List(5,4,3,2,1)
List(5,6,11,17)
List(1,2,3,5,8) 
List(1,2,3,4,5)
List((1,2,3))


(C)
