

sealed class L[+A] {
    def gvl: Option[A] =
        this match {
            case Nil => None
            case Cons(h, Nil) => Some(h)
            case Cons(h, t) => t.gvl
        }
}

case object Nil extends L[Nothing]

case class Cons[A](head: A, tail: L[A]) extends L[A]

 What does the method gvl do?

 A return the last element of a list 
 B reverse the list
 C append two lists
 D always return None


(A)
