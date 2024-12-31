sealed class L[+A]
case object Nil extends L[Nothing]
case class Cons[A](head: A, tail: L[A]) extends L[A]

def vm(l: L[A], r: L[A]): L[A] = 
  (l, r) match {
    case (Cons(hl, tl), Cons(hr, tr)) => Cons(hl, Cons(hr, vm(tl,tr)))
    case _ => Nil
  }

What does the method vm do?
 A tail recursively alternates the elements of the ​given lists
 B non-tail recursively alternates the elements of the given lists
 C tail recursively appends the right list to the left list
 D non-tail recursively appends the right list to the left list

(B)
