
def flatten[A](l : List[List[A]]) : List[A] = {
    var res = List[A]()
    for(e<-l) res = res ++ e
    res
}

Which of the following are equivalent to flatten? (multiple possible)

A:<-
def flatten1[A](l: List[List[A]]) = l.foldLeft(List[A]())(_ ++ _)

B:
def flatten2[A](l: List[List[A]]) = l.map(_.clone())

C:<-
def flatten3[A](l: List[List[A]]) = l.foldRight(List[A]())(_ ++ _)

D:<-
def flatten4[A](l: List[List[A]]) = l.fold(List[A]())(_ ++ _)

E:
def flatten5[A](l: List[List[A]]) = l.map(_.map(_.raise))
