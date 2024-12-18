
def bb[A,B](f : A => B, l : List[A]) : List[B] = {
    l match {
        case head :: tail => f(head) :: bb(f,tail)
        case Nil => Nil
    }
}

what is the name of this higher-order function?
recall that h :: t means make a list where h is the head(first element)
and t is the tail (the rest of the list). Nil is the empty ​list.

Map <-

Exists

Fold

FoldLeft

FlatMap